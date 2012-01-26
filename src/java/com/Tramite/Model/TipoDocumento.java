
package com.Tramite.Model;

import com.Tramite.Conexion.TipoDocumentoBD;

public class TipoDocumento {
    
    String nombre;
    String descripcion;
    int tipocodd;
    
    TipoDocumentoBD tdocBD;
    
    public TipoDocumento(){}
    
    public TipoDocumento(String nombre,String descripcion) {
        tdocBD = new TipoDocumentoBD();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipocodd = tdocBD.buscarMaxID();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipocod() {
        return tipocodd;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipocod(int tipocod) {
        this.tipocodd = tipocod;
    }
    
     public static void main (String [] args)
    {
        TipoDocumento td = new TipoDocumento("asfa","asgbb");
    }
    
}
