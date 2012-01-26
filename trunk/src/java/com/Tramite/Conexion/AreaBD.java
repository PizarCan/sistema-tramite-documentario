
package com.Tramite.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AreaBD {
    Conexion nueva;
    
    public AreaBD (){
        nueva= new Conexion("bd_tramite_doc_coas","root","");
    }
    
    public ArrayList<String> seleccionarAreasNombre(){
        ArrayList<String> areas=new ArrayList<String>();
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT nombreare FROM area";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            rs= psConsultar.executeQuery();
            
            while (rs.next()){
                areas.add(rs.getString(1));
            }
            return areas;
        }catch (Exception ex) {
            return null;
       }
    }
    
    public int seleccCodArea(String area){
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT codare FROM area WHERE nombreare=?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,area);
            rs= psConsultar.executeQuery();
            if(rs.next())
                return rs.getInt(1);
            else
                return -1;
       }catch (Exception ex) {
            return -1;
       }
    }
    
//    public static void main (String [] args){
//        AreaBD log = new AreaBD();
//        log.seleccCodArea("gerencia");
//    }
}
