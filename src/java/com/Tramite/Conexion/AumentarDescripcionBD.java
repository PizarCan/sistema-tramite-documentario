
package com.Tramite.Conexion;

import com.Tramite.Model.Transaccion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AumentarDescripcionBD {
    Conexion nueva;
    
    public AumentarDescripcionBD (){
        nueva= new Conexion("bd_tramite_doc_coas","root","");
    }
    
    public Transaccion conseguirUltimaDescripcion(int codigo){
        Transaccion tran =null;
        int codigoT=-1 ;
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT max(codTra) FROM transaccion where codDoc=?;";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1,codigo);
            rs= psConsultar.executeQuery();
            
            if (rs.next()){
               codigoT = rs.getInt(1);
            }
            rs = null;
            consultaBuscar="SELECT * FROM transaccion t where codTRa =?";
            psConsultar =nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1,codigoT);
            rs = psConsultar.executeQuery();
            if (rs.next())
            {
                tran = new Transaccion (rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getString(8));
            }
            
            
            
        }catch (Exception ex) {
            return null;
       }
        return tran;
    }
    
    public int seleccCodArea(String area){
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT max(codTra) FROM transaccion where codDoc=?";
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
