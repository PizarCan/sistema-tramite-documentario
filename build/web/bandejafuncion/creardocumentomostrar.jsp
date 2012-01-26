<%-- 
    Document   : creardocumentotemp
    Created on : Jan 21, 2012, 4:50:01 PM
    Author     : Personal
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.Tramite.Conexion.DocumentoBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
DocumentoBD seltipdoc = new DocumentoBD();

ArrayList<String> tipdocs = new ArrayList<String>();
tipdocs = seltipdoc.seleccionarTipoDoc();

int k=0;
for (String a : tipdocs){
    if(k!=tipdocs.size()-1)
        out.println("<option>" + a + "</option>");
    else
        out.println("<option SELECTED>" + a + "</option>");
    k++;
}
%>

<option onclick="cargarOtros();">Otro</option>