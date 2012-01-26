<%@page import="com.Tramite.Model.DocumentoEntrada"%>
<%@page import="com.Tramite.Model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/jquery-1.js"></script>
<link href="/SistemaTramiteDocumentario/jquery/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/tablecloth.js"></script>
<%


    String nombre = (String) request.getParameter("nombreU");
    String apellido = (String) request.getParameter("apellidoU");

    request.setAttribute("nombreUsuario", nombre);
    request.setAttribute("apellidoUsuario", apellido);


    request.getRequestDispatcher("bandejaenviados.jsp").forward(request, response);



%>