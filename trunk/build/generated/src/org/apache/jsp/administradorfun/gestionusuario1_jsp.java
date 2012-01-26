package org.apache.jsp.administradorfun;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Tramite.Conexion.UsuarioBD;
import com.Tramite.Model.Usuario;
import java.util.ArrayList;

public final class gestionusuario1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Modificacion de Datos</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"/SistemaTramiteDocumentario/jquery/jquery-1.js\"></script>\n");
      out.write("        <link href=\"/SistemaTramiteDocumentario/jquery/tablecloth.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"/SistemaTramiteDocumentario/jquery/tablecloth.js\"></script>\n");
      out.write("        \n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            filas[1].className=selected;\n");
      out.write("            \n");
      out.write("            function modificar(){\n");
      out.write("                var tab = document.getElementById('tabla')\n");
      out.write("                var filas = tab.getElementsByTagName('tr');\n");
      out.write("                //alert(filas.length);//num filas\n");
      out.write("                var filaSeleccionada = retornarFilaSel();\n");
      out.write("                \n");
      out.write("                if(filaSeleccionada==-1)\n");
      out.write("                    alert('Seleccione una fila');\n");
      out.write("                else{\n");
      out.write("                    //for(i =1;i<filas.length; i++ ){\n");
      out.write("                    //for(j=0;j<5;j++){ //columnas\n");
      out.write("                        //alert(filas[i].getElementsByTagName('td')[j].innerHTML); //elems desde fila 1\n");
      out.write("                        //if(filas[i].className=='selected')\n");
      out.write("                        //alert(filas[filaSeleccionada].getElementsByTagName('td')[j].innerHTML);\n");
      out.write("                    //}\n");
      out.write("                    \n");
      out.write("                    var cod= filas[filaSeleccionada].getElementsByTagName('td')[0].innerHTML;\n");
      out.write("                    \n");
      out.write("                    Form2.b_modificar.type = \"submit\";\n");
      out.write("                    Form2.method=\"post\";\n");
      out.write("                    Form2.action=\"gestionusuario2.jsp?Codigo=\"+cod;\n");
      out.write("                    \n");
      out.write("                    //}\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>\n");
      out.write("        <TABLE WIDTH=100% BORDER=0 CELLPADDING=0 CELLSPACING=0 id=\"cabecera\">\n");
      out.write("            <TR>\n");
      out.write("                <TD COLSPAN=4 ROWSPAN=1>\n");
      out.write("                    <IMG SRC=\"/SistemaTramiteDocumentario/images/arequipa.png\" WIDTH=100%    HEIGHT=200 ALT=\"\"></TD>\n");
      out.write("\n");
      out.write("                <TD COLSPAN=4 ROWSPAN=1>\n");
      out.write("                    <IMG SRC=\"/SistemaTramiteDocumentario/images/logo.png\" WIDTH=100% HEIGHT=200 ALT=\"\"></TD>\n");
      out.write("                <TD COLSPAN=4 ROWSPAN=1>\n");
      out.write("                    <IMG SRC=\"/SistemaTramiteDocumentario/images/arequipa.png\" WIDTH=100% HEIGHT=200 ALT=\"\"></TD>\n");
      out.write("            </TR>\n");
      out.write("\n");
      out.write("        </TABLE>\n");
      out.write("\n");
      out.write("        <div style =\"width:800px;height:100px;position:absolute; top:45%;left:20%\">      \n");
      out.write("            <table style=\"cursor:pointer\" id=\"tabla\">\t\t\t\n");
      out.write("                <tr >\t\t\t\t\n");
      out.write("                    \n");
      out.write("                    <th style =\"width:50px;text-align:center; \">Codigo</th>\n");
      out.write("                    <th style =\"width:120px;text-align:center;\">Nombre Usuario</th>\n");
      out.write("                    <th style =\"width:250px;text-align:center;\">Apellidos de Usuario</th>\n");
      out.write("                    <th style =\"width:120px;text-align:center;\">Area</th>\n");
      out.write("                    <th style =\"width:120px;text-align:center;\">Nick Usuario</th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

 
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
                
      out.write("\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("       <form name=\"Form2\" id=\"c_FormRegistro\">\n");
      out.write("            <input id=\"modif\" name=\"b_modificar\" value=\"Modificar\"  type=\"button\" onclick=\"modificar();\" style=\"position: absolute; left: 45%; top: 80%; width: 96px; height: 25px; font-family: Arial; font-size: 13px; z-index: 9;\">\n");
      out.write("       </form> \n");
      out.write("   \n");
      out.write("    <div style =\"position: absolute;top:35%;left:0%;width: 100%\">\n");
      out.write("        <IMG SRC=\"/SistemaTramiteDocumentario/images/layout_24.gif\" WIDTH=100%    HEIGHT=50 ALT=\"\">\n");
      out.write("\n");
      out.write("    </div> \n");
      out.write("\n");
      out.write("    <div style =\"position:absolute;left:37%;top:37%;width:600px;height:90px;z-index:2 \" >\n");
      out.write("        <span style=\"color:#1E4D80;font-family:Arial-Black;font-size:26px;\"> ELECCION DE USUARIO </span> \n");
      out.write("    </div>\n");
      out.write("                \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
