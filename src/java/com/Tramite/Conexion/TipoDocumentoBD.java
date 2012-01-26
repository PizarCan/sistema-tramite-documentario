/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tramite.Conexion;

import com.Tramite.Model.TipoDocumento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author WILFREDO
 */
public class TipoDocumentoBD {
     Conexion nueva;
     
     public TipoDocumentoBD (){
        nueva= new Conexion("bd_tramite_doc_coas","root","");
    }
     
    public int insertarTipoDoc(TipoDocumento tdoc){
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaSelect ="select distinct nombreTipdoc from tipo_documento where tipo_documento.nombreTipDoc =?";
            psConsultar = nueva.getConnection().prepareStatement(consultaSelect);
            psConsultar.setString(1,tdoc.getNombre());
            rs= psConsultar.executeQuery();

            if (rs.next()){
                return -1;
            }
            else
            {
                String consultaInsertar="INSERT into TIPO_DOCUMENTO values (?,?,?)";
                psConsultar = nueva.getConnection().prepareStatement(consultaInsertar);
                psConsultar.setInt(1,tdoc.getTipocod());
                psConsultar.setString(2,tdoc.getNombre());
                psConsultar.setString(3,tdoc.getDescripcion());
            
            int res = psConsultar.executeUpdate();
            return res;
            }
       }catch (Exception ex) {
           return -1;  
       }
    }
    
    public int buscarMaxID(){
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="select max(codtipdoc) from tipo_documento";
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
    
    
    public static void main (String [] args){
        TipoDocumentoBD log = new TipoDocumentoBD();
        log.buscarMaxID();
    }
    
    
}

