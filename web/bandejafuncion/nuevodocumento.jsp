<%@page import="com.Tramite.Conexion.DocumentoBD"%>
<%@page import="com.Tramite.Conexion.AreaBD"%>
<%@page import="com.Tramite.Model.Usuario"%>
<%@page import="com.Tramite.Model.DocumentoEntrada"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0014)about:internet -->


<%
                   


                
                      HttpSession sesion=request.getSession();
                        String nombre=(String)sesion.getAttribute("nombreU");
                        String apellido=(String)sesion.getAttribute("apellidoU");
                        String area1=(String)sesion.getAttribute("area");
                    %>
                   


<html><head>
        <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        
        <link href="css/style.css" rel="stylesheet" type="text/css">
        <title>Nuevo Documento</title>
              

        <link rel="stylesheet" href="/SistemaTramiteDocumentario/css/style1.css" />
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/jquery-1.js"></script>
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/script.js"></script>
        <link rel="stylesheet" href="/SistemaTramiteDocumentario/jquery/tablecloth/style.css" />
        <link href="/SistemaTramiteDocumentario/jquery/tablecloth/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/tablecloth/tablecloth.js"></script>
        
         <!--Estilos de el modal--->
        <script type="text/javascript" src="../jquery/jquery-1.6.4.min.js"></script>
        <link rel="stylesheet" href="../css/estilo.css" />
        <script type="text/javascript" src="../jquery/script1.js"></script>

            
        <!--Estilos de el modal--->
        <SCRIPT TYPE="text/javascript">
            function verificarblancos(formulario){
                if(formulario.asunto.value =="" || formulario.remitente.value==""|| formulario.texto.value=="")
                    alert('Datos incompletos');
                else{
                    
                   
                   formulario.crear1.type = "submit";
                   Documento.method="post";
                   
                   
                    
                    
                   
                }
        }
        
        function cargarOtros(){
                var xmlHttp;
                try{
                    xmlHttp=new XMLHttpRequest(); // Firefox, Opera 8.0+, Safari
                }catch (e){
                    try{
                        xmlHttp=new ActiveXObject("Msxml2.XMLHTTP"); // Internet Explorer
                    }
                    catch (e){
                        try{
                            xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
                        }
                        catch (e){
                            alert("Tu explorador no soporta AJAX.");
                            return false;
                        }
                    }
                }
                
                xmlHttp.open("GET","creardocumento.jsp",true);
                xmlHttp.onreadystatechange=function() {
                    if (xmlHttp.readyState==4) {
                        var divOtros=document.getElementById("divotros");
                        divOtros.innerHTML=xmlHttp.responseText;
                        divOtros.style.zIndex ="50";
                    }
                }
                xmlHttp.send();
            }
            
            function cancelarOtros(){
                var divOtros=document.getElementById("divotros");
                divOtros.style.zIndex ="0";
                divOtros.removeChild(document.getElementById("formotro"));
            }    
            
            function cerrarOtros(){
                var nom=document.getElementById("nombret");
                var desc=document.getElementById("desct");
                
                if(nom.value =="" || desc.value==""){
                    alert('Datos del nuevo tipo incompletos');
                    return;
                }
                
                var xmlHttp;
                try{
                    xmlHttp=new XMLHttpRequest(); // Firefox, Opera 8.0+, Safari
                }catch (e){
                    try{
                        xmlHttp=new ActiveXObject("Msxml2.XMLHTTP"); // Internet Explorer
                    }
                    catch (e){
                        try{
                            xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
                        }
                        catch (e){
                            alert("Tu explorador no soporta AJAX.");
                            return false;
                        }
                    }
                }

                xmlHttp.open("GET","creardocumentoguardar.jsp?nombrett="+nom.value+"&desctt="+desc.value,true);
                xmlHttp.onreadystatechange=function() {
                    if (xmlHttp.readyState==4) {
                        cargarcombobox();
                    }
                }
                xmlHttp.send();
                
                //cargar combobox
                
                var divOtros=document.getElementById("divotros");
                divOtros.style.zIndex ="0";
                divOtros.removeChild(document.getElementById("formotro"));
            }
            
            function cargarcombobox(){
                var xmlHttp;
                try{
                    xmlHttp=new XMLHttpRequest(); // Firefox, Opera 8.0+, Safari
                }catch (e){
                    try{
                        xmlHttp=new ActiveXObject("Msxml2.XMLHTTP"); // Internet Explorer
                    }
                    catch (e){
                        try{
                            xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
                        }
                        catch (e){
                            alert("Tu explorador no soporta AJAX.");
                            return false;
                        }
                    }
                }
                xmlHttp.open("GET","creardocumentomostrar.jsp",true);
                xmlHttp.onreadystatechange=function() {
                    if (xmlHttp.readyState==4) {
                        var listatipos=document.getElementById("c_Combobox");
                        for (i = 0; i < listatipos.options.length; i++){
                            if(listatipos.options[i])
                                listatipos.remove(listatipos.options[i]);
                        }
                        listatipos.innerHTML=xmlHttp.responseText;
                    }
                }
                xmlHttp.send();
            }
        
        
        
        </SCRIPT>
            
                
                
            



        <script type="text/javascript" src="jquery/jquery-1.js"></script>


        <style type="text/css">
            #NavigationBar1 ul.navbar
            {
                list-style: none;
                margin: 0;
                padding: 0;
            }
            #NavigationBar1 ul.navbar li
            {
                height: 26px;
                width: 158px;
                margin: 0px 0px 4px 0px;
                vertical-align: bottom;
            }
            #NavigationBar1 ul.navbar li a
            {
                display: block;
                position: relative;
            }
            #NavigationBar1 ul.navbar li a img
            {
                position: absolute;
                z-index: 1;
                border-width: 0px;
            }
            #NavigationBar1 ul.navbar li span
            {
                display: block;
                height: 26px;
                width: 158px;
                position: absolute;
                z-index: 2;
            }
        </style>
        <style type="text/css">
            #TabMenu1
            {
                text-align: left;
                margin: 0px 0 1px 0;
                font-family: Arial;
                font-size: 16px;
                font-weight: normal;
                list-style-type: none;
                padding: 14px 0px 3px 10px;
            }
            #TabMenu1 li
            {
                display: inline;
            }
            #TabMenu1 a:link.active, #TabMenu1 a:visited.active, #TabMenu1 a:hover.active
            {
                border-bottom: 1px solid #F7F9FC;
                background-color: white;
                color: #FFFFFF;
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
        <script type="text/javascript">
            
            
            $(document).ready(function()
            {
                $("#NavigationBar1 .navbar a").hover(function()
                {
                    $(this).children("span").hide();
                }, function()
                {
                    $(this).children("span").show();
                })
            });
            
          
        </script>

        

    </head>


    <body BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>
         <%-- ventana emergente  --%>
        
        
        <div id="login-box" class="login-popup">
        <a href="#" class="close"><img src="../images/close.png" class="btn_close" title="Close Window" alt="Close" /></a>
          <form method="post" class="signin" action="bandejaBusqueda.jsp">
                <fieldset class="textbox">
            	<label class="username">
                <span>Ingrese un dato para la busqueda</span>
                <input id="codigo" name="codigo" value="" type="text" autocomplete="on" placeholder="Busqueda">
                </label>
              	<button class="submit button" type="submit">Buscar</button>                   
                </fieldset>
          </form>
        </div>
        
        
        <%--menus principales--%>
        
        <%--menus principales--%>
        
        <div style ="position:absolute;left:10%;top:40%;width:700px;height:90px;z-index:2 " >
            <span style="color:#1E4D80;font-family:Arial-Black;font-size:26px;"> Bienvenido : <% out.println(nombre+" "+apellido); %>    </span> 

        </div>
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
        <div id="NavigationBar1" style="position:absolute;left:10%;top:56%;width:158px;height:90px;z-index:2">
            <ul class="navbar">
                <li><a href="/SistemaTramiteDocumentario/bandeja/recibidostemp.jsp?nombreU=${nombreUsuario}&apellidoU=${apellidoUsuario}"><img alt="" src="/SistemaTramiteDocumentario/images/img0001_over.gif"><span><img alt="" src="/SistemaTramiteDocumentario/images/img0001.gif"></span></a></li>
                <li><a href="/SistemaTramiteDocumentario/bandeja/enviadostemp.jsp?nombreU=${nombreUsuario}&apellidoU=${apellidoUsuario}"><img alt="" src="/SistemaTramiteDocumentario/images/img0002_over.gif"><span><img alt="" src="/SistemaTramiteDocumentario/images/img0002.gif"></span></a></li>
                <li><a href="/SistemaTramiteDocumentario/bandeja/documentostemp.jsp?nombreU=${nombreUsuario}&apellidoU=${apellidoUsuario}"><img alt="" src="/SistemaTramiteDocumentario/images/img0003_over.gif"><span><img alt="" src="/SistemaTramiteDocumentario/images/img0003.gif"></span></a></li>
                <li><a href=""><img alt="" src="/SistemaTramiteDocumentario/images/imag004_over.gif"><span><img alt="" src="/SistemaTramiteDocumentario/images/imag004.gif"></span></a></li>
            </ul>
        </div>
        <div id="wb_TabMenu1" style="margin:0;padding:0;position:absolute;left:30%;top:45%;width:558px;height:10px;text-align:left;z-index:3;">
            <ul id="TabMenu1">
                <li><a href="nuevodocumentotemp.jsp?nombreU=${nombreUsuario}&apellidoU=${apellidoUsuario}"> Nuevo     </a></li>
                <li><a href="/SistemaTramiteDocumentario/bandejafuncion/aumentardescripciontemp.jsp?nombreU=${nombreUsuario}&apellidoU=${apellidoUsuario}"> Aumentar Descripcion </a></li>
                <li><a href="#login-box" class="login-window"> Busqueda    </a></li>
                <li><a href="/SistemaTramiteDocumentario/usuario/principalUsuariotemp.jsp?nombreU=${nombreUsuario}&apellidoU=${apellidoUsuario}">  Principal  </a></li>
            </ul>
        </div>

        <div style ="position: absolute;top:45%;left:0%;width: 100%">
            <IMG SRC="/SistemaTramiteDocumentario/images/layout_24.gif" WIDTH=100%    HEIGHT=50 ALT="">

        </div>                
        <div style ="position: absolute;top:38%;left:0%;width: 100%">
            <IMG SRC="/SistemaTramiteDocumentario/images/layout_24.gif" WIDTH=100%    HEIGHT=50 ALT="">

        </div>                






        <div id="wb_Form1" style="position:absolute;background-color:#F0F0F0;left:23%;top:55%;width:740px;height:360px;z-index:11">
            <form name="Documento" action="aceptacion.jsp"  >
                <div id="wb_Text9" style="margin:0;padding:0;position:absolute;left:45px;top:27px;width:131px;height:18px;text-align:left;z-index:0;">

                    <font style="font-size:13px" color="#1F4E7F" face="Arial"><b>Area de Inicio</b></font></div>
                <div id="wb_Text10" style="margin:0;padding:0;position:absolute;left:45px;top:63px;width:131px;height:18px;text-align:left;z-index:1;">
                    <font style="font-size:13px" color="#1E4D7F" face="Arial"><b>Asunto&nbsp; </b></font><font style="font-size:13px" color="#FFFFE0" face="Arial Black"><b>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp; </b></font></div>
                <div style ="position:absolute; left:23%;top:6%;font-size:20px;">

                <%
                        out.println(area1);
                %>

                </div>
                <input type="text" id="destino" style="position:absolute;left:166px;top:103px;width:480px;height:18px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:5" name="destino" value="${area}" >

                <div id="wb_Text11" style="margin:0;padding:0;position:absolute;left:46px;top:105px;width:109px;height:18px;text-align:left;z-index:3;">

                    <font style="font-size:13px" color="#1E4D7F" face="Arial"><b>Remitente </b></font><font style="font-size:13px" color="#FFFFE0" face="Arial Black"><b>&nbsp;&nbsp; &nbsp;&nbsp; </b></font></div>
                <div id="wb_Text1" style="margin:0;padding:0;position:absolute;left:480px;top:24px;width:70px;height:18px;text-align:left;z-index:4;">
                    <font style="font-size:13px" color="#1E4D7F" face="Arial"><b>Fecha:</b></font></div>
                <div id="wb_Text1" style="margin:0;padding:0;position:absolute;left:480px;top:65px;width:70px;height:18px;text-align:left;z-index:4;">
                    <font style="font-size:13px" color="#1E4D7F" face="Arial"><b>Tipo Doc:</b></font></div>

                <input type="text" id="remitente" style="position:absolute;left:166px;top:103px;width:480px;height:18px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:5" name="remitente" value="" >
                <input type="text" id="Editbox3" disabled  style="position:absolute;left:550px;top:23px;width:90px;height:18px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:6" name="fecha" value=

                       <%
                       out.print(sesion.getAttribute("fechadocumento"));
                       %>

                       >
                <input type="text" id="asunto" style="position:absolute;left:164px;top:61px;width:300px;height:18px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:7" name="asunto" value="">
                <textarea name="texto" id="TextArea1" style="position:absolute;left:27px;top:140px;width:620px;height:155px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:8" rows="8" cols="82"></textarea>
                <input id="crear" type="button" name="crear1" value="Agregar Descripcion" onclick="verificarblancos(this.form);" style="position:absolute;left:510px;top:320px;width:137px;height:25px;color:#1E4D7F;font-family:Arial;font-size:13px;z-index:9">

                  <select id="c_Combobox" name="cb_tipo" size="1" style="position:absolute;left:74.5%;top:16.8%;width:100px;height:25px;border-width:2px;font-family:Arial;font-size:13px;">

                    <%
                        DocumentoBD seltipdoc = new DocumentoBD();

                        ArrayList<String> tipdocs = new ArrayList<String>();
                        tipdocs = seltipdoc.seleccionarTipoDoc();

                        for (String a : tipdocs)
                            out.println("<option>" + a + "</option>");
                    %>
                    <option onclick="cargarOtros();">Otro</option>

                </select>

            </form>
        </div>

        <div id="divotros" style="position:absolute;background-color:white;left:23%;top:55%;width:740px;height:360px;z-index:0">
        </div>







    </body></html>