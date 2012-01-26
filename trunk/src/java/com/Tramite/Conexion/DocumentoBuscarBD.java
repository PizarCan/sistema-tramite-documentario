package com.Tramite.Conexion;

import com.Tramite.Model.DocumentoBuscar;
import com.Tramite.Model.DocumentoEntrada;
import com.Tramite.Model.DocumentoHistorial;
import com.Tramite.Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author WILFREDO
 */
public class DocumentoBuscarBD {
    Conexion nueva;
    
    
    public DocumentoBuscarBD() {
        nueva = new Conexion("bd_tramite_doc_coas","root","");
    }
    public ArrayList <DocumentoBuscar> consultarDocumentoH(String codigo)
    {
        ArrayList <DocumentoBuscar> documentos = new ArrayList <DocumentoBuscar>();
   
       try 
       {
            
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT t.fecTra,t.codDoc,d.asuntoDoc,max(t.codTra),t.descripcionTra,e.nombreEst FROM `documento` d, `transaccion` t,`estado` e WHERE  d.codDoc=t.codDoc and t.codEst=e.codEst and (d.asuntoDoc like ? or d.remitenteDoc like ?) group by t.codDoc having max(t.codTra)order by t.codTra;";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,"%"+codigo+"%");
            psConsultar.setString(2,"%"+codigo+"%");
            rs= psConsultar.executeQuery();
            while (rs.next())
            {
               documentos.add(new DocumentoBuscar(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6)));
            }
       }     
        catch (Exception ex) {
            return null;
            
        }
        
            return documentos;
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
