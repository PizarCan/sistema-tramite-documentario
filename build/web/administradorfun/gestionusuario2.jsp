<%@page import="com.Tramite.Conexion.UsuarioBD"%>
<%@page import="com.Tramite.Model.Usuario"%>
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
            if(formulario.t_Nombre.value==""
            || formulario.t_Apellido.value=="" 
            || formulario.t_Correo.value=="")
                alert('Hay algunos campos vacios.');
            else{
                alert('Se modificaron los datos del usuario.');
                formulario.b_Aceptar.type = "submit";
                Form1.method="post";
                Form1.action="gestionusuariotemp.jsp?t_Docident="+formulario.t_Docidentidad.value;
            }
        }
        </SCRIPT>
        
    </head>
    <body BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>
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
        
        <div id="c_Form" style="position:absolute;background-color:#F0F0F0;left:23%;top:49%;width:720px;height:600px;z-index:11">
        <%
              //RESULTADO DE BUSQUEDA DE USUARIOS   
              String docid =(String)request.getParameter("Codigo");
              UsuarioBD usbusqueda = new UsuarioBD();
              ArrayList<Usuario> respuesta = usbusqueda.consultarUsuario(docid);
              if(respuesta.isEmpty()) respuesta.add(new Usuario(0,"","","",2,4,1));
              
            int codigo = respuesta.get(0).getCodigo();
            String nombre = respuesta.get(0).getNombre();
            String apellido = respuesta.get(0).getApellido();
            String correo = respuesta.get(0).getCorreo();
            int tipousuario = respuesta.get(0).getTipousuario();
            int area = respuesta.get(0).getArea();
            int estado = respuesta.get(0).getEstado();

            if(estado==1){%>
                <input id="c_RadioButton" name="rb_Estado" value="activo" type="radio" style="position: absolute; left: 56%; top: 56%; z-index: 10;" checked>
                <input id="c_RadioButton" name="rb_Estado" value="inactivo" type="radio" style="position: absolute; left: 76%; top: 56%; z-index: 11;">
            <%}
            else{%>
                <input id="c_RadioButton" name="rb_Estado" value="activo" type="radio" style="position: absolute; left: 56%; top: 56%; z-index: 10;">
                <input id="c_RadioButton" name="rb_Estado" value="inactivo" type="radio" style="position: absolute; left: 76%; top: 56%; z-index: 11;" checked>
            <%}
        %>

        
            <form name="Form1" id="c_FormRegistro">
                <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:5%;width:186px;height:16px;text-align:left;z-index:2;">                
                    <font style="font-size:13px" color="#000000" face="Arial"><b>Codigo Usuario:</b></font>
                </div>    
                <input id="c_Editbox" name="t_codigo" disabled value="<%=codigo%>" type="text"  style="position:absolute;border:1px #000000 solid;left:50%;top:4.5%;width:236px;height:23px;z-index:15">

                <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:12%;width:186px;height:16px;text-align:left;z-index:2;">                
                    <font style="font-size:13px" color="#000000" face="Arial"><b>Documento de Identidad:</b></font>
                </div>    
                
                <input id="c_Editbox" name="t_Docidentidad" disabled value="<%=docid%>" type="text" style="position:absolute;border:1px #000000 solid;left:50%;top:11.5%;width:236px;height:23px;z-index:15">
                
                <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:19%;width:186px;height:16px;text-align:left;z-index:3;">
                    <font style="font-size:13px" color="#000000" face="Arial"><b>Nombres:</b></font>
                </div>
                <input id="c_Editbox" name="t_Nombre" value="<%=nombre%>" type="text" style="position:absolute;border:1px #000000 solid;left:50%;top:18.5%;width:236px;height:23px;z-index:16">

                <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:26%;width:186px;height:16px;text-align:left;z-index:4;">
                    <font style="font-size:13px" color="#000000" face="Arial"><b>Apellidos:</b></font>
                </div>
                <input id="c_Editbox" name="t_Apellido" value="<%=apellido%>" type="text" style="position:absolute;border:1px #000000 solid;left:50%;top:25.5%;width:236px;height:23px;z-index:17">
                
                <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:33%;width:186px;height:16px;text-align:left;z-index:5;">
                    <font style="font-size:13px" color="#000000" face="Arial"><b>Correo Electronico:</b></font>
                </div>
                <input id="c_Editbox" name="t_Correo" value="<%=correo%>" type="text" style="position:absolute;border:1px #000000 solid;left:50%;top:32.5%;width:236px;height:21px;z-index:18">


                <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:40%;width:186px;height:16px;text-align:left;z-index:6;">
                    <font style="font-size:13px" color="#000000" face="Arial"><b>Tipo de Usuario:</b></font>
                </div>
                <div style="position:absolute;left:50%;top:39.5%;width:236px;height:20px;border:1px black solid;z-index:14">
                    <select id="c_Combobox" name="cb_Tusuario" size="1"  style="position:absolute;left:0px;top:0px;width:100%;height:100%;border-width:0px;font-family:Arial;font-size:13px;">
                        <%

                            TipoUsuarioBD seltipo = new TipoUsuarioBD();

                            ArrayList<String> tipos = new ArrayList<String>();
                            tipos = seltipo.seleccionarTiposNombre();
                            int k=1;
                            for (String t : tipos) {
                                if(k!=tipousuario)
                                    out.println("<option>" + t + "</option>");
                                else
                                    out.println("<option SELECTED>" + t + "</option>");
                                k++;
                            }
                                
                        %>       
                    </select>
                </div>

                <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:47%;width:186px;height:16px;text-align:left;z-index:6;">
                    <font style="font-size:13px" color="#000000" face="Arial"><b>Area:</b></font>
                </div>
                <div style="position:absolute;left:50%;top:46.5%;width:236px;height:20px;border:1px black solid;z-index:14">
                    <select id="c_Combobox" name="cb_Area" size="1"  style="position:absolute;left:0px;top:0px;width:100%;height:100%;border-width:0px;font-family:Arial;font-size:13px;">
                        <%

                            AreaBD selarea = new AreaBD();

                            ArrayList<String> areas = new ArrayList<String>();
                            areas = selarea.seleccionarAreasNombre();
                            
                            k=1;    
                            for (String a : areas) {
                                if(k!=area)
                                    out.println("<option>" + a + "</option>");
                                else
                                    out.println("<option SELECTED>" + a + "</option>");
                                k++;
                            }

                        %>           
                    </select>
                </div>


                <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:56%;width:186px;height:16px;text-align:left;z-index:7;">
                    <font style="font-size:13px" color="#000000" face="Arial"><b>Estado:</b></font>
                </div>

                <div id="c_Text" style="margin:0;padding:0;position:absolute;left:50%;top:56%;width:6px;height:16px;text-align:left;z-index:12;">
                    <font style="font-size:13px" color="#000000" face="Arial">Activo</font>
                </div>
                <div id="c_Text" style="margin:0;padding:0;position:absolute;left:70%;top:56%;width:6px;height:16px;text-align:left;z-index:13;">
                    <font style="font-size:13px" color="#000000" face="Arial">Inactivo</font>
                </div>

                <input id="c_Button" name="b_Aceptar" value="Modificar" onclick="verificarblancos(this.form);" type="button" style="position: absolute; left: 40%; top: 70%; width: 96px; height: 25px; font-family: Arial; font-size: 13px; z-index: 8;">    
            </form>
            <form name="Form2" method="post" action="/SistemaTramiteDocumentario/administrador/principalAdministrador.jsp" id="c_FormRegistro">
                <input id="c_Button" name="b_Cancelar" value="Cancelar" type="submit" style="position: absolute; left: 60%; top: 70%; width: 96px; height: 25px; font-family: Arial; font-size: 13px; z-index: 9;">
            </form>                

        </div>  

        <div style ="position: absolute;top:35%;left:0%;width: 100%">
            <IMG SRC="/SistemaTramiteDocumentario/images/layout_24.gif" WIDTH=100%    HEIGHT=50 ALT="">

        </div> 

        <div style ="position:absolute;left:37%;top:37%;width:600px;height:90px;z-index:2 " >
            <span style="color:#1E4D80;font-family:Arial-Black;font-size:26px;"> ELECCION DE USUARIO </span> 
        </div>

    </body>

</html>