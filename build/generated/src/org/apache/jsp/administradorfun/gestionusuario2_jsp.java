package org.apache.jsp.administradorfun;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Tramite.Conexion.UsuarioBD;
import com.Tramite.Model.Usuario;
import com.Tramite.Conexion.AreaBD;
import com.Tramite.Conexion.TipoUsuarioBD;
import java.util.ArrayList;

public final class gestionusuario2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Crear nuevo Usuario</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"/SistemaTramiteDocumentario/jquery/jquery-1.js\"></script>\n");
      out.write("        <link href=\"/SistemaTramiteDocumentario/jquery/tablecloth.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"/SistemaTramiteDocumentario/jquery/tablecloth.js\"></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <SCRIPT TYPE=\"text/javascript\">\n");
      out.write("        function verificarblancos(formulario){\n");
      out.write("            if(formulario.t_Nombre.value==\"\"\n");
      out.write("            || formulario.t_Apellido.value==\"\" \n");
      out.write("            || formulario.t_Correo.value==\"\")\n");
      out.write("                alert('Hay algunos campos vacios.');\n");
      out.write("            else{\n");
      out.write("                alert('Se modificaron los datos del usuario.');\n");
      out.write("                formulario.b_Aceptar.type = \"submit\";\n");
      out.write("                Form1.method=\"post\";\n");
      out.write("                Form1.action=\"gestionusuariotemp.jsp?t_Docident=\"+formulario.t_Docidentidad.value;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        </SCRIPT>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>\n");
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
      out.write("        <div id=\"c_Form\" style=\"position:absolute;background-color:#F0F0F0;left:23%;top:49%;width:720px;height:600px;z-index:11\">\n");
      out.write("        ");

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

            if(estado==1){
      out.write("\n");
      out.write("                <input id=\"c_RadioButton\" name=\"rb_Estado\" value=\"activo\" type=\"radio\" style=\"position: absolute; left: 56%; top: 56%; z-index: 10;\" checked>\n");
      out.write("                <input id=\"c_RadioButton\" name=\"rb_Estado\" value=\"inactivo\" type=\"radio\" style=\"position: absolute; left: 76%; top: 56%; z-index: 11;\">\n");
      out.write("            ");
}
            else{
      out.write("\n");
      out.write("                <input id=\"c_RadioButton\" name=\"rb_Estado\" value=\"activo\" type=\"radio\" style=\"position: absolute; left: 56%; top: 56%; z-index: 10;\">\n");
      out.write("                <input id=\"c_RadioButton\" name=\"rb_Estado\" value=\"inactivo\" type=\"radio\" style=\"position: absolute; left: 76%; top: 56%; z-index: 11;\" checked>\n");
      out.write("            ");
}
        
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("            <form name=\"Form1\" id=\"c_FormRegistro\">\n");
      out.write("                <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:5%;width:186px;height:16px;text-align:left;z-index:2;\">                \n");
      out.write("                    <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Codigo Usuario:</b></font>\n");
      out.write("                </div>    \n");
      out.write("                <input id=\"c_Editbox\" name=\"t_codigo\" disabled value=\"");
      out.print(codigo);
      out.write("\" type=\"text\"  style=\"position:absolute;border:1px #000000 solid;left:50%;top:4.5%;width:236px;height:23px;z-index:15\">\n");
      out.write("\n");
      out.write("                <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:12%;width:186px;height:16px;text-align:left;z-index:2;\">                \n");
      out.write("                    <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Documento de Identidad:</b></font>\n");
      out.write("                </div>    \n");
      out.write("                \n");
      out.write("                <input id=\"c_Editbox\" name=\"t_Docidentidad\" disabled value=\"");
      out.print(docid);
      out.write("\" type=\"text\" style=\"position:absolute;border:1px #000000 solid;left:50%;top:11.5%;width:236px;height:23px;z-index:15\">\n");
      out.write("                \n");
      out.write("                <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:19%;width:186px;height:16px;text-align:left;z-index:3;\">\n");
      out.write("                    <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Nombres:</b></font>\n");
      out.write("                </div>\n");
      out.write("                <input id=\"c_Editbox\" name=\"t_Nombre\" value=\"");
      out.print(nombre);
      out.write("\" type=\"text\" style=\"position:absolute;border:1px #000000 solid;left:50%;top:18.5%;width:236px;height:23px;z-index:16\">\n");
      out.write("\n");
      out.write("                <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:26%;width:186px;height:16px;text-align:left;z-index:4;\">\n");
      out.write("                    <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Apellidos:</b></font>\n");
      out.write("                </div>\n");
      out.write("                <input id=\"c_Editbox\" name=\"t_Apellido\" value=\"");
      out.print(apellido);
      out.write("\" type=\"text\" style=\"position:absolute;border:1px #000000 solid;left:50%;top:25.5%;width:236px;height:23px;z-index:17\">\n");
      out.write("                \n");
      out.write("                <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:33%;width:186px;height:16px;text-align:left;z-index:5;\">\n");
      out.write("                    <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Correo Electronico:</b></font>\n");
      out.write("                </div>\n");
      out.write("                <input id=\"c_Editbox\" name=\"t_Correo\" value=\"");
      out.print(correo);
      out.write("\" type=\"text\" style=\"position:absolute;border:1px #000000 solid;left:50%;top:32.5%;width:236px;height:21px;z-index:18\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:40%;width:186px;height:16px;text-align:left;z-index:6;\">\n");
      out.write("                    <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Tipo de Usuario:</b></font>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"position:absolute;left:50%;top:39.5%;width:236px;height:20px;border:1px black solid;z-index:14\">\n");
      out.write("                    <select id=\"c_Combobox\" name=\"cb_Tusuario\" size=\"1\"  style=\"position:absolute;left:0px;top:0px;width:100%;height:100%;border-width:0px;font-family:Arial;font-size:13px;\">\n");
      out.write("                        ");


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
                                
                        
      out.write("       \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:47%;width:186px;height:16px;text-align:left;z-index:6;\">\n");
      out.write("                    <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Area:</b></font>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"position:absolute;left:50%;top:46.5%;width:236px;height:20px;border:1px black solid;z-index:14\">\n");
      out.write("                    <select id=\"c_Combobox\" name=\"cb_Area\" size=\"1\"  style=\"position:absolute;left:0px;top:0px;width:100%;height:100%;border-width:0px;font-family:Arial;font-size:13px;\">\n");
      out.write("                        ");


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

                        
      out.write("           \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:20%;top:56%;width:186px;height:16px;text-align:left;z-index:7;\">\n");
      out.write("                    <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\"><b>Estado:</b></font>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:50%;top:56%;width:6px;height:16px;text-align:left;z-index:12;\">\n");
      out.write("                    <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\">Activo</font>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"c_Text\" style=\"margin:0;padding:0;position:absolute;left:70%;top:56%;width:6px;height:16px;text-align:left;z-index:13;\">\n");
      out.write("                    <font style=\"font-size:13px\" color=\"#000000\" face=\"Arial\">Inactivo</font>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <input id=\"c_Button\" name=\"b_Aceptar\" value=\"Modificar\" onclick=\"verificarblancos(this.form);\" type=\"button\" style=\"position: absolute; left: 40%; top: 70%; width: 96px; height: 25px; font-family: Arial; font-size: 13px; z-index: 8;\">    \n");
      out.write("            </form>\n");
      out.write("            <form name=\"Form2\" method=\"post\" action=\"/SistemaTramiteDocumentario/administrador/principalAdministrador.jsp\" id=\"c_FormRegistro\">\n");
      out.write("                <input id=\"c_Button\" name=\"b_Cancelar\" value=\"Cancelar\" type=\"submit\" style=\"position: absolute; left: 60%; top: 70%; width: 96px; height: 25px; font-family: Arial; font-size: 13px; z-index: 9;\">\n");
      out.write("            </form>                \n");
      out.write("\n");
      out.write("        </div>  \n");
      out.write("\n");
      out.write("        <div style =\"position: absolute;top:35%;left:0%;width: 100%\">\n");
      out.write("            <IMG SRC=\"/SistemaTramiteDocumentario/images/layout_24.gif\" WIDTH=100%    HEIGHT=50 ALT=\"\">\n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("        <div style =\"position:absolute;left:37%;top:37%;width:600px;height:90px;z-index:2 \" >\n");
      out.write("            <span style=\"color:#1E4D80;font-family:Arial-Black;font-size:26px;\"> ELECCION DE USUARIO </span> \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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
