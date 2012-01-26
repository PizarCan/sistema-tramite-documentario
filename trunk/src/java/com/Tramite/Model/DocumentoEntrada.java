/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tramite.Model;

import com.Tramite.Conexion.DocumentoEntradaBD;
import java.util.ArrayList;

/**
 *
 * @author WILFREDO
 */
public class DocumentoEntrada {
    DocumentoEntradaBD consulta;
    int codRec;
    int codDoc;
    String asuntoDoc;
    String nombreUsu;
    String ApellidoUsu;
    String Area;
    String nombreEst;
    String fecTra;

        @Override
        public String toString() {
            return "<td>"+"<input type='checkbox' name='option1' value='Milk' "+((codRec==2)?"disabled checked":"disabled")+">"+"</td><td>"+codDoc+"</td><td>"+asuntoDoc+"</td><td>"+nombreUsu+" "+ApellidoUsu+"</td><td>"+Area+"</td><td>"+nombreEst+"</td><td>"+fecTra+"</td>";
        }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    

    public DocumentoEntrada(int codRec, int codDoc, String asuntoDoc, String nombreUsu, String ApellidoUsu,String Area, String nombreEst, String fecTra) {
        this.codRec = codRec;
        this.codDoc = codDoc;
        this.asuntoDoc = asuntoDoc;
        this.nombreUsu = nombreUsu;
        this.ApellidoUsu = ApellidoUsu;
        this.nombreEst = nombreEst;
        this.fecTra = fecTra;
        this.Area = Area;
        
    }
    public DocumentoEntrada() {

        
    }
    

    public String getApellidoUsu() {
        return ApellidoUsu;
    }

    public void setApellidoUsu(String ApellidoUsu) {
        this.ApellidoUsu = ApellidoUsu;
    }

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

    public String getNombreEst() {
        return nombreEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }
    public ArrayList<DocumentoEntrada> conseguirConsulta(Usuario usu)
    {  
        consulta = new DocumentoEntradaBD();
        int codUsu = consulta.conseguirCodigoAreaUsuario(usu);  
           
    return consulta.consultarDocumento(codUsu);
        
        
   
    }
    
    
    public ArrayList<DocumentoEntrada> conseguirConsultaIniciados(Usuario usu)
    {  
        consulta = new DocumentoEntradaBD();
        int codUsu = consulta.conseguirCodigoAreaUsuario(usu);  
           
    return consulta.consultarDocumentoADI(codUsu);
        
        
   
    }
    
    public ArrayList<DocumentoEntrada> conseguirConsultaAD(Usuario usu)
    {  
        consulta = new DocumentoEntradaBD();
        int codUsu = consulta.conseguirCodigoAreaUsuario(usu);
           
    return consulta.consultarDocumentoAD(codUsu);
        
        
   
    }
    
    
          public static void main (String [] args)
    {       Usuario nuevo = new Usuario("","");
            nuevo.setNombre("WILFREDO FELIX");
            nuevo.setApellido("QUISPE INFANTES");
            
            DocumentoEntrada documentoEntrada = new DocumentoEntrada();
            System.out.print(nuevo.getApellido());
            System.out.print(nuevo.getNombre());
            ArrayList<DocumentoEntrada> nuevo1 =documentoEntrada.conseguirConsultaIniciados(nuevo);
            System.out.print(nuevo1.size());
            for (int i = 0;i<nuevo1.size();i++)
            {
                System.out.print(nuevo1.get(i).getNombreUsu()+" fff ");
                System.out.println(nuevo1.get(i).getAsuntoDoc());
                
            }
            
    }
    
    
}

