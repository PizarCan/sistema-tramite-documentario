<%@page import="com.Tramite.Model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
aaaaaa
<%
  
   
   String nombre=(String)request.getParameter("nombreU");
   String apellido =(String)request.getParameter("apellidoU");
   %>
   <%=nombre%>
    <%request.setAttribute("nombreU",nombre);
    request.setAttribute("apellidoU",apellido);
    
    request.getRequestDispatcher( "principalUsuario.jsp" ).forward( request,response );
   
       

%>

    