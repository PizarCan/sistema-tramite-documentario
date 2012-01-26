<%@page import="com.Tramite.Conexion.AreaBD"%>
<%@page import="com.Tramite.Conexion.TipoUsuarioBD"%>
<%@page import="java.util.ArrayList"%>
<html>
    
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Gestion de Privilegios</title>
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/jquery-1.js"></script>
        <link href="/SistemaTramiteDocumentario/jquery/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/tablecloth.js"></script>

        <link href="css/style.css" rel="stylesheet" type="text/css">
  
        <script type="text/javascript">
            function verificarblancos(formu){
                if(formu.t_Nombre.value=="" && formu.t_Apellido.value=="" && formu.t_Codigo.value=="")
                    alert("Debe ingresar un dato para la busqueda");
                else{
                    formu.Buscar.type = "submit";
                    Form1.method="post";
                    Form1.action="privilegiosusuarios1.jsp?Nombre=" +formu.t_Nombre.value +"&Apellido="+formu.t_Apellido.value+"&Codigo="+formu.t_Codigo.value;
                }
            }
        </script> 
        
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

        <div id="wb_Form1" style="position:absolute;background-color:#F0F0F0;left:35%;top:50%;width:461px;height:189px;">
            <form name="Form1" enctype="text/plain" id="Form1">
                
                <div id="wb_Text1" style="margin:0;padding:0;position:absolute;left:52px;top:19px;width:105px;height:16px;text-align:left;z-index:13;">
                    <font style="font-size:13px" color="#000000" face="Arial">Ingresar Nombre</font>
                </div>
                <input type="text" id="Editbox1" style="position:absolute;left:236px;top:16px;width:179px;height:18px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:11" name="t_Nombre" value="">
                    
                <div id="wb_Text2" style="margin:0;padding:0;position:absolute;left:52px;top:53px;width:105px;height:32px;text-align:left;z-index:14;">
                    <font style="font-size:13px" color="#000000" face="Arial">Ingresar Apellidos</font>
                </div>
                <input type="text" id="Editbox2" style="position:absolute;left:237px;top:47px;width:178px;height:18px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:10" name="t_Apellido" value="">
                    
                <div id="wb_Text3" style="margin:0;padding:0;position:absolute;left:53px;top:87px;width:105px;height:16px;text-align:left;z-index:12;">
                    <font style="font-size:13px" color="#000000" face="Arial">Ingresar Codigo</font>
                </div>
                <input type="text" id="Editbox3" style="position:absolute;left:237px;top:83px;width:177px;height:18px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:9" name="t_Codigo" value="">
                    
                <input type="button" id="Button1" name="Buscar" onclick="verificarblancos(this.form);" value="Buscar" style="position:absolute;left:200px;top:142px;width:96px;height:25px;font-family:Arial;font-size:13px;z-index:15">
            </form>
        </div>

    </div>
    <div style ="position: absolute;top:35%;left:0%;width: 100%">
        <IMG SRC="/SistemaTramiteDocumentario/images/layout_24.gif" WIDTH=100%    HEIGHT=50 ALT="">

    </div> 

    <div style ="position:absolute;left:30%;top:37%;width:600px;height:90px;z-index:2 " >
        <span style="color:#1E4D80;font-family:Arial-Black;font-size:26px;"> ADMINISTRACION DE PRIVILEGIOS - BUSQUEDA </span> 
    </div>



</body>

</html>