package com.Tramite.Conexion;


//PLANTILLA CONEXION MYSQL

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Conexion{
        private Connection connection;
	private String driverName = "com.mysql.jdbc.Driver";
	private String sourceURL = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String password = "";

//ingrese nombre base de datos y usuario con su contraseña
	public Conexion(String nombreBaseDatos,String user,String contrase) {
        try {
            Class.forName(driverName);
            this.user=user;
            this.password=contrase;
            this.sourceURL=this.sourceURL+nombreBaseDatos;
            connection = DriverManager.getConnection(this.sourceURL, this.user, this.password);
        } catch (Exception ex) {
            
         }
           
                
	}

	public void cerrar() throws SQLException {

		connection.close();
	}

	

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
 
        
        public static void main (String [] args)
        {
            Conexion conn = new Conexion("bd_tramite_doc_coas","root","");
        }
}

    
   
  


