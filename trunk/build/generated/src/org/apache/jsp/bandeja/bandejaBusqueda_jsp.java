package org.apache.jsp.bandeja;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Tramite.Model.DocumentoBuscar;
import com.Tramite.Model.DocumentoHistorial;
import com.Tramite.Model.Usuario;
import com.Tramite.Model.DocumentoEntrada;
import java.util.ArrayList;

public final class bandejaBusqueda_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<!-- saved from url=(0014)about:internet -->\n");
      out.write("\n");
      out.write("<!--jsp:include page=\"/SistemaTramiteDocumentario/index/seguridad.jsp\"/-->\n");
      out.write("\n");
      out.write("<html><head>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Bandeja Entrada</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"/SistemaTramiteDocumentario/css/style1.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"/SistemaTramiteDocumentario/jquery/jquery-1.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"/SistemaTramiteDocumentario/jquery/script.js\"></script>\n");
      out.write("        <link href=\"/SistemaTramiteDocumentario/jquery/tablecloth/tablecloth.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"tablecloth.js\"></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #NavigationBar1 ul.navbar\n");
      out.write("            {\n");
      out.write("                list-style: none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            #NavigationBar1 ul.navbar li\n");
      out.write("            {\n");
      out.write("                height: 26px;\n");
      out.write("                width: 158px;\n");
      out.write("                margin: 0px 0px 4px 0px;\n");
      out.write("                vertical-align: bottom;\n");
      out.write("            }\n");
      out.write("            #NavigationBar1 ul.navbar li a\n");
      out.write("            {\n");
      out.write("                display: block;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            #NavigationBar1 ul.navbar li a img\n");
      out.write("            {\n");
      out.write("                position: absolute;\n");
      out.write("                z-index: 1;\n");
      out.write("                border-width: 0px;\n");
      out.write("            }\n");
      out.write("            #NavigationBar1 ul.navbar li span\n");
      out.write("            {\n");
      out.write("                display: block;\n");
      out.write("                height: 26px;\n");
      out.write("                width: 158px;\n");
      out.write("                position: absolute;\n");
      out.write("                z-index: 2;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #TabMenu1\n");
      out.write("            {\n");
      out.write("                text-align: left;\n");
      out.write("                margin: 0px 0 1px 0;\n");
      out.write("                font-family: Arial;\n");
      out.write("                font-size: 16px;\n");
      out.write("                font-weight: normal;\n");
      out.write("                list-style-type: none;\n");
      out.write("                padding: 14px 0px 3px 10px;\n");
      out.write("            }\n");
      out.write("            #TabMenu1 li\n");
      out.write("            {\n");
      out.write("                display: inline;\n");
      out.write("            }\n");
      out.write("            #TabMenu1 a:link.active, #TabMenu1 a:visited.active, #TabMenu1 a:hover.active\n");
      out.write("            {\n");
      out.write("                border-bottom: 1px solid #F7F9FC;\n");
      out.write("                background-color: white;\n");
      out.write("                color: #FFFFFF;\n");
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
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function()\n");
      out.write("            {\n");
      out.write("                $(\"#NavigationBar1 .navbar a\").hover(function()\n");
      out.write("                {\n");
      out.write("                    $(this).children(\"span\").hide();\n");
      out.write("                }, function()\n");
      out.write("                {\n");
      out.write("                    $(this).children(\"span\").show();\n");
      out.write("                })\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <div style =\"position:absolute;left:10%;top:37%;width:400px;height:90px;z-index:2 \" >\n");
      out.write("            <span style=\"color:#1E4D80;font-family:Arial-Black;font-size:26px;\"> Bienvenido : \n");
      out.write("                \n");
      out.write("                ");
 
         
                HttpSession sesion=request.getSession();
                
                String nombre=(String)sesion.getAttribute("nombreU");
                String apellido=(String)sesion.getAttribute("apellidoU");
                
                out.println(nombre+" "+apellido);


            
      out.write("\n");
      out.write("                  </span> \n");
      out.write("\n");
      out.write("        </div>\n");
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
      out.write("        <div id=\"NavigationBar1\" style=\"position:absolute;left:10%;top:53%;width:658px;height:90px;z-index:2\">\n");
      out.write("            <ul class=\"navbar\">\n");
      out.write("                <li><a href=\"recibidostemp.jsp?nombreU=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombreUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&apellidoU=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${apellidoUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><img alt=\"\" src=\"/SistemaTramiteDocumentario/images/img0001_over.gif\"><span><img alt=\"\" src=\"/SistemaTramiteDocumentario/images/img0001.gif\"></span></a></li>\n");
      out.write("                <li><a href=\"enviadostemp.jsp?nombreU=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombreUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&apellidoU=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${apellidoUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><img alt=\"\" src=\"/SistemaTramiteDocumentario/images/img0002_over.gif\"><span><img alt=\"\" src=\"/SistemaTramiteDocumentario/images/img0002.gif\"></span></a></li>\n");
      out.write("                <li><a href=\"documentostemp.jsp?nombreU=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombreUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&apellidoU=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${apellidoUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><img alt=\"\" src=\"/SistemaTramiteDocumentario/images/img0003_over.gif\"><span><img alt=\"\" src=\"/SistemaTramiteDocumentario/images/img0003.gif\"></span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"wb_TabMenu1\" style=\"margin:0;padding:0;position:absolute;left:30%;top:43%;width:558px;height:42px;text-align:left;z-index:3;\">\n");
      out.write("            <ul id=\"TabMenu1\">\n");
      out.write("                <li><a href=\"/SistemaTramiteDocumentario/bandejafuncion/nuevodocumento.jsp\"> Nuevo     </a></li>\n");
      out.write("                <li><a href=\"#\"> Aumentar Descripcion </a></li>\n");
      out.write("                <li><a href=\"#\"> \n");
      out.write("                    \n");
      out.write("                    <form action=\"bandejaBusqueda.jsp\" method=\"POST\"/>\n");
      out.write("\n");
      out.write("<input type=\"text\" />\n");
      out.write("<input type=\"submit\" value=\"buscar\" />\n");
      out.write("</form>\n");
      out.write("                    \n");
      out.write("                </a></li>\n");
      out.write("                <li><a href=\"principalUsuariotemp.jsp?nombreU=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombreUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&apellidoU=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${apellidoUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">  Principal  </a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div style =\"position: absolute;top:42%;left:0%;width: 100%\">\n");
      out.write("            <IMG SRC=\"/SistemaTramiteDocumentario/images/layout_24.gif\" WIDTH=100%    HEIGHT=50 ALT=\"\">\n");
      out.write("\n");
      out.write("        </div>                \n");
      out.write("        <div style =\"position: absolute;top:35%;left:0%;width: 100%\">\n");
      out.write("            <IMG SRC=\"/SistemaTramiteDocumentario/images/layout_24.gif\" WIDTH=100%    HEIGHT=50 ALT=\"\">\n");
      out.write("\n");
      out.write("        </div>                \n");
      out.write("\n");
      out.write("\n");
      out.write("        <div style =\"width:800px;height:200px;position:absolute; top:50%;left:25%\">  \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" id=\"table\" class=\"sortable\" >\t\t\n");
      out.write("\n");
      out.write("                <!--style=\"cursor:pointer\"-->\n");
      out.write("                <tr >\t\t\t\t\n");
      out.write("                    <th style =\"width:20px; text-align:center;\" >Fecha </th>\n");
      out.write("                    <th style =\"width:15px;text-align:center; \">Codigo</th>\n");
      out.write("                    <th style =\"width:420px;text-align:center;\">Asunto del documento</th>\n");
      out.write("                    <th style =\"width:20px;text-align:center;\">Codigo Transaccion</th>\n");
      out.write("                    <th style =\"width:220px;text-align:center;\">Descripcion Transaccion</th>\n");
      out.write("                    <th style =\"width:90px;text-align:center;\">Estado</th>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");


                    //codTra,descripcionTra,fecTra,nombreUsu,nombreEst


                //   String codigo =(String) request.getParameter("codigo");
                    
                String codigo="PAT";
                DocumentoBuscar documentos = new DocumentoBuscar();
                    ArrayList<DocumentoBuscar> respuesta = documentos.conseguirConsulta(codigo);

                    for (DocumentoBuscar d : respuesta) {
                       out.println("<tr>" + d + "</tr>");
                        //out.println("<tr>" + "hola" + "</tr>");
                    }

                    //ArrayList <DocumentoEntrada> List = (ArrayList<DocumentoEntrada>)(request.getAttribute("documentos")); 

                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body></html>");
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
