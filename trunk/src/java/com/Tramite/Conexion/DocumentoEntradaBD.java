/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tramite.Conexion;

import com.Tramite.Model.DocumentoEntrada;
import com.Tramite.Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author WILFREDO
 */
public class DocumentoEntradaBD {
    Conexion nueva;
    
    public int conseguirCodigoUsuario(Usuario u) 
    {
        
       try 
       {
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT codUsu FROM usuario Where nombreUsu=? and apellidoUsu=?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,u.getNombre());
            psConsultar.setString(2,u.getApellido());
            rs= psConsultar.executeQuery();
            while (rs.next())
            {
                    return rs.getInt(1);
            }
       }     
        catch (Exception ex) {
           return -1;
            
        }
        return -1;
    }

    public DocumentoEntradaBD() {
        nueva = new Conexion("bd_tramite_doc_coas","root","");
    }
    public ArrayList <DocumentoEntrada> consultarDocumento(int codigo)
    {
        ArrayList <DocumentoEntrada> documentos = new ArrayList <DocumentoEntrada>();
   
       try 
       {
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT transaccion.codRec,transaccion.codDoc,asuntoDoc,nombreUsu,ApellidoUsu,area.nombreAre,estado.nombreEst,fecTra from transaccion,documento,usuario,Estado,Area "
                    + "where area.codAre=usuario.codAre and estado.codEst=transaccion.codEst and documento.coddoc=transaccion.coddoc and estado.nombreEst!='iniciado' and transaccion.codusu=usuario.codusu and transaccion.destinoAre=? ";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1,codigo);
            rs= psConsultar.executeQuery();
            while (rs.next())
            {
               documentos.add(new DocumentoEntrada(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)));
            }
       }     
        catch (Exception ex) {
            return null;
            
        }
        
            return documentos;
    }
    
    
    public ArrayList <DocumentoEntrada> consultarDocumentoAD(int codigo)
    {
        ArrayList <DocumentoEntrada> documentos = new ArrayList <DocumentoEntrada>();
   
       try 
       {
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT transaccion.codRec,transaccion.codDoc,asuntoDoc,nombreUsu,ApellidoUsu,area.nombreAre,estado.nombreEst,fecTra from transaccion,documento,usuario,Estado,Area "
                    + "where area.codAre=usuario.codAre and estado.codEst=transaccion.codEst and documento.coddoc=transaccion.coddoc and  transaccion.codusu=usuario.codusu and transaccion.destinoAre=?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1,codigo);
            rs= psConsultar.executeQuery();
            while (rs.next())
            {
               documentos.add(new DocumentoEntrada(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)));
            }
       }     
        catch (Exception ex) {
            return null;
            
        }
        
            return documentos;
    }
    
    public ArrayList <DocumentoEntrada> consultarDocumentoADI(int codigo)
    {
       ArrayList <DocumentoEntrada> documentos = new ArrayList <DocumentoEntrada>();
   
       try 
       {
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT transaccion.codRec,transaccion.codDoc,asuntoDoc,nombreUsu,ApellidoUsu,area.nombreAre,estado.nombreEst,fecTra from transaccion,documento,usuario,Estado,Area "
                    + "where area.codAre=usuario.codAre and estado.codEst=transaccion.codEst and documento.coddoc=transaccion.coddoc and estado.nombreEst='iniciado' and transaccion.codusu=usuario.codusu and transaccion.destinoAre=? ";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1,codigo);
            rs= psConsultar.executeQuery();
            while (rs.next())
            {
               documentos.add(new DocumentoEntrada(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)));
            }
       }     
        catch (Exception ex) {
            return null;
            
        }
        
            return documentos;
    }
    
    
     public int conseguirCodigoAreaUsuario(Usuario u) 
    {
        
       try 
       {
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT codAre FROM usuario Where nombreUsu=? and apellidoUsu=?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,u.getNombre());
            psConsultar.setString(2,u.getApellido());
            rs= psConsultar.executeQuery();
            while (rs.next())
            {
                    return rs.getInt(1);
            }
       }     
        catch (Exception ex) {
           return -1;
            
        }
        return -1;
    }
    
         public static void main (String [] args)
    {       
            DocumentoEntradaBD log = new DocumentoEntradaBD();
            ArrayList<DocumentoEntrada> nuevo =log.consultarDocumentoADI(1);
            for (int i = 0;i<nuevo.size();i++)
            {
                System.out.print(nuevo.get(i).getNombreUsu()+"  ");
                System.out.println(nuevo.get(i).getAsuntoDoc());
                
            }
            
    }
    
}
