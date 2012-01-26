<%@page import="com.Tramite.Model.Usuario"%>
<%@page import="com.Tramite.Conexion.UsuarioBD"%>
<%@page import="com.Tramite.Conexion.TipoUsuarioBD"%>
<%@page import="com.Tramite.Conexion.AreaBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>

<%
    String docid=(String)request.getParameter("t_Docidentidad");
    String nombre =(String)request.getParameter("t_Nombre");
    String apellido =(String)request.getParameter("t_Apellido");
    String nick =(String)request.getParameter("t_Nick");
    String pass =(String)request.getParameter("t_Password");
    String correo =(String)request.getParameter("t_Correo");
    String tipusu =(String)request.getParameter("cb_Tusuario");
    String area =(String)request.getParameter("cb_Area");
    String estado =(String)request.getParameter("rb_Estado");

    if(docid!="" && nombre!="" && apellido!="" && correo!="" &&
        area!="" && estado!=""){

        TipoUsuarioBD tu= new TipoUsuarioBD();
        AreaBD a= new AreaBD();
        int tipuscod = tu.seleccCodTipo(tipusu);
        int areacod = a.seleccCodArea(area);
        int est;
        if(estado=="activo")
            est=1;
        else
            est=2;
        Usuario usuario = new Usuario(nombre,apellido,pass,docid,nick,correo,tipuscod,est,areacod);
        UsuarioBD usubd = new UsuarioBD();
        usubd.insertarUsuario(usuario);
    }
    //request.getRequestDispatcher( "creacionusuario.jsp" ).forward( request,response ); 
    
    response.sendRedirect("creacionusuariomensaje.jsp");
%>