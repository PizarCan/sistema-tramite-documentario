<%@page import="com.Tramite.Model.DocumentoIn"%>
<%@page import="com.Tramite.Conexion.DocumentoINDB"%>
<%@page import="com.Tramite.Model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
aaaaaa
<%
   DocumentoINDB  nuevadb= new DocumentoINDB();
   Usuario nuevo = new Usuario("","");
   HttpSession sesion=request.getSession();
   String nombre = (String) sesion.getAttribute("nombreU");
   String apellido=(String)sesion.getAttribute("apellidoU");
                      
   nuevo.setApellido(apellido);
   nuevo.setNombre(nombre);
   String fecha =nuevo.conseguirfecha();
   String area = nuevo.ConseguirArea(nuevo);
   
   
   
   
   
   
 
   
   
   
   
   %>
   
   
   
    <%
    session.setAttribute("fechadocumento",fecha);
   
    
    
  
   // HttpSession sesion=request.getSession();
    sesion.setAttribute("area",area);
              
           //   out.println(nombre+" "+apellido);  
    
    request.getRequestDispatcher( "nuevodocumento.jsp" ).forward( request,response );
            

%>

