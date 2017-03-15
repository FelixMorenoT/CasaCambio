<%-- 
    Document   : index
    Created on : May 4, 2016, 2:15:19 PM
    Author     : felix
--%>

<%@page import="Modelo.ConversionDB"%>
<%@page import="Modelo.Conversion"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <a href="index.jsp"></a>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ExChange Money</title>
        <script src="Jquery's/jquery.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script src="Jquery's/animacion.js"></script>
        <link rel="stylesheet" href="Jquery's/estilo.css" />
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">

                <nav id="barraNav" name="barraNav" class="navbar navbar-default">
                    <div class="container-fluid">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button id="res" type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                <span id="res1" class="sr-only">Toggle navigation</span>
                                <span id="res2" class="icon-bar"></span>
                                <span id="res3" class="icon-bar"></span>
                                <span id="res4" class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="#"><img src="Jquery's/monesay.png"></img></a>
                        </div>

                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav">
                                <li><a href="admin.jsp">Inicio <span class="sr-only">(current)</span></a></li>
                                <li><a href="/ExChangeMoney_Cliente">Conversor de Monedas</a></li>
                            </ul>

                            <form class="navbar-form navbar-left" role="search">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Buscar"></input>
                                </div>
                                <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span>&#160;Buscar</button>
                            </form>

                            <ul class="nav navbar-nav navbar-right">
                                <%
                                    String nombre = (String) request.getAttribute("user");
                                %>
                                <li><a> <%=nombre%></a></li>
                                <li><a href="/ExChangeMoney_Cliente"> Salir</a></li>
                            </ul>
                        </div>

                    </div>

                </nav><!--Fin de la barra Nav-->

                <div id="FuncionesAdmin" class="col-md-6">

                    <center><h1>ExChange Money Administrador</h1></center><br>
                    <button id="NewConversiones" class="btn btn-primary btn-block">Asignacion de Nuevas Conversiones</button><br>
                    <div id="NuevaConversiones">
                        <center><legend>Asignacion de Nuevas Conversiones</legend></center><br>
                        <form role="form" method="Post" action="Controlador">
                            <input class="form-control" type="hidden" name="accion" value="NuevaConversion" />
                            <label>Moneda Original</label><input class="form-control" type="text" name="MonedaOriginal"/>
                            <label>Moneda Destino</label><input class="form-control" type="text" name="MonedaDestino"/>
                            <label>Operacion</label><input class="form-control" type="text" name="Operacion"/>
                            <label>Factor</label><input class="form-control" type="text" name="Factor"/><br>
                            <center><input class="btn btn-default" type="submit" value="Registro"/></center>
                        </form>
                        <br>
                    </div>

                    <button id="UpConversion" class="btn btn-primary btn-block">Actualizar Conversion</button><br>
                    <div id="ActualizarConversion">
                        <center><legend>Actualizar Conversion</legend></center><br>

                        <form role="form" method="Post" action="Controlador">
                            <%
                                ArrayList<Conversion> ConvLis = ConversionDB.llenarListaConversion();
                            %>
                            <input class="form-control" type="hidden" name="accion" value="ActConversion"/>
                            <label>Seleccion de Conversion a Actualizar</label>
                            <select name="ConversionId" class="form-control">
                                <%
                                    for (Conversion conv : ConvLis) {
                                %>
                                <option value="<%=conv.getId()%>"> <%=conv.getMonedaOriginal() + " - " + conv.getMonedaDestino()%></option>
                                <%
                                    }
                                %>
                            </select><br>
                            <label>Moneda Original</label><input class="form-control" type="text" name="MonedaOriginal"/>
                            <label>Moneda Destino</label><input class="form-control" type="text" name="MonedaDestino"/>
                            <label>Operacion</label><input class="form-control" type="text" name="Operacion"/>
                            <label>Factor</label><input class="form-control" type="text" name="Factor"/><br>
                            <center><input class="btn btn-default" type="submit" value="Actualizar"/></center>
                        </form><br>
                    </div>

                    <button id="ViewConversion" class="btn btn-primary btn-block">Listado de Conversiones</button><br>
                    <div id="ViewCon">
                        <center><legend>Listado de Conversiones</legend></center><br>
                        <div id="infoconved"style="overflow:auto;">
                            <table class="table table-hover" style="overflow-y:scroll" >
                                <tr>
                                    <th data-sortable="true"><b>Moneda Original</b></th>
                                    <th data-sortable="true"><b>Moneda Destino</b></th>
                                    <th data-sortable="true"><b>Opercacion</b></td>   
                                    <th data-sortable="true"><b>Factor</b></th>
                                </tr>
                                <%
                                    ArrayList<Conversion> ListaConversion = ConversionDB.llenarListaConversion();
                                    for (Conversion conv : ListaConversion) {
                                %>
                                <tr>
                                    <td><%=conv.getMonedaOriginal()%></td>
                                    <td><%=conv.getMonedaDestino()%></td>
                                    <td><%=conv.getOperacion()%></td>
                                    <td><%=conv.getFactor()%></td>
                                </tr>
                                <%
                                    }
                                %>
                            </table>
                        </div><br>
                    </div>

                    <button id="EliminarConversion" class="btn btn-primary btn-block">Eliminar Conversion</button><br>
                    <div id="EliConve">
                        <form role="form" method="Post" action="Controlador">
                            <input class="form-control" type="hidden" name="accion" value="EliminarConv"/>
                            <label>Selecciona la Conversion a Eliminar</label>
                            <select name="EliminarConver" class="form-control">
                                <%
                                    ArrayList<Conversion> EliConv = ConversionDB.llenarListaConversion();
                                    for (Conversion cV : EliConv) {
                                %>
                                <option value="<%=cV.getId()%>"> <%=cV.getMonedaOriginal() + " - " + cV.getMonedaDestino()%> </option>
                                <%
                                    }
                                %>
                            </select><br>
                            <center><input class="btn btn-default" type="submit" value="Eliminar"/></center>
                        </form>
                    </div>

                </div>
            </div>
        </div>
    </body>
</html>
