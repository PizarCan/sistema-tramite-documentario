/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tramite.Model;

import com.Tramite.Conexion.DocumentoINDB;

/**
@author GS&C - Karen Morales Zegarra
 * @version 2.0
 * @date 
 */
public class DocumentoIn {
    DocumentoINDB nuevo;
    int  codDoc;
    String asuntoDoc;
    String remitente;
    String fechaInicio;
    String destinoDoc;
    int codTipoDoc;
    String descripcionDoc;

    public DocumentoIn(int codDoc, String asuntoDoc, String remitente, String fechaInicio, String destinoDoc, int codTipoDoc, String descripcionDoc) {
        this.codDoc = codDoc;
        this.asuntoDoc = asuntoDoc;
        this.remitente = remitente;
        this.fechaInicio = fechaInicio;
        this.destinoDoc = destinoDoc;
        this.codTipoDoc = codTipoDoc;
        this.descripcionDoc = descripcionDoc;
    }
     public DocumentoIn()
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

    public int getCodTipoDoc() {
        return codTipoDoc;
    }

    public void setCodTipoDoc(int codTipoDoc) {
        this.codTipoDoc = codTipoDoc;
    }

    public String getDescripcionDoc() {
        return descripcionDoc;
    }

    public void setDescripcionDoc(String descripcionDoc) {
        this.descripcionDoc = descripcionDoc;
    }

    public String getDestinoDoc() {
        return destinoDoc;
    }

    public void setDestinoDoc(String destinoDoc) {
        this.destinoDoc = destinoDoc;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }
    
    public void ingresarDocu()
    {
        nuevo=new DocumentoINDB ();
        nuevo.ingresarDocu(this);
    }
    
    public int obtenerCodigo ()
    {
        nuevo=new DocumentoINDB ();
        return nuevo.buscarMaxID();
    }
    
        public static void main (String [] args)
    {       Usuario nuevo = new Usuario("","");
            nuevo.setNombre("reneeee");
            nuevo.setApellido("reneape");
            
            DocumentoIn nuevod = new DocumentoIn(5,"aaa", "aaa","12/10/2011", "gerencia", 1,"dsddd");
            nuevod.ingresarDocu();
            System.out.print(nuevo.getApellido());
            System.out.print(nuevo.getNombre());
            
            
    }    
       
    
}
