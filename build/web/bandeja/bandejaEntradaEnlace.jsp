<%-- 
    Document   : bandejaEntradaEnlace
    Created on : 12/01/2012, 05:27:03 AM
    Author     : WILFREDO
--%>

<%@page import="com.Tramite.Model.DocumentoEntrada"%>
<%@page import="com.Tramite.Model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>

<%

    
    String nombre = (String) request.getParameter("nombreU");
    String apellido = (String) request.getParameter("apellidoU");

    request.setAttribute("nombreUsuario", nombre);
    request.setAttribute("apellidoUsuario", apellido);


    request.getRequestDispatcher("bandejaEntrada1.jsp").forward(request, response);



%>