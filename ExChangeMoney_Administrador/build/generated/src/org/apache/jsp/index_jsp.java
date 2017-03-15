package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import Modelo.ConversionDB;
import Controladores.Controlador;
import Modelo.Conversion;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"Jquery's/jquery.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"Jquery's/animacion.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Jquery's/estilo.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <center><h1>ExChange Money Administrador</h1></center><br>\n");
      out.write("            <nav id=\"barraNav\" name=\"barraNav\" class=\"navbar navbar-default\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a>Inicio</a></li>\n");
      out.write("                    <li><a href=\"/ExChangeMoney_Cliente\">Aplicacion de Conversion de Monedas</a></li>\n");
      out.write("                </ul>   \n");
      out.write("            </nav>\n");
      out.write("            <button id=\"NewConversiones\" class=\"btn btn-primary btn-block\">Asignacion de Nuevas Conversiones</button><br>\n");
      out.write("            <div id=\"NuevaConversiones\">\n");
      out.write("                <center><legend>Asignacion de Nuevas Conversiones</legend></center><br>\n");
      out.write("                <form role=\"form\" method=\"Post\" action=\"Controlador\">\n");
      out.write("                    <input class=\"form-control\" type=\"hidden\" name=\"accion\" value=\"NuevaConversion\" />\n");
      out.write("                    <label>Moneda Original</label><input class=\"form-control\" type=\"text\" name=\"MonedaOriginal\"/>\n");
      out.write("                    <label>Moneda Destino</label><input class=\"form-control\" type=\"text\" name=\"MonedaDestino\"/>\n");
      out.write("                    <label>Operacion</label><input class=\"form-control\" type=\"text\" name=\"Operacion\"/>\n");
      out.write("                    <label>Factor</label><input class=\"form-control\" type=\"text\" name=\"Factor\"/><br>\n");
      out.write("                    <center><input class=\"btn btn-default\" type=\"submit\" value=\"Registro\"/></center>\n");
      out.write("                </form>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button id=\"UpConversion\" class=\"btn btn-primary btn-block\">Actualizar Conversion</button><br>\n");
      out.write("            <div id=\"ActualizarConversion\">\n");
      out.write("                <center><legend>Actualizar Conversion</legend></center><br>\n");
      out.write("\n");
      out.write("                <form role=\"form\" method=\"Post\" action=\"Controlador\">\n");
      out.write("                    ");

                        ArrayList<Conversion> ConvLis = ConversionDB.llenarListaConversion();
                    
      out.write("\n");
      out.write("                    <input class=\"form-control\" type=\"hidden\" name=\"accion\" value=\"ActConversion\"/>\n");
      out.write("                    <label>Seleccion de Conversion a Actualizar</label>\n");
      out.write("                    <select name=\"ConversionId\" class=\"form-control\">\n");
      out.write("                        ");

                            for (Conversion conv : ConvLis) {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(conv.getId());
      out.write("\"> ");
      out.print(conv.getMonedaOriginal() + " - " + conv.getMonedaDestino());
      out.write("</option>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </select><br>\n");
      out.write("                    <label>Moneda Original</label><input class=\"form-control\" type=\"text\" name=\"MonedaOriginal\"/>\n");
      out.write("                    <label>Moneda Destino</label><input class=\"form-control\" type=\"text\" name=\"MonedaDestino\"/>\n");
      out.write("                    <label>Operacion</label><input class=\"form-control\" type=\"text\" name=\"Operacion\"/>\n");
      out.write("                    <label>Factor</label><input class=\"form-control\" type=\"text\" name=\"Factor\"/><br>\n");
      out.write("                    <center><input class=\"btn btn-default\" type=\"submit\" value=\"Actualizar\"/></center>\n");
      out.write("                </form><br>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button id=\"ViewConversion\" class=\"btn btn-primary btn-block\">Listado de Conversiones</button><br>\n");
      out.write("            <div id=\"ViewCon\">\n");
      out.write("                <center><legend>Listado de Conversiones</legend></center><br>\n");
      out.write("                <div id=\"infoconved\"style=\"overflow:auto;\">\n");
      out.write("                    <table class=\"table table-hover\" style=\"overflow-y:scroll\" >\n");
      out.write("                        <tr>\n");
      out.write("                            <th data-sortable=\"true\"><b>Moneda Original</b></th>\n");
      out.write("                            <th data-sortable=\"true\"><b>Moneda Destino</b></th>\n");
      out.write("                            <th data-sortable=\"true\"><b>Opercacion</b></td>   \n");
      out.write("                            <th data-sortable=\"true\"><b>Factor</b></th>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            ArrayList<Conversion> ListaConversion = ConversionDB.llenarListaConversion();
                            for (Conversion conv : ListaConversion) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(conv.getMonedaOriginal());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(conv.getMonedaDestino());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(conv.getOperacion());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(conv.getFactor());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div><br>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button id=\"EliminarConversion\" class=\"btn btn-primary btn-block\">Eliminar Conversion</button><br>\n");
      out.write("            <div id=\"EliConve\">\n");
      out.write("                <form role=\"form\" method=\"Post\" action=\"Controlador\">\n");
      out.write("                    <input class=\"form-control\" type=\"hidden\" name=\"accion\" value=\"EliminarConv\"/>\n");
      out.write("                    <label>Selecciona la Conversion a Eliminar</label>\n");
      out.write("                    <select name=\"EliminarConver\" class=\"form-control\">\n");
      out.write("                        ");

                            ArrayList<Conversion> EliConv = ConversionDB.llenarListaConversion();
                            for (Conversion cV : EliConv) {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(cV.getId());
      out.write("\"> ");
      out.print(cV.getMonedaOriginal() + " - " + cV.getMonedaDestino());
      out.write(" </option>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </select><br>\n");
      out.write("                    <center><input class=\"btn btn-default\" type=\"submit\" value=\"Eliminar\"/></center>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
