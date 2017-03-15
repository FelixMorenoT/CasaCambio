/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import servicio.UsuarioWebService_Service;

/**
 *
 * @author felix
 */
public class Controlador1 extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/UsuarioWebService/UsuarioWebService.wsdl")
    private UsuarioWebService_Service service;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        if (accion.equals("RegistroUser")) {
            this.RegistroUser(request, response);
        } else if (accion.equals("IniciarSesion")) {
            this.InicioSesion(request, response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void RegistroUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String correo = request.getParameter("Correo");
        String nombre = request.getParameter("Nombre");
        String user = request.getParameter("User");
        String clave = request.getParameter("Clave");

        boolean Funciono = insertarUsuario(correo, nombre, user, clave);
        if (Funciono == true) {
            response.sendRedirect("mensaje.jsp?men=1");
        }
    }

    private boolean insertarUsuario(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.UsuarioWebService port = service.getUsuarioWebServicePort();
        return port.insertarUsuario(arg0, arg1, arg2, arg3);
    }

    private void InicioSesion(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String usuario = request.getParameter("User");
        String clave = request.getParameter("Clave");
        boolean check = iniciarSesion(usuario, clave);

        if (check == true) {
            response.sendRedirect("/ExChangeMoney_Administrador/admin.jsp");

        } else {
            response.sendRedirect("/ExChangeMoneyPaginaPrincipal");
        }
    }

    private boolean iniciarSesion(java.lang.String arg0, java.lang.String arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.UsuarioWebService port = service.getUsuarioWebServicePort();
        return port.iniciarSesion(arg0, arg1);
    }

}
