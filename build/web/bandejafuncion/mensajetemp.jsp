<%@page import="com.Tramite.Conexion.DocumentoINDB"%>
<%@page import="com.Tramite.Model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>

<%
  
   
   DocumentoINDB  nuevadb= new DocumentoINDB();
   Usuario nuevo = new Usuario("","");
   HttpSession sesion=request.getSession();
   String nombre = (String) sesion.getAttribute("nombreU");
   String apellido=(String)sesion.getAttribute("apellidoU");
   String codigo =(String)request.getParameter("codigo");
   nuevo.setApellido(apellido);
   nuevo.setNombre(nombre);
   String fecha =nuevo.conseguirfecha();
   String area = nuevo.ConseguirArea(nuevo);
   %>
   
                      
   
   
    <%
    session.setAttribute("fechadocumento",fecha);
   sesion.setAttribute("area",area);
   sesion.setAttribute("codigo",codigo);
    request.getRequestDispatcher("aumentardescripcionform.jsp").forward( request,response );
   

%>