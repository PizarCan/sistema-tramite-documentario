/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tramite.Model;

import com.Tramite.Conexion.TramiteBD;

/**
 *
 * @author WILFREDO
 */
public class Transaccion {
    TramiteBD nueva;
    int codTra;
    int codRec;
    int codUsu;
    int codDestino;
    int codEst;
    String fecha;
    int codDoc;
    String desTra;

    public Transaccion(int codTra, int codRec, int codUsu, int codDestino, int codEst, String fecha, int codDoc, String desTra) {
        this.codTra = codTra;
        this.codRec = codRec;
        this.codUsu = codUsu;
        this.codDestino = codDestino;
        this.codEst = codEst;
        this.fecha = fecha;
        this.codDoc = codDoc;
        this.desTra = desTra;
        
    }
      
    public String conseguirNombre()
    {   nueva = new TramiteBD();
        return nueva.conseguirNombre(codUsu);
    }
    
    public String conseguirEstado()
    {   nueva = new TramiteBD();
        return nueva.conseguirEstado(codEst);
    }
    
    public String conseguirAreaDest()
    {   nueva = new TramiteBD();
        return nueva.conseguirDestino(codDestino);
    }
    @Override
    public String toString() {
        return "<td>"+codDoc+"</td><td>"+this.conseguirNombre()+"</td><td>"+this.conseguirAreaDest()+"</td><td>"+this.conseguirEstado()+"</td><td>"+fecha+"</td><td>"+desTra+"</td>";
    }
    
    
    public int getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(int codDestino) {
        this.codDestino = codDestino;
    }

    public int getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(int codDoc) {
        this.codDoc = codDoc;
    }

    public int getCodEst() {
        return codEst;
    }

    public void setCodEst(int codEst) {
        this.codEst = codEst;
    }

    public int getCodRec() {
        return codRec;
    }

    public void setCodRec(int codRec) {
        this.codRec = codRec;
    }

    public int getCodTra() {
        return codTra;
    }

    public void setCodTra(int codTra) {
        this.codTra = codTra;
    }

    public int getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(int codUsu) {
        this.codUsu = codUsu;
    }

    public String getDesTra() {
        return desTra;
    }

    public void setDesTra(String desTra) {
        this.desTra = desTra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void iniciarTransaccion ()
    {
        nueva = new TramiteBD();
        nueva.insertarTransaccion(this);
    }
//    public Transaccion conseguirAnteriorTransaccion ()
//    {
//        nueva = new TramiteBD();
//        nueva.conseguirUltimaTransaccion();
//    }
     public static void main (String [] args)
    {
        Transaccion td = new Transaccion(1,2,1,2,2,"11/10/2012",1,"ssss");
        td.iniciarTransaccion();
    }
}
