<%-- 
    Document   : creardocumentoguardar
    Created on : Jan 21, 2012, 5:01:30 PM
    Author     : Personal
--%>

<%@page import="com.Tramite.Model.TipoDocumento"%>
<%@page import="com.Tramite.Conexion.TipoDocumentoBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    String Nombre =(String)request.getParameter("nombrett"); 
    String Descrip =(String)request.getParameter("desctt");
    
    TipoDocumentoBD tdocbd= new TipoDocumentoBD();    
    TipoDocumento nuevotipo = new TipoDocumento(Nombre,Descrip);
    
    tdocbd.insertarTipoDoc(nuevotipo);
%>
