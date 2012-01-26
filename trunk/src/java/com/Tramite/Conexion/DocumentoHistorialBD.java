package com.Tramite.Conexion;

import com.Tramite.Model.Documento;
import com.Tramite.Model.DocumentoEntrada;
import com.Tramite.Model.DocumentoHistorial;
import com.Tramite.Model.DocumentoIn;
import com.Tramite.Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author WILFREDO
 */
public class DocumentoHistorialBD {
    Conexion nueva;
    
    
    public DocumentoHistorialBD() {
        nueva = new Conexion("bd_tramite_doc_coas","root","");
    }
    public ArrayList <DocumentoHistorial> consultarDocumentoH(int codigo)
    {
        ArrayList <DocumentoHistorial> documentos = new ArrayList <DocumentoHistorial>();
   
       try 
       {
            
            ResultSet rs = null;
            int cont =0;
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT codTra,descripcionTra,fecTra,nombreUsu,apellidoUsu,nombreEst, area.nombreAre FROM transaccion,usuario,estado,area where codDoc=? and usuario.codUsu=transaccion.codUsu and usuario.codAre = area.codAre and transaccion.codEst=estado.codEst ";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1,codigo);
            rs= psConsultar.executeQuery();
            while (rs.next())
            {
               documentos.add(new DocumentoHistorial(++cont,rs.getString(2),rs.getString(3),rs.getString(4)+" "+rs.getString(5),rs.getString(6),rs.getString(7)));
            }
       }     
        catch (Exception ex) {
            return null;
            
        }
        
            return documentos;
    }
     public String ConseguirAreaID(int codigo){
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="select nombreTipDoc from tipo_documento where codTipDoc = ?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1,codigo);
            rs= psConsultar.executeQuery();
            while (rs.next()){
                return rs.getString(1);
            }
        }     
        catch (Exception ex) {
            return null;  
        }
        return null;
    }
    
    
    
      public DocumentoIn consultarCaracteristicas(int codigo)
    {
        DocumentoIn respuesta = new DocumentoIn();
   
       try 
       {
            
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT * FROM documento where codDoc=?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1,codigo);
            rs= psConsultar.executeQuery();
            while (rs.next())
            {
               respuesta.setCodDoc(rs.getInt(1));
               respuesta.setAsuntoDoc(rs.getString(2));
               respuesta.setRemitente(rs.getString(3));
               respuesta.setFechaInicio(rs.getString(4));
               respuesta.setDestinoDoc(rs.getString(5));
               respuesta.setCodTipoDoc(rs.getInt(6));
               respuesta.setDescripcionDoc(rs.getString(7));
            }
       }     
        catch (Exception ex) {
            return null;
            
        }
        
            return respuesta;
    }
    
/*         public static void main (String [] args)
    {
            DocumentoBD log = new DocumentoBD();
            ArrayList<DocumentoEntrada> nuevo =log.consultarDocumento(2);
            for (int i = 0;i<nuevo.size();i++)
            {
                System.out.print(nuevo.get(i).getNombreUsu()+"  ");
                System.out.println(nuevo.get(i).getAsuntoDoc());
                
            }
            
    }
  */  
}
