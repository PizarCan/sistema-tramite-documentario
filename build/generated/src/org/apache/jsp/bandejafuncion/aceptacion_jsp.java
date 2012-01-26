package org.apache.jsp.bandejafuncion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Tramite.Model.DocumentoIn;
import com.Tramite.Model.Usuario;
import com.Tramite.Conexion.DocumentoINDB;

public final class aceptacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<script language='javascript'>\n");
      out.write("    alert ('Documento creado con Exito');\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
 HttpSession sesion=request.getSession();
 String nombre = (String) sesion.getAttribute("nombreU");
   String apellido=(String)sesion.getAttribute("apellidoU");

   DocumentoINDB  nuevadb= new DocumentoINDB();
   Usuario nuevo = new Usuario("","");
     
   
                      
   nuevo.setApellido(apellido);
   nuevo.setNombre(nombre);
   String fecha =nuevo.conseguirfecha();
   String area = nuevo.ConseguirArea(nuevo);          
               
               String asunto = (String)request.getParameter("asunto");
   String destino = (String)request.getParameter("destino");
   String remitente = (String)request.getParameter("remitente");
   String tipo =(String) request.getParameter("cb_tipo");
   String descripcion = (String )request.getParameter("texto");
   if(nombre!="" && apellido!="" && fecha!="" && area!="" && asunto!="" && remitente!="" && descripcion!="")
   {
             int codigo = nuevadb.buscarMaxID();
             int codigotipodoc = nuevadb.buscarcodigotipoDoc(area);
             nuevadb.ingresarDocu(new DocumentoIn(codigo,asunto,remitente,fecha,destino,codigotipodoc,descripcion));
   }
               
               
               
               

      out.write("\n");
      out.write("     \n");
      out.write("        \n");
      out.write("     \n");
      out.write("       \n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
