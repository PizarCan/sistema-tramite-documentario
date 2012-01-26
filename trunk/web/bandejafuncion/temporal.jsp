<%-- 
    Document   : temporal
    Created on : 21/01/2012, 06:32:48 PM
    Author     : WILFREDO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String asunto = (String)request.getParameter("asunto");
   String destino = (String)request.getParameter("destino");
   String remitente = (String)request.getParameter("remitente");
   String tipo =(String) request.getParameter("cb_tipo");
   String descripcion = (String )request.getParameter("texto");
   if(nombre!="" && apellido!="" && fecha!="" && area!="" && asunto!="" && remitente!="" && descripcion!="")
   {
             int codigo = nuevadb.buscarMaxID();
             int codigotipodoc = nuevadb.buscarcodigotipoDoc(area);
             nuevadb.ingresarDocu(new DocumentoIn(codigo,asunto,remitente,fecha,destino,codigotipodoc,descripcion));
   }
%>
