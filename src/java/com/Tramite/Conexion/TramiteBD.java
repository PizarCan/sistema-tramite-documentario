/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tramite.Conexion;

import com.Tramite.Model.Transaccion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author WILFREDO
 */
public class TramiteBD {

    Conexion nueva;

    public TramiteBD() {
        nueva = new Conexion("bd_tramite_doc_coas", "root", "");
    }

    public int buscarMaxID() {
        try {
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar = "select max(codtra) from transaccion";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            rs = psConsultar.executeQuery();
            while (rs.next()) {
                return rs.getInt(1) + 1;
            }
        } catch (Exception ex) {
            return -1;
        }
        return -1;
    }
    
    

    public int buscarCodEstado(String nombreE) {
        try {
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar = "select codest from estado where nombreEST=?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1, nombreE);
            rs = psConsultar.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            return -1;
        }
        return -1;
    }

    public int buscasCodArea(String nombreA) {
        try {
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar = "select codAre from area where nombreAre =?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1, nombreA);
            rs = psConsultar.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            return -1;
        }
        return -1;
    }

    public String conseguirEstado(int est) {
        try {
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar = "SELECT nombreEst FROM estado where codEst =?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1, est);
            rs = psConsultar.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception ex) {
            return null;
        }
        return null;
    }

    public String conseguirDestino(int dest) {
        try {
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar = "SELECT nombreAre FROM area where codAre =?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1, dest);
            rs = psConsultar.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception ex) {
            return null;
        }
        return null;
    }
    public int conseguirCuentaTramite (int codigoDT)
    {
        try {
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar = "select count(codTra) from transaccion where codDoc =?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1, codigoDT);
            rs = psConsultar.executeQuery();
            while (rs.next()) {
                return rs.getInt(1)+1;
            }
        } catch (Exception ex) {
            return -1;
        }
        return -1;
    }
    public int conseguirCodigoTranAnt (int cuentaAnt)
    {
        try {
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar = "select codTra from transaccion where cuentaTra =?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1, cuentaAnt);
            rs = psConsultar.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            return -1;
        }
        return -1;
    }
    
     public void actualizarTransaccionAnterior (int codigoTran)
    {
        try {
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar = "update transaccion set codRec = 2 where codTra=?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1, codigoTran);
            psConsultar.executeUpdate();
            
        } catch (Exception ex) {
            
        }
        
    }
    
    
    
    
    public String conseguirNombre(int codUsu) {
        try {
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar = "SELECT nombreUsu,apellidoUsu FROM usuario where codusu=?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setInt(1, codUsu);
            rs = psConsultar.executeQuery();
            while (rs.next()) {
                return rs.getString(1)+" "+rs.getString(2);
            }
        } catch (Exception ex) {
            return null;
        }
        return null;
    }

    public int insertarTransaccion(Transaccion nuevat) {


        try {
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaInsertar = "INSERT into transaccion values (?,?,?,?,?,?,?,?,?)";
            psConsultar = nueva.getConnection().prepareStatement(consultaInsertar);
            psConsultar.setInt(1, nuevat.getCodTra());
            psConsultar.setInt(2, nuevat.getCodRec());
            psConsultar.setInt(3, nuevat.getCodUsu());
            psConsultar.setInt(4, nuevat.getCodDestino());
            psConsultar.setInt(5, nuevat.getCodEst());
            psConsultar.setString(6, nuevat.getFecha());
            psConsultar.setInt(7, nuevat.getCodDoc());
            psConsultar.setString(8, nuevat.getDesTra());
            psConsultar.setInt(9, nuevat.getCuenta());

            int res = psConsultar.executeUpdate();
            String consultaTransa = "";
            return res;
        } catch (Exception ex) {
            return -1;
        }

    }

    public static void main(String[] args) {
        Transaccion td = new Transaccion(55, 2, 1, 2, 2, "11/10/2012", 1, "ssss");
        TramiteBD log = new TramiteBD();
        log.insertarTransaccion(td);
    }
}
