<%@page import="com.Tramite.Model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
aaaaaa
<%
  
   
   String nombre=(String)request.getParameter("nombreU");
   String apellido =(String)request.getParameter("apellidoU");
   %>
   
    <%request.setAttribute("nombreUsuario",nombre);
    request.setAttribute("apellidoUsuario",apellido);
    request.getRequestDispatcher( "bandejaenviados.jsp" ).forward( request,response );
   
       

%>