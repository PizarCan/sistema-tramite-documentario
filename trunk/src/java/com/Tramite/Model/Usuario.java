
package com.Tramite.Model;

import com.Tramite.Conexion.AreaBD;
import com.Tramite.Conexion.UsuarioBD;
import java.util.ArrayList;
import java.util.Date;

public class Usuario{
    int codigo;
    String nombre;
    String apellido;
    String password;
    
    String dni;
    String nick;
    String correo;
    int tipousuario;
    int area;
    
    int estado;
    
    UsuarioBD nuevo;
    
    String areanom;
    
    public String toString() {
        return "<td>"+dni+"</td><td>"+nombre+"</td><td>"+apellido+"</td><td>"+areanom+"</td><td>"+nick+"</td>";
    }

    public int getArea() {
        return area;
    }
    
    public String getCorreo() {
        return correo;
    }

    public String getDni() {
        return dni;
    }

    public int getEstado() {
        return estado;
    }

    public String getNick() {
        return nick;
    }

    public UsuarioBD getNuevo() {
        return nuevo;
    }

    public int getTipousuario() {
        return tipousuario;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNuevo(UsuarioBD nuevo) {
        this.nuevo = nuevo;
    }

    public void setTipousuario(int tipousuario) {
        this.tipousuario = tipousuario;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public Usuario() {}

    public Usuario(int codigo,String nombre,String apellido,String correo,int tipousuario,int area,int estado) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.tipousuario=tipousuario;
        this.area=area;
        this.estado=estado;
    }
    
    public Usuario(String dni,String nombre,String apellido,String areanom,String nick) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.areanom = areanom;
        this.nick = nick;
    }
    
    public Usuario(String dni,String nombre,String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
     
    public Usuario(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

     public String conseguirfecha(){   
        Date fecha;
        fecha = new Date();
        int dia = fecha.getDate();
        int mes =fecha.getMonth()+1;
        int anyo =fecha.getYear()+1900;
        return dia+"-"+mes+"-"+anyo;
    }
    public Usuario(String nombre, String apellido, String password, String dni, 
            String nick, String correo, int tipousuario, int estado, int area) {
        nuevo = new UsuarioBD();
        this.codigo = nuevo.buscarMaxID();
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.dni = dni;
        this.nick = nick;
        this.correo = correo;
        
        this.tipousuario = tipousuario;
        this.estado = estado;
        this.area = area;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int comprobar ()
    {
        nuevo = new UsuarioBD();
        if(nuevo.comprobarUsuario(this)>0){ 
            this.setNombre(nuevo.conseguiNombre(this));
            this.setApellido(nuevo.conseguiApellido(this));
        }
        return nuevo.comprobarUsuario(this);
    }
    
    public ArrayList<Usuario> conseguirConsultaDNI(){  
        nuevo = new UsuarioBD();
        
        return nuevo.consultarUsuarioDNI(dni);
    }
    
    public ArrayList<Usuario> conseguirConsultaNombre(){  
        nuevo = new UsuarioBD();
        
        return nuevo.consultarUsuarioNombre(nombre);
    }
    
    public ArrayList<Usuario> conseguirConsultaApellido(){  
        nuevo = new UsuarioBD();
        
        return nuevo.consultarUsuarioApellido(apellido);
    }
    
    public ArrayList<Usuario> conseguirConsultaNA(){  
        nuevo = new UsuarioBD();
        
        return nuevo.consultarUsuarioNA(nombre,apellido);
    }
    public String ConseguirArea(Usuario usu)
    {   nuevo  = new UsuarioBD();
        return nuevo.ConseguirArea(usu);
    }
    
    
//    public static void main (String []args){
//       Usuario nuevo = new Usuario ("rene","rene");
//        if (nuevo.comprobar()>0)
//            System.out.print("comrprobado");
//        else
//            System.out.print("no comproa");
//        
//        System.out.print(nuevo.getApellido());
//    }
}