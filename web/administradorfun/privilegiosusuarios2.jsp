<%@page import="com.Tramite.Model.Usuario"%>
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
        <style type="text/css"></style>
        <link href="css/style.css" rel="stylesheet" type="text/css">
        
        <SCRIPT TYPE="text/javascript">
        function actualizar(formulario){
            alert('Se modificaron privilegios del usuario.');
            formulario.b_Aceptar.type = "submit";
            Form1.method="post";
            Form1.action="gestionusuariotemp.jsp?t_Docident="+formulario.t_Docidentidad.value;
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

        <div id="c_Form" style="position:absolute;background-color:#F0F0F0;left:23%;top:45%;width:720px;height:150px;z-index:11">
            <%
                //RESULTADO DE BUSQUEDA DE USUARIOS   
                String docid =(String)request.getParameter("Codigo");
                UsuarioBD usbusqueda = new UsuarioBD();
                ArrayList<Usuario> respuesta = usbusqueda.consultarUsuario(docid);
                if(respuesta.isEmpty()) respuesta.add(new Usuario(0,"","","",0,0,0));

                int codigo = respuesta.get(0).getCodigo();
                String docident = respuesta.get(0).getDni();
                String nombre = respuesta.get(0).getNombre();
                String apellido = respuesta.get(0).getApellido();        
            %>
            
            <form name="Form1" method="post" action="gestionusuario2.jsp" id="c_FormRegistro">
                <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:5%;width:186px;height:16px;text-align:left;z-index:2;">                
                    <font style="font-size:13px" color="#000000" face="Arial"><b>Codigo Usuario:</b></font>
                </div>    
                <input id="c_Editbox" name="t_codigo"  value="<%=codigo%>" type="text" disabled style="position:absolute;border:1px #000000 solid;left:50%;top:4.5%;width:236px;height:23px;z-index:15">

                <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:30%;width:186px;height:16px;text-align:left;z-index:2;">                
                    <font style="font-size:13px" color="#000000" face="Arial"><b>Documento de Identidad:</b></font>
                </div>    
                <input id="c_Editbox" disabled name="t_Docidentidad" value="<%=docident%>" type="text" style="position:absolute;border:1px #000000 solid;left:50%;top:29.5%;width:236px;height:23px;z-index:15">
                
                <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:55%;width:186px;height:16px;text-align:left;z-index:3;">
                    <font style="font-size:13px" color="#000000" face="Arial"><b>Nombres:</b></font>
                </div>
                <input id="c_Editbox" disabled name="t_Nombre" value="<%=nombre%>" type="text" style="position:absolute;border:1px #000000 solid;left:50%;top:54.5%;width:236px;height:23px;z-index:16">

                <div id="c_Text" style="margin:0;padding:0;position:absolute;left:20%;top:80%;width:186px;height:16px;text-align:left;z-index:4;">
                    <font style="font-size:13px" color="#000000" face="Arial"><b>Apellidos:</b></font>
                </div>
                <input id="c_Editbox" disabled name="t_Apellido" value="<%=apellido%>" type="text" style="position:absolute;border:1px #000000 solid;left:50%;top:79%;width:236px;height:23px;z-index:17">

            </form>
                
        </div>
        <div style ="position: absolute;top:35%;left:0%;width: 100%">
            <IMG SRC="/SistemaTramiteDocumentario/images/layout_24.gif" WIDTH=100%    HEIGHT=50 ALT="">

        </div> 
        <div style ="position:absolute;left:30%;top:37%;width:600px;height:90px;z-index:2 " >
            <span style="color:#1E4D80;font-family:Arial-Black;font-size:26px;"> USUARIO SELECCIONADO - MODIFICACION </span> 
        </div>

        <div style ="width:800px;height:100px;position:absolute; top:67%;left:20%">      
            <table style="cursor:pointer">			
                <tr >				

                    <th style ="width:50px;text-align:center; ">Seleccion</th>
                    <th style ="width:120px;text-align:center;">Codigo Privilegio</th>
                    <th style ="width:250px;text-align:center;">Nombre Privilegio</th>
                    
                </tr>

                <%        
                //<input id="c_Button" name="b_Aceptar" value="Modificar" onclick="verificarblancos(this.form);" type="button" style="position: absolute; left: 40%; top: 70%; width: 96px; height: 25px; font-family: Arial; font-size: 13px; z-index: 8;">    
                
                  Usuario usbus = new Usuario();
                  ArrayList<Usuario> privilegios = new ArrayList<Usuario>();
                  
                  if(!privilegios.isEmpty()){
                    for (Usuario d : privilegios){
                        out.println("<tr>"+d.toString()+"</tr>");
                    }
                  }
                    
                    //out.println("<tr> No se encontro resultado. </tr>");
                %>

            </table>



        </div>

    </body>

</html>