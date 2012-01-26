<%@page import="com.Tramite.Model.Transaccion"%>
<%@page import="com.Tramite.Conexion.AumentarDescripcionBD"%>
<%@page import="com.Tramite.Conexion.DocumentoBD"%>
<%@page import="com.Tramite.Conexion.AreaBD"%>
<%@page import="com.Tramite.Model.Usuario"%>
<%@page import="com.Tramite.Model.DocumentoEntrada"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0014)about:internet -->


<%




    HttpSession sesion = request.getSession();
    String nombre = (String) sesion.getAttribute("nombreU");
    String apellido = (String) sesion.getAttribute("apellidoU");
    String area1 = (String) sesion.getAttribute("area");
    String codigo = (String) sesion.getAttribute("codigo");

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


        <!--Estilos de el modal--->
        <script type="text/javascript" src="../jquery/jquery-1.6.4.min.js"></script>
        <link rel="stylesheet" href="../css/estilo.css" />
        <script type="text/javascript" src="../jquery/script1.js"></script>


        <!--Estilos de el modal--->



        <SCRIPT TYPE="text/javascript">
            function verificarblancos(formulario){
                
                if(formulario.texto.value=="")
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
            <span style="color:#1E4D80;font-family:Arial-Black;font-size:26px;"> Bienvenido : <% out.println(nombre + " " + apellido);%>    </span> 

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
        <div id="wb_TabMenu1" style="margin:0;padding:0;position:absolute;left:30%;top:45%;width:558px;height:42px;text-align:left;z-index:3;">
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


        <div style ="width:800px;height:200px;position:absolute; top:53%;left:25%; cursor:pointer;">  
            <table cellpadding="0" cellspacing="0" border="0" id="table" class="sortable" >			
                <thead>
                    <tr >				
                        <th class="nosort" style ="width:15px; text-align:center;" ><h3>Cod Doc</h3></th>
                        <th style ="width:140px;text-align:center; "><h3>Nombre Origen</h3></th>
                        <th style ="width:140px;text-align:center;"><h3>Area </h3></th>
                        <th style ="width:50px;text-align:center;"><h3>Estado</h3></th>
                        <th style ="width:50px;text-align:center;"><h3>Fecha</h3></th>
                        <th style ="width:200px;text-align:center;"><h3>Ultima Descrip</h3></th>
                    </tr>
                </thead>
                <tbody style="cursor:pointer;">
                    <%

                        Usuario nuevo = new Usuario("", "");
    //                        String nombre1 = (String) request.getAttribute("nombreUsuario");
                        //                      String apellido1 = (String) request.getAttribute("apellidoUsuario");
                        DocumentoBD selAreas = new DocumentoBD();
                        nuevo.setNombre(nombre);
                        nuevo.setApellido(apellido);


                        AumentarDescripcionBD bd = new AumentarDescripcionBD();
                        Transaccion d = bd.conseguirUltimaDescripcion(Integer.parseInt(codigo));
                        String asunto = selAreas.conseguirAsunto(Integer.parseInt(codigo));
                        out.println("<tr>" + d + "</tr>");



                        //ArrayList <DocumentoEntrada> List = (ArrayList<DocumentoEntrada>)(request.getAttribute("documentos")); 

                    %>
                </tbody>


            </table>

        </div>


        <div id="wb_Form1" style="position:absolute;background-color:#E5F1F4;left:25%;top:65%;width:980px;height:300px;z-index:11">
            <form name="Documento" action="aceptacionaumentar.jsp"  >
                <div id="wb_Text1" style="margin:0;padding:0;position:absolute;left:400px;top:10px;width:400px;height:18px;text-align:left;z-index:4;">
                    <font style="font-size:13px" color="#1E4D7F" face="Arial"><b>INGRESO DE DESCRIPCION</b></font></div>





                <div id="wb_Text1" style="margin:0;padding:0;position:absolute;left:600px;top:50px;width:70px;height:18px;text-align:left;z-index:4;">
                    <font style="font-size:13px" color="#1E4D7F" face="Arial-Black"><b>Fecha:</b></font></div>
                <div id="wb_Text1" style="margin:0;padding:0;position:absolute;left:600px;top:85px;width:70px;height:18px;text-align:left;z-index:4;">
                    <font style="font-size:13px" color="#1E4D7F" face="Arial-Black"><b>Estado :</b></font></div>
                <div id="wb_Text1" style="margin:0;padding:0;position:absolute;left:250px;top:50px;width:100px;height:18px;text-align:left;z-index:4;">
                    <font style="font-size:13px" color="#1E4D7F" face="Arial-Black"><b>Asunto aa</b></font></div> 

                <div id="wb_Text1" style="margin:0;padding:0;position:absolute;left:350px;top:50px;width:200px;height:18px;text-align:left;z-index:4;">
                    <font style="font-size:15px" color="#1E4D7F" face="Arial"><b><%out.print(asunto);%></b></font></div>     

                <div id="wb_Text1" style="margin:0;padding:0;position:absolute;left:250px;top:85px;width:100px;height:18px;text-align:left;z-index:4;">
                    <font style="font-size:13px" color="#1E4D7F" face="Arial-Black"><b>Area Destino</b></font></div>


                <input type="text" id="Editbox3" disabled  style="position:absolute;left:680px;top:48px;width:90px;height:18px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:6" name="fecha" value=

                       <%
                           out.print(sesion.getAttribute("fechadocumento"));
                       %>

                       >

                <textarea name="texto" id="TextArea1" style="position:absolute;left:250px;top:120px;width:525px;height:100px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:8" rows="8" cols="82"></textarea>
                <input id="crear" type="button" name="crear1" value="Agregar Descripcion" onclick="verificarblancos(this.form);" style="position:absolute;left:450px;top:230px;width:137px;height:25px;color:#1E4D7F;font-family:Arial;font-size:13px;z-index:9">
                <select id="c_Combobox1" name="cb_tipo1" size="1" style="position:absolute;left:350px;top:80px;width:120px;height:25px;border-width:2px;font-family:Arial;font-size:13px;">

                    <%


                        ArrayList<String> areasdocs = new ArrayList<String>();
                        areasdocs = selAreas.seleccionarAreasDoc();

                        for (String a : areasdocs) {
                            out.println("<option>" + a + "</option>");
                        }
                    %>
                </select> 
                <select id="c_Combobox" name="cb_tipo" size="1" style="position:absolute;left:680px;top:80px;width:100px;height:25px;border-width:2px;font-family:Arial;font-size:13px;">

                    <%
                        DocumentoBD seltipdoc = new DocumentoBD();

                        ArrayList<String> estdocs = new ArrayList<String>();
                        estdocs = seltipdoc.seleccionarEstadoDoc();

                        for (String a : estdocs) {
                            out.println("<option>" + a + "</option>");
                        }
                    %>
                    <%--    <option onclick="cargarOtros();">Otro</option>
                    --%>
                </select>

            </form>
        </div>

        <div id="wb_Form1" style="position:absolute;background-color:WHITE;left:25%;top:700px;width:980px;height:200px;z-index:11">
        </div>







    </body></html>