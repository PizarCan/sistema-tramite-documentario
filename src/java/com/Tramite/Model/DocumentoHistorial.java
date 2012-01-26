/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tramite.Model;

import com.Tramite.Conexion.DocumentoHistorialBD;
import java.util.ArrayList;

/**
 *
 * @author 12345
 */
public class DocumentoHistorial {
    int codTra;
    String descripcionTra;
    String fecTra;
    String nomUsu;
    int codDoc;
    int codUsu;
    int codEst;
    String  Area;
    String nombreEst;
   int codigo;
   
    
    public DocumentoHistorial(int codTra, String descripcionTra, String fecTra, String nomUsu, String nombreEst,String Area) {
        this.codTra = codTra;
        this.descripcionTra = descripcionTra;
        this.fecTra = fecTra;
        this.nomUsu = nomUsu;
        this.nombreEst = nombreEst;
        this.Area = Area;
    }

    public DocumentoHistorial() {
    }
    
    
public int getCodDoc() {
        return codDoc;
    }

    public int getCodEst() {
        return codEst;
    }

    public int getCodTra() {
        return codTra;
    }

    public int getCodUsu() {
        return codUsu;
    }

    public String getDescripcionTra() {
        return descripcionTra;
    }

    public String getFecTra() {
        return fecTra;
    }

    public String getNomUsu() {
        return nomUsu;
    }

    public void setCodDoc(int codDoc) {
        this.codDoc = codDoc;
    }

    public void setCodEst(int codEst) {
        this.codEst = codEst;
    }

    public void setCodTra(int codTra) {
        this.codTra = codTra;
    }

    public void setCodUsu(int codUsu) {
        this.codUsu = codUsu;
    }

    public void setDescripcionTra(String descripcionTra) {
        this.descripcionTra = descripcionTra;
    }

    public void setFecTra(String fecTra) {
        this.fecTra = fecTra;
    }

    public void setNomUsu(String nomUsu) {
        this.nomUsu = nomUsu;
    }
    
     public ArrayList<DocumentoHistorial> conseguirConsulta(int codigo1)
    {  
        this.codigo=codigo1;
       DocumentoHistorialBD consulta = new DocumentoHistorialBD();
        
    return consulta.consultarDocumentoH(codigo);
        
        
   
    }
     public DocumentoIn conseguirCaracteristicas(int codigo)
     {
         DocumentoHistorialBD consulta = new DocumentoHistorialBD();
         return consulta.consultarCaracteristicas(codigo);
     }
     public String conseguirArea (int c)
     {
         DocumentoHistorialBD consulta = new DocumentoHistorialBD();
         return consulta.ConseguirAreaID(c);
     }
    
      @Override
    public String toString() {
        return "<td>"+codTra+"</td><td>"+descripcionTra+"</td><td>"+fecTra+"</td><td>"+nomUsu+"</td><td>"+Area+"</td><td>"+nombreEst+"</td>";
    }
    
    
}
