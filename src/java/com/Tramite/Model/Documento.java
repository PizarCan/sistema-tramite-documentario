/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tramite.Model;

import com.Tramite.Conexion.DocumentoBD;
import java.util.ArrayList;

/**
 *
 * @author WILFREDO
 */
public class Documento {
    DocumentoBD consulta;
    int codigo;
    String Asunto;
    String fecha;
    int maximo;
    String descripcion;
    String ultiestado;
    String nombreArea;
    
    
     @Override
    public String toString() {
        this.conseguirTramiteCuenta();
        return "<td>"+Asunto+"</td><td>"+codigo+"</td><td>"+maximo+"</td><td>"+descripcion+"</td><td>"+ultiestado+"</td><td>"+fecha+"</td>";
    }
    public Documento()
    {}
    public Documento(int codigo, String Asunto, String fecha, int maximo, String descripcion, String ultiestado, String nombreArea) {
        this.codigo = codigo;
        this.Asunto = Asunto;
        this.fecha = fecha;
        this.maximo = maximo;
        this.descripcion = descripcion;
        this.ultiestado = ultiestado;
        this.nombreArea = nombreArea;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getUltiestado() {
        return ultiestado;
    }

    public void setUltiestado(String ultiestado) {
        this.ultiestado = ultiestado;
    }
     public ArrayList<Documento> conseguirConsultaDocs(Usuario usu)
    {  
        consulta = new DocumentoBD();
        int codUsu = consulta.conseguirCodigoAreaUsuario(usu);
           
    return consulta.listarDocumentos(codUsu);
        
        
   
    }
     public void conseguirTramiteCuenta()
    {  
        consulta = new DocumentoBD();
                  
    maximo = consulta.conseguirCuentaTramiteDoc(codigo);
        
        
   
    } 
     
     
    
}
