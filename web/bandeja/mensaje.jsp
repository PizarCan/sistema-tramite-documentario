<%@page import="com.Tramite.Model.DocumentoIn"%>
<%@page import="com.Tramite.Model.DocumentoHistorial"%>
<%@page import="com.Tramite.Model.Usuario"%>
<%@page import="com.Tramite.Model.DocumentoEntrada"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0014)about:internet -->

<!--jsp:include page="/SistemaTramiteDocumentario/index/seguridad.jsp"/-->

<html><head>



        <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Bandeja Entrada</title>



        <link rel="stylesheet" href="/SistemaTramiteDocumentario/css/style1.css" />
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/jquery-1.js"></script>
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/script.js"></script>
        <link href="/SistemaTramiteDocumentario/jquery/tablecloth/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="tablecloth.js"></script>
        
         <!--Estilos de el modal--->
        <script type="text/javascript" src="../jquery/jquery-1.6.4.min.js"></script>
        <link rel="stylesheet" href="../css/estilo.css" />
        <script type="text/javascript" src="../jquery/script1.js"></script>

            
        <!--Estilos de el modal--->
        
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
            <span style="color:#1E4D80;font-family:Arial-Black;font-size:26px;"> Bienvenido : 

                <%

                    HttpSession sesion = request.getSession();

                    String nombre = (String) sesion.getAttribute("nombreU");
                    String apellido = (String) sesion.getAttribute("apellidoU");

                    out.println(nombre + " " + apellido);

                    int codigo = Integer.parseInt((String) request.getParameter("codigo"));
                    DocumentoHistorial documentos = new DocumentoHistorial();
                    
                    DocumentoIn nuevo =documentos.conseguirCaracteristicas(codigo) ;
                    int cod = nuevo.getCodTipoDoc();
                %>
            </span> 

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
                <li><a href="recibidostemp.jsp?nombreU=${nombreUsuario}&apellidoU=${apellidoUsuario}"><img alt="" src="/SistemaTramiteDocumentario/images/img0001_over.gif"><span><img alt="" src="/SistemaTramiteDocumentario/images/img0001.gif"></span></a></li>
                <li><a href="enviadostemp.jsp?nombreU=${nombreUsuario}&apellidoU=${apellidoUsuario}"><img alt="" src="/SistemaTramiteDocumentario/images/img0002_over.gif"><span><img alt="" src="/SistemaTramiteDocumentario/images/img0002.gif"></span></a></li>
                <li><a href="documentostemp.jsp?nombreU=${nombreUsuario}&apellidoU=${apellidoUsuario}"><img alt="" src="/SistemaTramiteDocumentario/images/img0003_over.gif"><span><img alt="" src="/SistemaTramiteDocumentario/images/img0003.gif"></span></a></li>
                <li><a href="iniciadostemp.jsp?nombreU=${nombreUsuario}&apellidoU=${apellidoUsuario}"><img alt="" src="/SistemaTramiteDocumentario/images/imag004_over.gif"><span><img alt="" src="/SistemaTramiteDocumentario/images/imag004.gif"></span></a></li>
            </ul>
        </div>
        <div id="wb_TabMenu1" style="margin:0;padding:0;position:absolute;left:30%;top:46%;width:558px;height:42px;text-align:left;z-index:3;">
            <ul id="TabMenu1">
                <li><a href="/SistemaTramiteDocumentario/bandejafuncion/nuevodocumento.jsp"> Nuevo     </a></li>
                <li><a href="/SistemaTramiteDocumentario/bandejafuncion/aumentardescripciontemp.jsp?nombreU=${nombreUsuario}&apellidoU=${apellidoUsuario}"> Aumentar Descripcion </a></li>
                <li><a href="#login-box" class="login-window"> Busqueda    </a></li>
                <li><a href="principalUsuariotemp.jsp?nombreU=${nombreUsuario}&apellidoU=${apellidoUsuario}">  Principal  </a></li>
            </ul>
        </div>

        <div style ="position: absolute;top:45%;left:0%;width: 100%">
            <IMG SRC="/SistemaTramiteDocumentario/images/layout_24.gif" WIDTH=100%    HEIGHT=50 ALT="">

        </div>                
        <div style ="position: absolute;top:38%;left:0%;width: 100%">
            <IMG SRC="/SistemaTramiteDocumentario/images/layout_24.gif" WIDTH=100%    HEIGHT=50 ALT="">

        </div>                

        <div id="wb_Form1" style="position:absolute;background-color:#F3F7FD; left:25%;top:53%;width:980px;height:120px;z-index:11">
            <span style="color:#848688;font-family:Arial-Black;font-size:16px;position:absolute;left:20px;top:5px;"> Codigo Doc:
            </span>
            <span style="color:#848688;font-family:Arial-Black;font-size:16px;position:absolute;left:20px;top:30px;"> Asunto Doc:
            </span>
            <span style="color:#848688;font-family:Arial-Black;font-size:16px;position:absolute;left:20px;top:55px;"> Remitente :                 
            </span>
            <span style="color:#848688;font-family:Arial-Black;font-size:16px;position:absolute;left:20px;top:80px;"> Fecha Inicio:                                 
            </span> 
            <span style="color:#848688;font-family:Arial-Black;font-size:16px;position:absolute;left:500px;top:80px;">   Tipo Doc  :
            </span> 
            
            
            
            <span style="color:#1E4D80;font-family:Arial-Black;font-size:16px;position:absolute;left:200px;top:5px;"> <% out.print(nuevo.getCodDoc()); %>
            </span>
            <span style="color:#1E4D80;font-family:Arial-Black;font-size:16px;position:absolute;left:200px;top:30px;"> <% out.print(nuevo.getAsuntoDoc()); %>
            </span>
            <span style="color:#1E4D80;font-family:Arial-Black;font-size:16px;position:absolute;left:200px;top:55px;"> <% out.print(nuevo.getRemitente()); %>
            </span>
            <span style="color:#1E4D80;font-family:Arial-Black;font-size:16px;position:absolute;left:200px;top:80px;"> <% out.print(nuevo.getFechaInicio()); %> 
            </span>
            <span style="color:#1E4D80;font-family:Arial-Black;font-size:16px;position:absolute;left:600px;top:80px;"> <%   out.print(documentos.conseguirArea(cod));%> 
            </span>
            
            
        </div>
        <div style ="width:800px;height:200px;position:absolute; top:72%;left:25%">  



            <table cellpadding="0" cellspacing="0" border="0" id="table" class="sortable" >		

                <!--style="cursor:pointer"-->
                <tr >				
                    <th style ="width:15px; text-align:center;" >Historial</th>
                    <th style ="width:350px;text-align:center; ">Descripcion</th>
                    <th style ="width:50px;text-align:center;">Fecha</th>
                    <th style ="width:200px;text-align:center;">Usuario</th>
                    <th style ="width:130px;text-align:center;">Area</th>
                    <th style ="width:50px;text-align:center;">Estado</th>
                    

                </tr>

                <%

                    //codTra,descripcionTra,fecTra,nombreUsu,nombreEst



                    
                    ArrayList<DocumentoHistorial> respuesta = documentos.conseguirConsulta(codigo);

                    for (DocumentoHistorial d : respuesta) {
                        out.println("<tr>" + d + "</tr>");
                    }

                    //ArrayList <DocumentoEntrada> List = (ArrayList<DocumentoEntrada>)(request.getAttribute("documentos")); 

                %>



            </table>



        </div>


    </body></html>