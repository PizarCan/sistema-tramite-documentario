package org.apache.jsp.administradorfun;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Tramite.Conexion.UsuarioBD;
import com.Tramite.Conexion.AreaBD;
import com.Tramite.Conexion.TipoUsuarioBD;
import java.util.ArrayList;

public final class creacionusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Crear nuevo Usuario</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"/SistemaTramiteDocumentario/jquery/jquery-1.js\"></script>\n");
      out.write("        <link href=\"/SistemaTramiteDocumentario/jquery/tablecloth.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"/SistemaTramiteDocumentario/jquery/tablecloth.js\"></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <SCRIPT TYPE=\"text/javascript\">\n");
      out.write("            \n");
      out.write("        function verificarblancos(formulario){\n");
      out.write("            if(formulario.t_Docidentidad.value ==\"\" || formulario.t_Nombre.value==\"\"\n");
      out.write("            || formulario.t_Apellido.value==\"\" || formulario.t_Nick.value==\"\"\n");
      out.write("            || formulario.t_Password.value==\"\" || formulario.t_Correo.value==\"\")\n");
      out.write("                alert('Hay algunos campos vacios.');\n");
      out.write("            else{\n");
      out.write("              //  alert('Se inserto el usuario correctamente.');\n");
      out.write("                formulario.b_Aceptar.type = \"submit\";\n");
      out.write("                Form1.method=\"post\";\n");
      out.write("                Form1.action=\"creacionusuariotemp.jsp\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        </SCRIPT>\n");
      out.write("         <style type=\"text/css\">\n");
      out.write("            #TabMenu1\n");
      out.write("            {\n");
      out.write("                text-align: left;\n");
      out.write("                margin: 0px 0 1px 0;\n");
      out.write("                font-family: \"Comic Sans MS\";\n");
      out.write("                font-size: 27px;\n");
      out.write("                font-weight: normal;\n");
      out.write("                list-style-type: none;\n");
      out.write("                padding: 22px 0px 3px 10px;\n");
      out.write("            }\n");
      out.write("            #TabMenu1 li\n");
      out.write("            {\n");
      out.write("                display: inline;\n");
      out.write("            }\n");
      out.write("            #TabMenu1 a:link.active, #TabMenu1 a:visited.active, #TabMenu1 a:hover.active\n");
      out.write("            {\n");
      out.write("                border-bottom: 1px solid #F7F9FC;\n");
      out.write("                background-color: #F7F9FC;\n");
      out.write("                color: #005500;\n");
      out.write("                position: relative;\n");
      out.write("                padding-top: 3px;\n");
      out.write("                font-weight: normal;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            #TabMenu1 a:link, #TabMenu1 a:visited\n");
      out.write("            {\n");
      out.write("                padding: 3px 4px;\n");
      out.write("                border: 1px solid #FFFFFF;\n");
      out.write("                background-color: #FFFFFF;\n");
      out.write("                color: #1C3B69;\n");
      out.write("                margin-right: 0px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border-bottom: none;\n");
      out.write("            }\n");
      out.write("            #TabMenu1 a:hover\n");
      out.write("            {\n");
      out.write("                background: #F7F9FC;\n");
      out.write("                color: #000000;\n");
      out.write("                font-weight: normal;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>\n");
      out.write("        \n");
      out.write("        <ul id=\"TabMenu1\" style =\"position:absolute; top:40%;left:67%\">\n");
      out.write("           \n");
      out.write("        \n");
      out.write("        <li><a href=\"/SistemaTramiteDocumentario/administrador/principalAdministrador.jsp\">  Principal  </a></li>\n");
      out.write("        </ul>\n");
      out.write("        <TABLE WIDTH=100% BORDER=0 CELLPADDING=0 CELLSPACING=0>\n");
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
      out.write("        \n");
      out.write("        ");

            UsuarioBD ub = new UsuarioBD();
            int n = ub.buscarMaxID();
            String pasgen = Integer.toString(n);
            
            for(int i=0;i<6;++i)
                pasgen+=Integer.toString((n+i)%9);
        
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"c_Form\" style=\"position:absolute;background-color:#F0F0F0;left:23%;top:49%;width:720px;height:600px;z-index:11\">\n");
      out.write("\n");
      out.write("        <form name=\"Form1\" id=\"c_FormRegistro\">\n");
      out.write("\n");
      out.write("            <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:5%;width:186px;height:16px;text-align:left;z-index:2;\">                <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Documento de Identidad:</b></font></div>    \n");
      out.write("            <input id=\"c_Editbox\" name=\"t_Docidentidad\" value=\"\" type=\"text\" style=\"position:absolute;border:1px #000000 solid;left:50%;top:4.5%;width:236px;height:23px;z-index:15\">\n");
      out.write("            <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:12%;width:186px;height:16px;text-align:left;z-index:3;\">\n");
      out.write("                <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Nombres:</b></font>\n");
      out.write("            </div>\n");
      out.write("            <input id=\"c_Editbox\" name=\"t_Nombre\" value=\"\" type=\"text\" style=\"position:absolute;border:1px #000000 solid;left:50%;top:11.5%;width:236px;height:23px;z-index:16\">\n");
      out.write("\n");
      out.write("            <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:19%;width:186px;height:16px;text-align:left;z-index:4;\">\n");
      out.write("                <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Apellidos:</b></font>\n");
      out.write("            </div>\n");
      out.write("            <input id=\"c_Editbox\" name=\"t_Apellido\" value=\"\" type=\"text\" style=\"position:absolute;border:1px #000000 solid;left:50%;top:18.5%;width:236px;height:23px;z-index:17\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:26%;width:186px;height:16px;text-align:left;z-index:4;\">\n");
      out.write("                <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Nick:</b></font>\n");
      out.write("            </div>\n");
      out.write("            <input id=\"c_Editbox\" name=\"t_Nick\" value=\"\" type=\"text\" style=\"position:absolute;border:1px #000000 solid;left:50%;top:25.5%;width:236px;height:23px;z-index:17\">\n");
      out.write("\n");
      out.write("            <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:33%;width:186px;height:16px;text-align:left;z-index:4;\">\n");
      out.write("                <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Contraseña:</b></font>\n");
      out.write("            </div>\n");
      out.write("            <input id=\"c_Editbox\" name=\"t_Password\" value=\"");
      out.print(pasgen);
      out.write("\" type=\"text\" style=\"position:absolute;border:1px #000000 solid;left:50%;top:32.5%;width:236px;height:23px;z-index:17\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:40%;width:186px;height:16px;text-align:left;z-index:5;\">\n");
      out.write("                <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Correo Electronico:</b></font>\n");
      out.write("            </div>\n");
      out.write("            <input id=\"c_Editbox\" name=\"t_Correo\" value=\"\" type=\"text\" style=\"position:absolute;border:1px #000000 solid;left:50%;top:39.5%;width:236px;height:21px;z-index:18\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:47%;width:186px;height:16px;text-align:left;z-index:6;\">\n");
      out.write("                <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Tipo de Usuario:</b></font>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position:absolute;left:50%;top:46.5%;width:236px;height:20px;border:1px black solid;z-index:14\">\n");
      out.write("                <select id=\"c_Combobox\" name=\"cb_Tusuario\" size=\"1\"  style=\"position:absolute;left:0px;top:0px;width:100%;height:100%;border-width:0px;font-family:Arial;font-size:13px;\">\n");
      out.write("                    ");


                        TipoUsuarioBD seltipo = new TipoUsuarioBD();

                        ArrayList<String> tipos = new ArrayList<String>();
                        tipos = seltipo.seleccionarTiposNombre();

                        for (String t : tipos) {
                            out.println("<option>" + t + "</option>");
                        }

                    
      out.write("       \n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:54%;width:186px;height:16px;text-align:left;z-index:6;\">\n");
      out.write("                <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Area:</b></font>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position:absolute;left:50%;top:53.5%;width:236px;height:20px;border:1px black solid;z-index:14\">\n");
      out.write("                <select id=\"c_Combobox\" name=\"cb_Area\" size=\"1\"  style=\"position:absolute;left:0px;top:0px;width:100%;height:100%;border-width:0px;font-family:Arial;font-size:13px;\">\n");
      out.write("                    ");


                        AreaBD selarea = new AreaBD();

                        ArrayList<String> areas = new ArrayList<String>();
                        areas = selarea.seleccionarAreasNombre();

                        for (String a : areas) {
                            out.println("<option>" + a + "</option>");
                        }

                    
      out.write("           \n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:61%;width:186px;height:16px;text-align:left;z-index:7;\">\n");
      out.write("                <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Estado:</b></font>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:50%;top:60%;width:6px;height:16px;text-align:left;z-index:12;\">\n");
      out.write("                <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\">Activo</font>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:70%;top:60%;width:6px;height:16px;text-align:left;z-index:13;\">\n");
      out.write("                <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\">Inactivo</font>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <input id=\"c_RadioButton\" name=\"rb_Estado\" value=\"activo\" type=\"radio\" style=\"position: absolute; left: 56%; top: 60%; z-index: 10;\" checked>\n");
      out.write("            <input id=\"c_RadioButton\" name=\"rb_Estado\" value=\"inactivo\" type=\"radio\" style=\"position: absolute; left: 76%; top: 60%; z-index: 11;\">\n");
      out.write("\n");
      out.write("            <input id=\"c_Button\" name=\"b_Aceptar\" value=\"Aceptar\" onclick=\"verificarblancos(this.form);\" type=\"button\" style=\"position: absolute; left: 40%; top: 80%; width: 96px; height: 25px; font-family: Arial; font-size: 13px; z-index: 8;\">    \n");
      out.write("        </form>\n");
      out.write("        <form name=\"Form2\" method=\"post\" action=\"../administrador/principalAdministrador.jsp\" id=\"c_FormRegistro\">\n");
      out.write("            <input id=\"c_Button\" name=\"b_Cancelar\" value=\"Cancelar\" type=\"submit\" style=\"position: absolute; left: 60%; top: 80%; width: 96px; height: 25px; font-family: Arial; font-size: 13px; z-index: 9;\">\n");
      out.write("        </form>                \n");
      out.write("                \n");
      out.write("        </div>  \n");
      out.write("                \n");
      out.write("    </div>\n");
      out.write("    <div style =\"position: absolute;top:35%;left:0%;width: 100%\">\n");
      out.write("        <IMG SRC=\"/SistemaTramiteDocumentario/images/layout_24.gif\" WIDTH=100%    HEIGHT=50 ALT=\"\">\n");
      out.write("\n");
      out.write("    </div> \n");
      out.write("\n");
      out.write("    <div style =\"position:absolute;left:37%;top:37%;width:400px;height:90px;z-index:2 \" >\n");
      out.write("        <span style=\"color:#1E4D80;font-family:Arial-Black;font-size:26px;\"> CREACION DE NUEVO USUARIO </span> \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("\n");
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
