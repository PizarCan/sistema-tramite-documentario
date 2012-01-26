<%-- 
    Document   : seguridad
    Created on : Jan 18, 2012, 10:29:17 AM
    Author     : lizzy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<% 
         
                HttpSession sesion=request.getSession();
                String apellido=(String)sesion.getAttribute("apellidoU");
                String nombre=(String)sesion.getAttribute("nombreU");
                
                if(apellido==null||apellido==""){
                    
                //request.getRequestDispatcher( "../index/login.jsp?nickUsu="+nombre ).forward( request,response );
 %>         
     <jsp:forward page="index.jsp"/>
       <script language='javascript'>alert ('Usuario no Identificado');</script>
<%}%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
