
package com.Tramite.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TipoUsuarioBD {
    Conexion nueva;
    public TipoUsuarioBD (){
        nueva= new Conexion("bd_tramite_doc_coas","root","");
    }
    
    public ArrayList<String> seleccionarTiposNombre(){
        ArrayList<String> tipos=new ArrayList<String>();
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT nombretipusu FROM tipo_usuario";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            rs= psConsultar.executeQuery();
            
            while (rs.next()){
                tipos.add(rs.getString(1));
            }
            return tipos;
       }catch (Exception ex) {
            return null;
       }
    }
    
    public int seleccCodTipo(String tipo){
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT codtipusu FROM tipo_usuario WHERE nombretipusu=?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,tipo);
            rs= psConsultar.executeQuery();
            if(rs.next())
            {
                return rs.getInt(1);
            }
            return -1;
       }catch (Exception ex) {
            return -1;
       }
    }
    
    public static void main (String [] args){
        TipoUsuarioBD log = new TipoUsuarioBD();
        System.out.print(log.seleccCodTipo("gerencia"));
    }
}