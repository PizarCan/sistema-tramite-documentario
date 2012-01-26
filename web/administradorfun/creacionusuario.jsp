<%@page import="com.Tramite.Conexion.UsuarioBD"%>
<%@page import="com.Tramite.Conexion.AreaBD"%>
<%@page import="com.Tramite.Conexion.TipoUsuarioBD"%>
<%@page import="java.util.ArrayList"%>
<html>
    
<head>
        <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Crear nuevo Usuario</title>
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/jquery-1.js"></script>
        <link href="/SistemaTramiteDocumentario/jquery/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/tablecloth.js"></script>
        <style type="text/css">

        </style>
        <link href="css/style.css" rel="stylesheet" type="text/css">
        
        <SCRIPT TYPE="text/javascript">
            
        function verificarblancos(formulario){
            if(formulario.t_Docidentidad.value =="" || formulario.t_Nombre.value==""
            || formulario.t_Apellido.value=="" || formulario.t_Nick.value==""
            || formulario.t_Password.value=="" || formulario.t_Correo.value=="")
                alert('Hay algunos campos vacios.');
            else{
              //  alert('Se inserto el usuario correctamente.');
                formulario.b_Aceptar.type = "submit";
                Form1.method="post";
                Form1.action="creacionusuariotemp.jsp";
            }
        }
        </SCRIPT>
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
        
    </head>
    <body BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>
        
        <ul id="TabMenu1" style ="position:absolute; top:40%;left:67%">
           
        
        <li><a href="/SistemaTramiteDocumentario/administrador/principalAdministrador.jsp">  Principal  </a></li>
        </ul>
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
        
        <%
            UsuarioBD ub = new UsuarioBD();
            int n = ub.buscarMaxID();
            String pasgen = Integer.toString(n);
            
            for(int i=0;i<6;++i)
                pasgen+=Integer.toString((n+i)%9);
        %>

        <div id="c_Form" style="position:absolute;background-color:#F0F0F0;left:23%;top:49%;width:720px;height:600px;z-index:11">

        <form name="Form1" id="c_FormRegistro">

            <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:5%;width:186px;height:16px;text-align:left;z-index:2;">                <font style="font-size:13px" color="#000000" face="Arial"><b>Documento de Identidad:</b></font></div>    
            <input id="c_Editbox" name="t_Docidentidad" value="" type="text" style="position:absolute;border:1px #000000 solid;left:50%;top:4.5%;width:236px;height:23px;z-index:15">
            <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:12%;width:186px;height:16px;text-align:left;z-index:3;">
                <font style="font-size:13px" color="#000000" face="Arial"><b>Nombres:</b></font>
            </div>
            <input id="c_Editbox" name="t_Nombre" value="" type="text" style="position:absolute;border:1px #000000 solid;left:50%;top:11.5%;width:236px;height:23px;z-index:16">

            <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:19%;width:186px;height:16px;text-align:left;z-index:4;">
                <font style="font-size:13px" color="#000000" face="Arial"><b>Apellidos:</b></font>
            </div>
            <input id="c_Editbox" name="t_Apellido" value="" type="text" style="position:absolute;border:1px #000000 solid;left:50%;top:18.5%;width:236px;height:23px;z-index:17">


            <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:26%;width:186px;height:16px;text-align:left;z-index:4;">
                <font style="font-size:13px" color="#000000" face="Arial"><b>Nick:</b></font>
            </div>
            <input id="c_Editbox" name="t_Nick" value="" type="text" style="position:absolute;border:1px #000000 solid;left:50%;top:25.5%;width:236px;height:23px;z-index:17">

            <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:33%;width:186px;height:16px;text-align:left;z-index:4;">
                <font style="font-size:13px" color="#000000" face="Arial"><b>Contraseña:</b></font>
            </div>
            <input id="c_Editbox" name="t_Password" value="<%=pasgen%>" type="text" style="position:absolute;border:1px #000000 solid;left:50%;top:32.5%;width:236px;height:23px;z-index:17">


            <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:40%;width:186px;height:16px;text-align:left;z-index:5;">
                <font style="font-size:13px" color="#000000" face="Arial"><b>Correo Electronico:</b></font>
            </div>
            <input id="c_Editbox" name="t_Correo" value="" type="text" style="position:absolute;border:1px #000000 solid;left:50%;top:39.5%;width:236px;height:21px;z-index:18">


            <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:47%;width:186px;height:16px;text-align:left;z-index:6;">
                <font style="font-size:13px" color="#000000" face="Arial"><b>Tipo de Usuario:</b></font>
            </div>
            <div style="position:absolute;left:50%;top:46.5%;width:236px;height:20px;border:1px black solid;z-index:14">
                <select id="c_Combobox" name="cb_Tusuario" size="1"  style="position:absolute;left:0px;top:0px;width:100%;height:100%;border-width:0px;font-family:Arial;font-size:13px;">
                    <%

                        TipoUsuarioBD seltipo = new TipoUsuarioBD();

                        ArrayList<String> tipos = new ArrayList<String>();
                        tipos = seltipo.seleccionarTiposNombre();

                        for (String t : tipos) {
                            out.println("<option>" + t + "</option>");
                        }

                    %>       
                </select>
            </div>

            <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:54%;width:186px;height:16px;text-align:left;z-index:6;">
                <font style="font-size:13px" color="#000000" face="Arial"><b>Area:</b></font>
            </div>
            <div style="position:absolute;left:50%;top:53.5%;width:236px;height:20px;border:1px black solid;z-index:14">
                <select id="c_Combobox" name="cb_Area" size="1"  style="position:absolute;left:0px;top:0px;width:100%;height:100%;border-width:0px;font-family:Arial;font-size:13px;">
                    <%

                        AreaBD selarea = new AreaBD();

                        ArrayList<String> areas = new ArrayList<String>();
                        areas = selarea.seleccionarAreasNombre();

                        for (String a : areas) {
                            out.println("<option>" + a + "</option>");
                        }

                    %>           
                </select>
            </div>


            <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:61%;width:186px;height:16px;text-align:left;z-index:7;">
                <font style="font-size:13px" color="#000000" face="Arial"><b>Estado:</b></font>
            </div>

            <div id="c_Text" style="margin:0;padding:0;position:absolute;left:50%;top:60%;width:6px;height:16px;text-align:left;z-index:12;">
                <font style="font-size:13px" color="#000000" face="Arial">Activo</font>
            </div>
            <div id="c_Text" style="margin:0;padding:0;position:absolute;left:70%;top:60%;width:6px;height:16px;text-align:left;z-index:13;">
                <font style="font-size:13px" color="#000000" face="Arial">Inactivo</font>
            </div>

            <input id="c_RadioButton" name="rb_Estado" value="activo" type="radio" style="position: absolute; left: 56%; top: 60%; z-index: 10;" checked>
            <input id="c_RadioButton" name="rb_Estado" value="inactivo" type="radio" style="position: absolute; left: 76%; top: 60%; z-index: 11;">

            <input id="c_Button" name="b_Aceptar" value="Aceptar" onclick="verificarblancos(this.form);" type="button" style="position: absolute; left: 40%; top: 80%; width: 96px; height: 25px; font-family: Arial; font-size: 13px; z-index: 8;">    
        </form>
        <form name="Form2" method="post" action="../administrador/principalAdministrador.jsp" id="c_FormRegistro">
            <input id="c_Button" name="b_Cancelar" value="Cancelar" type="submit" style="position: absolute; left: 60%; top: 80%; width: 96px; height: 25px; font-family: Arial; font-size: 13px; z-index: 9;">
        </form>                
                
        </div>  
                
    </div>
    <div style ="position: absolute;top:35%;left:0%;width: 100%">
        <IMG SRC="/SistemaTramiteDocumentario/images/layout_24.gif" WIDTH=100%    HEIGHT=50 ALT="">

    </div> 

    <div style ="position:absolute;left:37%;top:37%;width:400px;height:90px;z-index:2 " >
        <span style="color:#1E4D80;font-family:Arial-Black;font-size:26px;"> CREACION DE NUEVO USUARIO </span> 
    </div>
    
</body>

</html>