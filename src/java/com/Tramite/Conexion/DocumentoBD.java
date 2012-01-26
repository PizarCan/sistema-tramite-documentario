/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tramite.Conexion;

import com.Tramite.Model.Documento;
import com.Tramite.Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author WILFREDO
 */
public class DocumentoBD {
     Conexion nueva;
     public DocumentoBD (){
        nueva= new Conexion("bd_tramite_doc_coas","root","");
    }
    public ArrayList<String> seleccionarTipoDoc(){
        ArrayList<String> tipodocs=new ArrayList<String>();
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT nombretipdoc FROM tipo_documento";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            rs= psConsultar.executeQuery();
            
            while (rs.next()){
                tipodocs.add(rs.getString(1));
            }
            return tipodocs;
        }catch (Exception ex) {
            return null;
       }
    }
    
     public ArrayList<String> seleccionarEstadoDoc(){
        ArrayList<String> tipodocs=new ArrayList<String>();
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT nombreEst FROM estado where codEst>2";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            rs= psConsultar.executeQuery();
            
            while (rs.next()){
                tipodocs.add(rs.getString(1));
            }
            return tipodocs;
        }catch (Exception ex) {
            return null;
       }
    }
    
       public ArrayList<String> seleccionarAreasDoc(){
        ArrayList<String> tipodocs=new ArrayList<String>();
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT nombreAre FROM Area";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            rs= psConsultar.executeQuery();
            
            while (rs.next()){
                tipodocs.add(rs.getString(1));
            }
            return tipodocs;
        }catch (Exception ex) {
            return null;
       }
    }
       
       
         public String conseguirAsunto( int codigod)
         {
        
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT asuntodoc FROM documento where codDoc =?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1, codigod);
            rs= psConsultar.executeQuery();
            
            if (rs.next()){
                return rs.getString(1);
            }
            return null;
        }catch (Exception ex) {
            return null;
       }
    }
       
       
       
     
     
    public ArrayList<Documento> listarDocumentos(int codigo)
    {
        
        ArrayList <Documento> documentos = new ArrayList <Documento>();
   
       try 
       {
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar=" SELECT t.codDoc,d.asuntoDoc,t.fecTra,max(t.codTra),t.descripcionTra,e.nombreEst,a.nombreAre  "
                    + "FROM documento d, transaccion t,estado e,usuario u,area a  "
                    + "WHERE  d.codDoc=t.codDoc and t.codEst=e.codEst and t.codUsu=u.codUsu  and u.codAre=a.codAre and a.codAre =? "
                    + " group by t.codDoc having max(t.codTra)order by t.codTra ";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1,codigo);
            rs= psConsultar.executeQuery();
            while (rs.next())
            {
               documentos.add(new Documento(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7)));
            }
       }     
        catch (Exception ex) {
            return null;
            
        }
        
            return documentos;
       
    }
    
    
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
    
    
}
