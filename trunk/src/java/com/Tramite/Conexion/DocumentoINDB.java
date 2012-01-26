/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tramite.Conexion;

import com.Tramite.Model.DocumentoIn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
@author GS&C - Karen Morales Zegarra
 * @version 2.0
 * @date 
 */
public class DocumentoINDB {
     Conexion nueva;
     public DocumentoINDB (){
        nueva= new Conexion("bd_tramite_doc_coas","root","");
    }
     
    public int ingresarDocu(DocumentoIn in)
    {
        
         
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaInsertar="INSERT into documento values (?,?,?,?,?,?,?)";
            psConsultar = nueva.getConnection().prepareStatement(consultaInsertar);
            psConsultar.setInt(1,in.getCodDoc());
            psConsultar.setString(2,in.getAsuntoDoc());
            psConsultar.setString(3,in.getRemitente());
            psConsultar.setString(4,in.getFechaInicio());
            psConsultar.setString(5,in.getDestinoDoc());
            psConsultar.setInt(6,in.getCodTipoDoc());
            psConsultar.setString(7,in.getDescripcionDoc());

            int res = psConsultar.executeUpdate();
            String consultaTransa ="";
            return res;
       }
        catch (Exception ex) {
           return -1;  
       }
    
        
        
        
        
    }
    public int buscarMaxID(){
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="select max(codDoc) from documento";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            rs= psConsultar.executeQuery();
            while (rs.next()){
                return rs.getInt(1)+1;
            }
        }     
        catch (Exception ex) {
            return -1;  
        }
        return -1;
    }
    
    public int buscarcodigotipoDoc(String a){
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="select codTipDoc from tipo_documento where nombreTipDoc =?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,a);
            rs= psConsultar.executeQuery();
            while (rs.next()){
                return rs.getInt(1);
            }
        }     
        catch (Exception ex) {
            return -1;  
        }
        return -1;
    }
    
    
    
}
