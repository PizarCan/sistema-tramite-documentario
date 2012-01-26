<%@page import="com.Tramite.Model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/jquery-1.js"></script>
        <link href="/SistemaTramiteDocumentario/jquery/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/tablecloth.js"></script>
<%
  
   
   String nombre=(String)request.getParameter("username");
   String contra =(String)request.getParameter("password");
   Usuario usu=new Usuario(nombre,contra);
   if (usu.comprobar()==2 ){
   
   HttpSession sesion=request.getSession();
                sesion.setAttribute("nombreU", usu.getNombre());
                sesion.setAttribute("apellidoU", usu.getApellido());
           
       request.getRequestDispatcher( "/administrador/principalAdministrador.jsp" ).forward( request,response );
           
   }
   //request.setAttribute("username",usu.getId());
     else{
            if(usu.comprobar()==1)
            {  
 HttpSession sesion=request.getSession();
                sesion.setAttribute("nombreU", usu.getNombre());
                sesion.setAttribute("apellidoU", usu.getApellido());
                              

                request.getRequestDispatcher( "/usuario/principalUsuario.jsp" ).forward( request,response );
                
                
            }
            else
            { 
                    request.setAttribute("nombreU",nombre);
                    request.getRequestDispatcher( "error.jsp" ).forward( request,response );
            }
            
     
   
      }
   
      //request.setAttribute("username",usu.getPassword());



%>


