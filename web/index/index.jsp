<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<HTML>
    <HEAD>
        <meta http-equiv="Content-Language" content="en-us">
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/jquery-1.js"></script>
        <link href="/SistemaTramiteDocumentario/jquery/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/tablecloth.js"></script>
        <TITLE>SISTEMA DE TRAMITE DOCUMENTARIO</TITLE><!--www.chinaz.com-->
        <META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=windows-1252">
        <!-- ImageReady Preload Script (layout.psd) -->
        <SCRIPT TYPE="text/javascript">
            function verificarblancos(formulario){
                if(formulario.username.value =="" || formulario.password.value=="")
                    alert('Datos incompletos');
                else{
                    
                    formulario.slogin.type = "submit";
                    formulario.method="post";
                    formulario.action="login.jsp";
                }
        }
        </SCRIPT>
        <link href="css/style.css" rel="stylesheet" type="text/css">
    </HEAD>
    <BODY BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0 >
        <!-- ImageReady Slices (layout.psd) -->
        <!-- TABLA CABECERA DEL INDEX -->
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

        <div id="wb_loginform" style="position:absolute;background-color:#1D4C7F;border:1px #112F4B solid;left:38%;top:40%; width:380px;height:170px;z-index:10">

            <form name="formulario"  >

                <div id="wb_Text1" style="margin:0;padding:0;position:absolute;left:20%;top:4px;width:484px;height:24px;z-index:0;">
                    <font style="font-size:17px" color=white face="Arial Black">&nbsp; INGRESAR AL SISTEMA </font></div>
                <div id="wb_Text2" style="margin:0;padding:0;position:absolute;left:25%;top:24%;width:94px;height:24px;z-index:1;">
                    <font style="font-size:15px" color=white face="Arial ">Usuario&nbsp; </font></div>
                <input type="text" name="username"  id="username" style="position:absolute;left:52%;top:22%;width:120px;height:22px;border:1px #DFE9F5 solid;font-family:'Arial ';font-size:15px;z-index:1" value="${nickUsuario}" >
                <div id="wb_Text3" style="margin:0;padding:0;position:absolute;left:25%;top:42%;width:107px;height:48px;z-index:3;">
                    <font style="font-size:15px" color=white face="Arial ">Contraseña </font></div>
                <input type="password" id="password" style="position:absolute;left:52%;top:40%;width:120px;height:22px;border:1px #DFE9F5 solid;font-family:'Arial Black';font-size:17px;z-index:7" name="password" >
                <input id="login" name="slogin" value="Aceptar"type="button"  onclick="verificarblancos(this.form);" style="  position:absolute;left:32%;top:75%;width:80px;height:28px;border:1px #DFE9F5 solid;background-color:#215A97;color:WHITE; font-family:'Arial ';font-size:17px;z-index:6">

            </form>
            <form name="flogin2" method="post" action="/SistemaTramiteDocumentario/administrador/principalAdministrador.jsp" id="loginform1">  
                <input id="login" type="submit" name="Cancelar" value="Cancelar" style="position:absolute;left:56%;top:75%;width:80px;height:28px;border:1px #DFE9F5 solid;background-color:#215A97;color:white;font-family:'Arial ';font-size:17px;z-index:6">

            </form>
        </div>

        <!-- parte final de web -->    
        <TABLE WIDTH=100% BORDER=0 CELLPADDING=0 CELLSPACING=0>
            <TR>

                <TD COLSPAN=11 background="/SistemaTramiteDocumentario/images/layout_24.gif" WIDTH=760 height="34">
                    <p align="center"><b><font size="1">2012 (C) CopyRight Creaciones desarrollo UNSA
                            </font><u><font size="1"></font></u></b></TD>
            </TR>


        </TABLE>

        <!-- End ImageReady Slices -->
    </BODY>
</HTML>