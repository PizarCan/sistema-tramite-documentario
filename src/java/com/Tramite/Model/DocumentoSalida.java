/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tramite.Model;

import com.Tramite.Conexion.DocumentoSalidaBD;
import java.util.ArrayList;

/**
 *
 * @author WILFREDO
 */
public class DocumentoSalida {
    DocumentoSalidaBD consulta;
    int  codDoc;
    int  codRec;
    String asuntoDoc;
    String nombreAre;
    String nombreEst;
    String fecTra;
    String usuario;

    public String toString() {
        //+"<input type='checkbox' name='option1' value='Milk' "+((codRec==2)?"disabled checked":"disabled")+">"+"</td>
        return "<td>"+asuntoDoc+"</td><td>"+codDoc+"</td><td>"+usuario+"</td><td>"+nombreAre+"</td><td>"+nombreEst+"</td><td>"+fecTra+"</td>";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    public DocumentoSalida(int codDoc, int codRec, String asuntoDoc, String nombreAre, String nombreEst, String fecTra) {
        this.codDoc = codDoc;
        this.codRec = codRec;
        this.asuntoDoc = asuntoDoc;
        this.nombreAre = nombreAre;
        this.nombreEst = nombreEst;
        this.fecTra = fecTra;
    }
    public DocumentoSalida()
    {}

    public String getAsuntoDoc() {
        return asuntoDoc;
    }

    public void setAsuntoDoc(String asuntoDoc) {
        this.asuntoDoc = asuntoDoc;
    }

    public int getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(int codDoc) {
        this.codDoc = codDoc;
    }

    public int getCodRec() {
        return codRec;
    }

    public void setCodRec(int codRec) {
        this.codRec = codRec;
    }

    public String getFecTra() {
        return fecTra;
    }

    public void setFecTra(String fecTra) {
        this.fecTra = fecTra;
    }

    public String getNombreAre() {
        return nombreAre;
    }

    public void setNombreAre(String nombreAre) {
        this.nombreAre = nombreAre;
    }

    public String getNombreEst() {
        return nombreEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }
    
    public ArrayList<DocumentoSalida> conseguirConsulta(Usuario usu)
    {  
        consulta = new DocumentoSalidaBD();
        int codUsuArea = consulta.conseguirCodigoAreaUsuario(usu);
           
    return consulta.consultarDocumentoSa(codUsuArea);
        
        
   
    }
        
          public static void main (String [] args)
    {       Usuario nuevo = new Usuario("","");
            nuevo.setNombre("reneeee");
            nuevo.setApellido("reneape");
            
            DocumentoSalida documentosalida = new DocumentoSalida();
            System.out.print(nuevo.getApellido());
            System.out.print(nuevo.getNombre());
            ArrayList<DocumentoSalida> nuevo1 =documentosalida.conseguirConsulta(nuevo);
            System.out.print(nuevo1.size());
            for (int i = 0;i<nuevo1.size();i++)
            {
                System.out.print(nuevo1.get(i).getNombreAre()+" fff ");
                System.out.println(nuevo1.get(i).getAsuntoDoc());
                
            }
            
    }    
        
    
    
}
