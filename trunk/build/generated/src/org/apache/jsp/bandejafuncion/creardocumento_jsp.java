package org.apache.jsp.bandejafuncion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class creardocumento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("<div id=\"formotro\" style =\"position:absolute; top:10%;left:20%; background-color:#1D4C7F;border:1px #112F4B solid;width:450px;height:170px;z-index:10\"> \n");
      out.write("    <div  style =\"position:absolute; left:80px;top:10px;width:400px;height:20px;z-index:10\">\n");
      out.write("        <font style=\"font-size:18px\" color=white face=\"Arial \">REGISTRO NUEVO DOCUMENTO </font>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <div style =\"position:absolute; left:30px; width:300px;top:50px;\" >\n");
      out.write("        <font style=\"font-size:15px\" color=white face=\"Arial \">Nuevo Tipo de Documento </font>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <input name=\"nombretip\" value=\"\" id=\"nombret\" style =\"position:absolute; left:250px;top:50px;\" >\n");
      out.write("    <div style =\"position:absolute; left:30px; top:90px; width:300px;\">\n");
      out.write("        <font style=\"font-size:15px\" color=white face=\"Arial \">Nuevo Descripcion Doc </font>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <input name=\"desctip\" value=\"\" id=\"desct\" style=\"position:absolute; left:250px;top:90px;\">\n");
      out.write("    \n");
      out.write("    <input type=\"button\" name=\"b1\" value=\"Aceptar\" onclick=\"cerrarOtros();\" style=\"position:absolute; left:130px;top:130px;\">  \n");
      out.write("    \n");
      out.write("    <input type=\"button\" name=\"b1\" value=\"Cancelar\" onclick=\"cancelarOtros();\" style =\"position:absolute; left:230px; top:130px; \">\n");
      out.write("    \n");
      out.write("</div>");
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
