/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Conversion;
import ServicioAdmin.AdministradorExChange_Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author felix
 */
public class Controlador extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/AdministradorExChange/AdministradorExChange.wsdl")
    private AdministradorExChange_Service service;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getAttribute("NombreUsuario");
        String accion = request.getParameter("accion");
        if (accion.equals("NuevaConversion")) {
            this.NuevaConversion(request, response);
        } else if (accion.equals("ActConversion")) {
            this.ActualizarConversion(request, response);
        } else if (accion.equals("EliminarConv")) {
            this.EliminarConversion(request, response);
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

    private boolean insercionConversion(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, double arg3) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ServicioAdmin.AdministradorExChange port = service.getAdministradorExChangePort();
        return port.insercionConversion(arg0, arg1, arg2, arg3);
    }

    private void NuevaConversion(HttpServletRequest request, HttpServletResponse response) {
        try {
            String f = request.getParameter("Factor");
            double factor = Double.parseDouble(f);
            if (insercionConversion(
                    request.getParameter("MonedaOriginal"),
                    request.getParameter("MonedaDestino"),
                    request.getParameter("Operacion"),
                    factor) == true) {
                response.sendRedirect("admin.jsp?Check");
            }
        } catch (Exception e) {
        }
    }

    private boolean actualizarConversion(int arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, double arg4) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ServicioAdmin.AdministradorExChange port = service.getAdministradorExChangePort();
        return port.actualizarConversion(arg0, arg1, arg2, arg3, arg4);
    }

    private void ActualizarConversion(HttpServletRequest request, HttpServletResponse response) {
        try {
            String f = request.getParameter("Factor");
            double factor = Double.parseDouble(f);

            String i = request.getParameter("ConversionId");
            int idn = Integer.parseInt(i);

            if (actualizarConversion(
                    idn,
                    request.getParameter("MonedaOriginal"),
                    request.getParameter("MonedaDestino"),
                    request.getParameter("Operacion"),
                    factor) == true) {
                response.sendRedirect("admin.jsp?Check");
            }
        } catch (Exception e) {
        }
    }

    private boolean eliminarConversion(int arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ServicioAdmin.AdministradorExChange port = service.getAdministradorExChangePort();
        return port.eliminarConversion(arg0);
    }

    private void EliminarConversion(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String i = request.getParameter("EliminarConver");
        int idn = Integer.parseInt(i);
        
        if(eliminarConversion(idn)==true){
            response.sendRedirect("admin.jsp?Check");
        }
    }

}
