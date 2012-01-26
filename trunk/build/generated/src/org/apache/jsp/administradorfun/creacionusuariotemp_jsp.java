package org.apache.jsp.administradorfun;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Tramite.Model.Usuario;
import com.Tramite.Conexion.UsuarioBD;
import com.Tramite.Conexion.TipoUsuarioBD;
import com.Tramite.Conexion.AreaBD;
import java.util.*;

public final class creacionusuariotemp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    String docid=(String)request.getParameter("t_Docidentidad");
    String nombre =(String)request.getParameter("t_Nombre");
    String apellido =(String)request.getParameter("t_Apellido");
    String nick =(String)request.getParameter("t_Nick");
    String pass =(String)request.getParameter("t_Password");
    String correo =(String)request.getParameter("t_Correo");
    String tipusu =(String)request.getParameter("cb_Tusuario");
    String area =(String)request.getParameter("cb_Area");
    String estado =(String)request.getParameter("rb_Estado");

    if(docid!="" && nombre!="" && apellido!="" && correo!="" &&
        area!="" && estado!=""){

        TipoUsuarioBD tu= new TipoUsuarioBD();
        AreaBD a= new AreaBD();
        int tipuscod = tu.seleccCodTipo(tipusu);
        int areacod = a.seleccCodArea(area);
        int est;
        if(estado=="activo")
            est=1;
        else
            est=2;
        Usuario usuario = new Usuario(nombre,apellido,pass,docid,nick,correo,tipuscod,est,areacod);
        UsuarioBD usubd = new UsuarioBD();
        usubd.insertarUsuario(usuario);
    }
    //request.getRequestDispatcher( "creacionusuario.jsp" ).forward( request,response ); 
    
    response.sendRedirect("creacionusuario.jsp");

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
