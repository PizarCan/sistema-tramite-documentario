package com.Tramite.Conexion;

import com.Tramite.Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class UsuarioBD {
    Conexion nueva;
    
    public UsuarioBD (){
        nueva= new Conexion("bd_tramite_doc_coas","root","");
    }
    
    public int comprobarUsuario (Usuario usuario){
       try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT claveUsu,codtipusu FROM usuario where nickUsu=?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,usuario.getNick());
            rs= psConsultar.executeQuery();
            while (rs.next()){
                if(rs.getString(1).equals(usuario.getPassword()))
                    return rs.getInt(2);
            }
       }catch (Exception ex){
           return -1;     
       }
       return -1;
    }
    
    public String ConseguirArea (Usuario usuario){
       try{
            ResultSet rs = null;
           String con;
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT nombreAre  FROM usuario,area where area.codAre=usuario.codAre and usuario.nombreUsu=? and usuario.apellidoUsu=?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,usuario.getNombre());
            psConsultar.setString(2,usuario.getApellido());
            rs= psConsultar.executeQuery();
            while (rs.next()){
                return rs.getString(1);
            }
            return null;  
       }     
        catch (Exception ex) {
            return null;   
        }      
    }
    
    public String conseguirfecha(){   
        Date fecha;
        fecha = new Date();
        int dia = fecha.getDate();
        int mes =fecha.getMonth()+1;
        int anyo =fecha.getYear()+1900;
        return dia+"/"+mes+"/"+anyo;
    }
    
    public String conseguiNombre (Usuario usuario){
       try{
           ResultSet rs = null;
           PreparedStatement psConsultar = null;
           String consultaBuscar="SELECT nombreUsu FROM usuario where nickUsu=?";
           psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
           psConsultar.setString(1,usuario.getNick());
           rs= psConsultar.executeQuery();
           while (rs.next())
               return rs.getString(1);
       }     
       catch (Exception ex) {
           return null;
       }
       return null;
    }
     
    public String conseguiApellido (Usuario usuario){
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT apellidoUsu FROM usuario where nickUsu=?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,usuario.getNick());
            rs= psConsultar.executeQuery();
            while (rs.next()){
                return rs.getString(1);
            }
        }     
        catch (Exception ex) {
            return null;
        }
        return null;
    }
      
    public int buscarMaxID(){
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaBuscar="select max(codusu) from usuario";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            rs= psConsultar.executeQuery();
            while (rs.next()){
                return rs.getInt(1)+1;
            }
        }     
        catch (Exception ex) {
            return -1;  
        }
        return -1;
    }
    
    public int insertarUsuario(Usuario usuario){
        try{
            ResultSet rs = null;
            PreparedStatement psConsultar = null;
            String consultaInsertar="INSERT into USUARIO values (?,?,?,?,?,?,?,?,?,?)";
            psConsultar = nueva.getConnection().prepareStatement(consultaInsertar);
            psConsultar.setInt(1,usuario.getCodigo());
            psConsultar.setString(2,usuario.getNombre());
            psConsultar.setString(3,usuario.getNick());
            psConsultar.setString(4,usuario.getPassword());
            psConsultar.setString(5,usuario.getApellido());
            psConsultar.setString(6,usuario.getCorreo());
            psConsultar.setInt(7,usuario.getTipousuario());
            psConsultar.setInt(8,usuario.getEstado());
            psConsultar.setInt(9,usuario.getArea());
            psConsultar.setString(10,usuario.getDni());

            int res = psConsultar.executeUpdate();
            return res;
       }catch (Exception ex) {
           return -1;  
       }
    }
    
    public int conseguirCodigoUsuarios(Usuario u) {
       try {
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT codUsu from usuario Where nombreUsu=? and apellidoUsu=?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,u.getNombre());
            psConsultar.setString(2,u.getApellido());
            rs= psConsultar.executeQuery();
            while (rs.next()){
                return rs.getInt(1);
            }
       }     
        catch (Exception ex) {
           return -1;
            
        }
        return -1;
    } 
    
    public ArrayList <Usuario> consultarUsuarioDNI(String docid){
        ArrayList <Usuario> usuarios = new ArrayList <Usuario>();
        try{
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="select usuario.dniusu,usuario.nombreusu,usuario.apellidousu,area.nombreare,usuario.nickusu from usuario,area where usuario.codare = area.codare and usuario.dniusu = ? ";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,docid);
            rs= psConsultar.executeQuery();
            while (rs.next()){
                usuarios.add(new Usuario(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }
            return usuarios;
       }     
       catch (Exception ex) {
           return null;    
       }
    }

    public ArrayList <Usuario> consultarUsuarioNombre(String nombre){
        ArrayList <Usuario> usuarios = new ArrayList <Usuario>();
        try{
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT DNIusu,nombreusu,apellidousu,nombreare,nickusu from usuario,area where usuario.codare = area.codare and usuario.nombreusu = ?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,nombre);
            rs= psConsultar.executeQuery();
            while (rs.next()){
                usuarios.add(new Usuario(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }
            return usuarios;
       }     
       catch (Exception ex) {
           return null;    
       }
    }
    
    public ArrayList <Usuario> consultarUsuarioApellido(String apellido){
        ArrayList <Usuario> usuarios = new ArrayList <Usuario>();
        try{
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT DNIusu,nombreusu,apellidousu,nombreare,nickusu from usuario,area where usuario.codare = area.codare and usuario.apellidousu = ?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,apellido);
            rs= psConsultar.executeQuery();
            while (rs.next()){
                usuarios.add(new Usuario(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }
            return usuarios;
       }     
       catch (Exception ex) {
           return null;    
       }
    }
    
    public ArrayList <Usuario> consultarUsuarioNA(String nombre,String apellido){
        ArrayList <Usuario> usuarios = new ArrayList <Usuario>();
        try{
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="SELECT DNIusu,nombreusu,apellidousu,nombreare,nickusu from usuario,area where usuario.codare = area.codare and usuario.nombreusu = ? and usuario.apellidousu = ?";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,nombre);
            psConsultar.setString(2,apellido);
            rs= psConsultar.executeQuery();
            while (rs.next()){
                usuarios.add(new Usuario(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }
            return usuarios;
       }     
       catch (Exception ex) {
           return null;    
       }
    }
    
    public ArrayList <Usuario> consultarUsuario(String docid){
        ArrayList <Usuario> usuarios = new ArrayList <Usuario>();
        try{
            ResultSet rs = null;
           
            PreparedStatement psConsultar = null;
            String consultaBuscar="select codusu, nombreusu,apellidousu,correousu,codtipusu,codare,codest from usuario where usuario.dniusu = ? ";
            psConsultar = nueva.getConnection().prepareStatement(consultaBuscar);
            psConsultar.setString(1,docid);
            rs= psConsultar.executeQuery();
            while (rs.next()){
                usuarios.add(
                        new Usuario(
                                rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7))
                        );
            }
            return usuarios;
       }     
       catch (Exception ex) {
           return null;    
       }
    }
            
    public int actualizarUsuario(String docid,String nombre,String apellido,String correo,int tipo,int area,int estado){
        try{
            PreparedStatement psConsultar = null;
            String consultaInsertar="UPDATE USUARIO SET nombreusu=?, apellidousu=?,correousu=?,codtipusu=?,codare=?,codest=? where DNIusu=?";
            psConsultar = nueva.getConnection().prepareStatement(consultaInsertar);
            psConsultar.setString(1,nombre);
            psConsultar.setString(2,apellido);
            psConsultar.setString(3,correo);
            psConsultar.setInt(4,tipo);
            psConsultar.setInt(5,area);
            psConsultar.setInt(6,estado);
            psConsultar.setString(7,docid);

            int res = psConsultar.executeUpdate();
            return res;
       }catch (Exception ex) {
           return -1;  
       }
    }
    
    public static void main (String [] args){
        UsuarioBD log = new UsuarioBD();
        log.consultarUsuarioDNI("a");
    }
    
}
