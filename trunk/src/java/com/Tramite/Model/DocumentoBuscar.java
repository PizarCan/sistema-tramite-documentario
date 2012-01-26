/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tramite.Model;

import com.Tramite.Conexion.DocumentoBuscarBD;
import java.util.ArrayList;

/**
 *
 * @author lizzy
 */
public class DocumentoBuscar {
 
  String fecTra;
  int codDoc;
  String  asuntoDoc;
int codTra;
String descripcionTra;
String nombreEst;

  
  
  
    public DocumentoBuscar(String fecTra, int codDoc, String asuntoDoc, int codTra, String descripcionTra, String nombreEst) {
        this.fecTra = fecTra;
        this.codDoc = codDoc;
        this.asuntoDoc = asuntoDoc;
        this.codTra = codTra;
        this.descripcionTra = descripcionTra;
        this.nombreEst = nombreEst;
    }



    public void setAsuntoDoc(String asuntoDoc) {
        this.asuntoDoc = asuntoDoc;
    }

    public void setCodDoc(int codDoc) {
        this.codDoc = codDoc;
    }

    public void setCodTra(int codTra) {
        this.codTra = codTra;
    }

    public void setDescripcionTra(String descripcionTra) {
        this.descripcionTra = descripcionTra;
    }

    public void setFecTra(String fecTra) {
        this.fecTra = fecTra;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    @Override
    public String toString() {
        return "<td>" + fecTra + "</td><td>" + codDoc + "</td><td>" + asuntoDoc +"</td><td>" + codTra + "</td><td>" + descripcionTra + "</td><td>" + nombreEst + "</td>";
    }

    public DocumentoBuscar() {
    }


       public ArrayList<DocumentoBuscar> conseguirConsulta(String codigo)
    {  
   
       DocumentoBuscarBD consulta = new DocumentoBuscarBD();
        
    return consulta.consultarDocumentoH(codigo);
        
        
   
    }
  
    
}
