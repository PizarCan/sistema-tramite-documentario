<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<HTML>
    <HEAD>
        <meta http-equiv="Content-Language" content="en-us">
<script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/jquery-1.js"></script>
        <link href="/SistemaTramiteDocumentario/jquery/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/tablecloth.js"></script>
        <link rel="stylesheet" href="/SistemaTramiteDocumentario/css/style1.css" />
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/jquery-1.js"></script>
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/script.js"></script>
        <link rel="stylesheet" href="/SistemaTramiteDocumentario/jquery/tablecloth/style.css" />
        <link href="/SistemaTramiteDocumentario/jquery/tablecloth/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/tablecloth/tablecloth.js"></script>
        <TITLE>Menu de Usuario</TITLE><!--www.chinaz.com-->
        <META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=windows-1252">
        <!-- ImageReady Preload Script (layout.psd) -->
        <SCRIPT TYPE="text/javascript">
        
            function validar(){
                x=parseInt(document.formulario.username.value);
                if(isNaN(x)){
                    alert("usuario no valido" );
                    return false;}
                x=parseInt(document.formulario.password.value);
                if(isNaN(x)){
                    alert("Password no valido" );
                    return false;}
                return true;
            }
 

 
        </SCRIPT>

    </style>
    <style type="text/css">
        #TabMenu1
        {
            text-align: left;
            margin: 0px 0 1px 0;
            font-family: "Comic Sans MS";
            font-size: 27px;
            font-weight: normal;
            list-style-type: none;
            padding: 22px 0px 3px 10px;
        }
        #TabMenu1 li
        {
            display: inline;
        }
        #TabMenu1 a:link.active, #TabMenu1 a:visited.active, #TabMenu1 a:hover.active
        {
            border-bottom: 1px solid #F7F9FC;
            background-color: #F7F9FC;
            color: #005500;
            position: relative;
            padding-top: 3px;
            font-weight: normal;
            text-decoration: none;
        }
        #TabMenu1 a:link, #TabMenu1 a:visited
        {
            padding: 3px 4px;
            border: 1px solid #FFFFFF;
            background-color: #FFFFFF;
            color: #1C3B69;
            margin-right: 0px;
            text-decoration: none;
            border-bottom: none;
        }
        #TabMenu1 a:hover
        {
            background: #F7F9FC;
            color: #000000;
            font-weight: normal;
            text-decoration: none;
        }
    </style>
    <style type="text/css">
        #TabMenu2
        {
            text-align: left;
            margin: 0px 0 1px 0;
            font-family: "Comic Sans MS";
            font-size: 27px;
            font-weight: normal;
            list-style-type: none;
            padding: 22px 0px 3px 10px;
        }
        #TabMenu2 li
        {
            display: inline;
        }
        #TabMenu2 a:link.active, #TabMenu2 a:visited.active, #TabMenu2 a:hover.active
        {
            border-bottom: 1px solid #F7F9FC;
            background-color: #F7F9FC;
            color: #005500;
            position: relative;
            padding-top: 3px;
            font-weight: normal;
            text-decoration: none;
        }
        #TabMenu2 a:link, #TabMenu2 a:visited
        {
            padding: 3px 4px;
            border: 1px solid #FFFFFF;
            background-color: #FFFFFF;
            color: #1C3B69;
            margin-right: 0px;
            text-decoration: none;
            border-bottom: none;
        }
        #TabMenu2 a:hover
        {
            background: #F7F9FC;
            color: #000000;
            font-weight: normal;
            text-decoration: none;
        }
    </style>


    <style type="text/css">
        #TabMenu3
        {
            text-align: left;
            margin: 0px 0 1px 0;
            font-family: "Comic Sans MS";
            font-size: 27px;
            font-weight: normal;
            list-style-type: none;
            padding: 22px 0px 3px 10px;
        }
        #TabMenu3 li
        {
            display: inline;
        }
        #TabMenu3 a:link.active, #TabMenu3 a:visited.active, #TabMenu3 a:hover.active
        {
            border-bottom: 1px solid #F7F9FC;
            background-color: #F7F9FC;
            color: #005500;
            position: relative;
            padding-top: 3px;
            font-weight: normal;
            text-decoration: none;
        }
        #TabMenu3 a:link, #TabMenu3 a:visited
        {
            padding: 3px 4px;
            border: 1px solid #FFFFFF;
            background-color: #FFFFFF;
            color: #1C3B69;
            margin-right: 0px;
            text-decoration: none;
            border-bottom: none;
        }
        #TabMenu3 a:hover
        {
            background: #F7F9FC;
            color: #000000;
            font-weight: normal;
            text-decoration: none;
        }
    </style>


    <link href="/SistemaTramiteDocumentario/usuario/images/style.css" rel="stylesheet" type="text/css">


</HEAD>
<BODY BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0 >
    <!-- ImageReady Slices (layout.psd) -->
    
       
    
    <TABLE WIDTH=100% BORDER=0 CELLPADDING=0 CELLSPACING=0>
        <TR>
            <TD COLSPAN=4 ROWSPAN=1>
                <IMG SRC="/SistemaTramiteDocumentario/images/arequipa.png" WIDTH=100%    HEIGHT=200 ALT=""></TD>

            <TD COLSPAN=4 ROWSPAN=1>
                <IMG SRC="/SistemaTramiteDocumentario/images/logo.png" WIDTH=100% HEIGHT=200 ALT=""></TD>
            <TD COLSPAN=4 ROWSPAN=1>
                <IMG SRC="/SistemaTramiteDocumentario/images/arequipa.png" WIDTH=100% HEIGHT=200 ALT=""></TD>
        </TR>

    </TABLE>

    <!-- CUERPO DE LA PAGINA WEB -->



    <!-- parte final de web -->    
 

            
    

    <div>
        
        <img src="/SistemaTramiteDocumentario/images/icono1.png" style="cursor:pointer; position:absolute; left:30%; top:55% ">
        <img src="/SistemaTramiteDocumentario/images/icono1.png" style="cursor:pointer; position:absolute; left:26%; top:67% ">

        <img src="/SistemaTramiteDocumentario/images/nuevo.png" onmouseover="this.width=48;this.height=48;" onmouseout="this.width=40;this.height=40;" style="position:absolute; left:30.5%; top:56% ">
        <img src="/SistemaTramiteDocumentario/images/salir.png" onmouseover="this.height=45;" onmouseout="this.width=35;this.height=35;" style="position:absolute; left:26.8%; top:68.3% ">


        <ul id="TabMenu1" style ="position:absolute; top:52.5%;left:33.3%">
            <li><a href="/SistemaTramiteDocumentario/bandeja/bandejaEntradaEnlace.jsp?nombreU=${nombreU}&apellidoU=${apellidoU}">Bandeja Tramite Documentario</a></li>
        </ul>
        

        <ul id="TabMenu3" style ="position:absolute; top:65%;left:29.5%">
            <li><a href="/SistemaTramiteDocumentario/index/index.jsp">Salir</a></li>
        </ul>
    </div>
        
     <div style ="position: absolute;top:38%;left:0%;width: 100%">
            <IMG SRC="/SistemaTramiteDocumentario/images/layout_24.gif" WIDTH=100%    HEIGHT=50 ALT="">

        </div>                
        
         
       


        <!-- End ImageReady Slices -->
</BODY>
</HTML>