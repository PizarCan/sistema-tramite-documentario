<%@page import="com.Tramite.Model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>

<%
  
   
   String nombre=(String)request.getParameter("nombreU");
   String apellido =(String)request.getParameter("apellidoU");
   String codigo =(String)request.getParameter("codigo");
   
   %>
   
    <%request.setAttribute("nombreUsuario",nombre);
    request.setAttribute("apellidoUsuario",apellido);
    request.setAttribute("codigo",codigo);
   
    request.getRequestDispatcher( "mensaje.jsp" ).forward( request,response );
   
       

%>