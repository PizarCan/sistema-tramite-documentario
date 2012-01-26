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
   DocumentoINDB  nuevadb= new DocumentoINDB();
   Usuario nuevo = new Usuario("","");
     
   
    int codigo= nuevadb.buscarMaxID();
                
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
         
             int codigotipodoc = nuevadb.buscarcodigotipoDoc(tipo);
             nuevadb.ingresarDocu(new DocumentoIn(codigo,asunto,remitente,fecha,destino,codigotipodoc,descripcion));
             
   }
   TramiteBD nuevoTram = new TramiteBD();
   int codigot = nuevoTram.buscarMaxID();
   int codRec = 1;
   int codUsu = nuevoDB.conseguirCodigoUsuarios(nuevo);
   int codAreDes = nuevoTram.buscasCodArea(area);
   int codEsta =  nuevoTram.buscarCodEstado("iniciado");
   out.println(codigot+"codt ");
   out.println(codRec+"codR  ");
   out.println(codUsu+" codU");
   out.println(codAreDes+ "codAre ");
   out.println(codEsta+ "codEv");
   out.println(fecha+"ddd F  ");
   out.println(codigo+"codigo  ");
   out.println(descripcion+"desc ");
   Transaccion nuevaTran = new Transaccion(codigot,codRec,codUsu,codAreDes,codEsta,fecha,codigo,descripcion);
   nuevaTran.setCuenta(1);
   nuevaTran.iniciarTransaccion();
               
               
   response.sendRedirect("/SistemaTramiteDocumentario/bandeja/bandejaEntrada1.jsp");
               
%>

     
        
     
       
      



