<%@page import="com.Tramite.Model.Usuario"%>
<%@page import="com.Tramite.Conexion.UsuarioBD"%>
<%@page import="com.Tramite.Conexion.TipoUsuarioBD"%>
<%@page import="com.Tramite.Conexion.AreaBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>

<%
    String docid =(String)request.getParameter("t_Docident"); 
    String nombre =(String)request.getParameter("t_Nombre");
    String apellido =(String)request.getParameter("t_Apellido");
    //String pass =(String)request.getParameter("t_Password");
    String correo =(String)request.getParameter("t_Correo");
    String tipusu =(String)request.getParameter("cb_Tusuario");
    String area =(String)request.getParameter("cb_Area");
    String estado =(String)request.getParameter("rb_Estado");
    
    UsuarioBD us = new UsuarioBD();
    TipoUsuarioBD tu = new TipoUsuarioBD();
    AreaBD are = new AreaBD();
    
    int tipusucod = tu.seleccCodTipo(tipusu);
    int areacod = are.seleccCodArea(area);
    int estadocod;
    
    if(estado=="activo")
            estadocod=1;
    else
            estadocod=2;
            
    us.actualizarUsuario(docid,nombre,apellido,correo,tipusucod,areacod,estadocod);

    //request.getRequestDispatcher( "creacionusuario.jsp" ).forward( request,response ); 
    
    response.sendRedirect("../administrador/principalAdministrador.jsp");
%>