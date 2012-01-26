<%@page import="com.Tramite.Conexion.UsuarioBD"%>
<%@page import="com.Tramite.Conexion.TramiteBD"%>
<%@page import="com.Tramite.Model.Transaccion"%>
<%@page import="com.Tramite.Model.DocumentoIn"%>
<%@page import="com.Tramite.Model.Usuario"%>
<%@page import="com.Tramite.Conexion.DocumentoINDB"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<% 

   HttpSession sesion=request.getSession();
   String nombre = (String) sesion.getAttribute("nombreU");
   String apellido=(String)sesion.getAttribute("apellidoU");
   UsuarioBD nuevoDB = new UsuarioBD ();
   TramiteBD nuevadb = new TramiteBD();
   Usuario nuevo = new Usuario("","");
    nuevo.setApellido(apellido);
   nuevo.setNombre(nombre);
   
   String area = (String)request.getParameter("cb_tipo1");
   String estado =(String)request.getParameter("cb_tipo");
   TramiteBD nuevoTram = new TramiteBD();
   int codigot = nuevoTram.buscarMaxID();
   int codRec = 1;
   int codUsu = nuevoDB.conseguirCodigoUsuarios(nuevo);
   int codDes = nuevoTram.buscasCodArea(area);
   int codEst = nuevoTram.buscarCodEstado(estado);
   String fecha =nuevo.conseguirfecha();
   String codigoDoc =(String)sesion.getAttribute("codigo");
   String descripcion = (String)request.getParameter("texto");
   out.println(codigot+"codt ");
   out.println(codRec+"codR  ");
   out.println(codUsu+"  codU");
   out.println(codDes+ " codAre ");
   out.println(codEst+ " codEv");
   out.println(fecha+ " ddd F  ");
   out.println(codigoDoc+" codigo  ");
   out.println(descripcion+"d esc ");
   
   Transaccion nuevaTran = new Transaccion(codigot,codRec,codUsu,codDes,codEst,fecha,Integer.parseInt(codigoDoc),descripcion);
   int cuentaD =nuevaTran.conseguirCuenta(Integer.parseInt(codigoDoc));
   nuevaTran.setCuenta(cuentaD);
   int codigoTAnt=nuevaTran.conseguirCuentaAnt(cuentaD-1);
   nuevaTran.actualizarAnteriorTransaccion(codigoTAnt);
   nuevaTran.iniciarTransaccion();
   
               
               
   response.sendRedirect("/SistemaTramiteDocumentario/bandeja/mensajebandejaenviados.jsp");
               
%>

     
        
     
       
      



