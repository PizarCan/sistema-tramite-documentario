<%@page import="com.Tramite.Conexion.UsuarioBD"%>
<%@page import="com.Tramite.Model.Usuario"%>
<%@page import="java.util.ArrayList"%>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Modificacion de Datos</title>
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/jquery-1.js"></script>
        <link href="/SistemaTramiteDocumentario/jquery/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="/SistemaTramiteDocumentario/jquery/tablecloth.js"></script>
        
        <link href="css/style.css" rel="stylesheet" type="text/css">
        
        <script type="text/javascript">
            filas[1].className=selected;
            
            function modificar(){
                var tab = document.getElementById('tabla')
                var filas = tab.getElementsByTagName('tr');
                //alert(filas.length);//num filas
                var filaSeleccionada = retornarFilaSel();
                
                if(filaSeleccionada==-1)
                    alert('Seleccione una fila');
                else{
                    //for(i =1;i<filas.length; i++ ){
                    //for(j=0;j<5;j++){ //columnas
                        //alert(filas[i].getElementsByTagName('td')[j].innerHTML); //elems desde fila 1
                        //if(filas[i].className=='selected')
                        //alert(filas[filaSeleccionada].getElementsByTagName('td')[j].innerHTML);
                    //}
                    
                    var cod= filas[filaSeleccionada].getElementsByTagName('td')[0].innerHTML;
                    
                    Form2.b_modificar.type = "submit";
                    Form2.method="post";
                    Form2.action="gestionusuario2.jsp?Codigo="+cod;
                    
                    //}
                }
            }
        </script>
        
    </head>
    <body BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>
        <TABLE WIDTH=100% BORDER=0 CELLPADDING=0 CELLSPACING=0 id="cabecera">
            <TR>
                <TD COLSPAN=4 ROWSPAN=1>
                    <IMG SRC="/SistemaTramiteDocumentario/images/arequipa.png" WIDTH=100%    HEIGHT=200 ALT=""></TD>

                <TD COLSPAN=4 ROWSPAN=1>
                    <IMG SRC="/SistemaTramiteDocumentario/images/logo.png" WIDTH=100% HEIGHT=200 ALT=""></TD>
                <TD COLSPAN=4 ROWSPAN=1>
                    <IMG SRC="/SistemaTramiteDocumentario/images/arequipa.png" WIDTH=100% HEIGHT=200 ALT=""></TD>
            </TR>

        </TABLE>

        <div style ="width:800px;height:100px;position:absolute; top:45%;left:20%">      
            <table style="cursor:pointer" id="tabla">			
                <tr >				
                    
                    <th style ="width:50px;text-align:center; ">Codigo</th>
                    <th style ="width:120px;text-align:center;">Nombre Usuario</th>
                    <th style ="width:250px;text-align:center;">Apellidos de Usuario</th>
                    <th style ="width:120px;text-align:center;">Area</th>
                    <th style ="width:120px;text-align:center;">Nick Usuario</th>
                </tr>

                <%
 
                  //RESULTADO DE BUSQUEDA DE USUARIOS   
                  String nom =(String)request.getParameter("Nombre");
                  String ape =(String)request.getParameter("Apellido");
                  String cod =(String)request.getParameter("Codigo");
                  
                  Usuario usbusqueda = new Usuario(cod,nom,ape);
                  ArrayList<Usuario> respuesta = new ArrayList<Usuario>();
                  
                  //out.println(nom+"   "+ ape+"   "+cod);
                  
                  //out.println("<tr>"+"<td>"+"123"+"</td><td>"+"nombr1"+"</td><td>"+"ape"+"</td><td>"+"area"+"</td><td>"+"nic"+"</td>"+"</tr>");
                  //out.println("<tr>"+"<td>"+"523"+"</td><td>"+"nombr2"+"</td><td>"+"ape2"+"</td><td>"+"area2"+"</td><td>"+"nic2"+"</td>"+"</tr>");
                  
                  if(cod!=""){
                        respuesta = usbusqueda.conseguirConsultaDNI();                        
                  }else if(nom!="" && ape==""){
                        respuesta = usbusqueda.conseguirConsultaNombre();
                  }else if(nom=="" && ape!=""){
                        respuesta = usbusqueda.conseguirConsultaApellido();
                  }else if(nom!="" && ape!=""){
                        respuesta = usbusqueda.conseguirConsultaNA();
                  }
                  if(!respuesta.isEmpty()){
                    for (Usuario d : respuesta){
                        out.println("<tr>"+d.toString()+"</tr>");
                    }
                  }

                    //out.println("<tr> No se encontro resultado. </tr>");
                %>
                
            </table>

        </div>
                
       <form name="Form2" id="c_FormRegistro">
            <input id="modif" name="b_modificar" value="Modificar"  type="button" onclick="modificar();" style="position: absolute; left: 45%; top: 80%; width: 96px; height: 25px; font-family: Arial; font-size: 13px; z-index: 9;">
       </form> 
   
    <div style ="position: absolute;top:35%;left:0%;width: 100%">
        <IMG SRC="/SistemaTramiteDocumentario/images/layout_24.gif" WIDTH=100%    HEIGHT=50 ALT="">

    </div> 

    <div style ="position:absolute;left:37%;top:37%;width:600px;height:90px;z-index:2 " >
        <span style="color:#1E4D80;font-family:Arial-Black;font-size:26px;"> ELECCION DE USUARIO </span> 
    </div>
                
</body>
</html>