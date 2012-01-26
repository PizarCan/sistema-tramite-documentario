/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tramite.Conexion;

import com.Tramite.Model.DocumentoSalida;
import com.Tramite.Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author WILFREDO
 */
public class DocumentoSalidaBD {
    
     Conexion nueva;
     public DocumentoSalidaBD()
     {
         nueva = new Conexion("bd_tramite_doc_coas","root","");
     }
    public int conseguirCodigoUsuarioS(Usuario u) 
    {
        
       try 
       {
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT codUsu from usuario Where nombreUsu=? and apellidoUsu=?";
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
    
     public ArrayList <DocumentoSalida> consultarDocumentoSa(int codigoAreaUsuario)
    {
        ArrayList <DocumentoSalida> documentos = new ArrayList <DocumentoSalida>();
   
       try 
       {
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT  transaccion.codDoc, transaccion.codRec,usuario.nombreUsu,usuario.apellidoUsu,asuntoDoc,nombreAre,estado.nombreEst,fecTra from transaccion,documento,usuario,Estado,Area "
                    + "where area.codAre=usuario.codAre and estado.nombreEst !='iniciado' and estado.codEst=transaccion.codEst and documento.coddoc=transaccion.coddoc and transaccion.codusu=usuario.codusu and usuario.codAre=? "
                    + "group by (transaccion.codDoc)";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1,codigoAreaUsuario);
            rs= psConsultar.executeQuery();
            while (rs.next())
            {
               DocumentoSalida nuevodoc =new DocumentoSalida(rs.getInt(1),rs.getInt(2),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
               nuevodoc.setUsuario(rs.getString(3)+" "+rs.getString(4));
               documentos.add(nuevodoc);
            }
       }     
        catch (Exception ex) {
            return null;
            
        }
        
            return documentos;
    }
    public static void main (String [] args)
    {
            DocumentoSalidaBD log = new DocumentoSalidaBD();
            ArrayList<DocumentoSalida> nuevo =log.consultarDocumentoSa(2);
            for (int i = 0;i<nuevo.size();i++)
            {
                System.out.print(nuevo.get(i).getNombreAre()+"  ");
                System.out.println(nuevo.get(i).getNombreAre());
                
            }
            
    }
    
}
