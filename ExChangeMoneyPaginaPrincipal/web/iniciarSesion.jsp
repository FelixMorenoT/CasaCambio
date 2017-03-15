<%-- 
    Document   : index
    Created on : May 4, 2016, 2:15:19 PM
    Author     : felix
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ExChange Money</title>
	<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
  	<script src="http://jqueryvalidation.org/files/dist/jquery.validate.min.js"></script>
  	<script src="http://jqueryvalidation.org/files/dist/additional-methods.min.js"></script>

        <script src="Jquery's/validacion.js"></script>


        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="Jquery's/estilo.css">



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
                            <a class="navbar-brand" href="#"><img src="Jquery's/monsasey.png"></img></a>
                        </div>

                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav">
                                <li><a href="/ExChangeMoney_Cliente">Inicio <span class="sr-only">(current)</span></a></li>
                                <li><a href="/ExChangeMoney_Cliente">Conversor de Monedas</a></li>
                            </ul>

                            <form class="navbar-form navbar-left" role="search">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Buscar"></input>
                                </div>
                                <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span>&#160;Buscar</button>
                            </form>

                            <ul class="nav navbar-nav navbar-right">
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-user"></span>&#160;Usuarios</a>
                                    <ul class="dropdown-menu">
                                        <li><a href="iniciarSesion.jsp">Inciar Sesion</a></li>
                                        <li role="separator" class="divider"></li>
                                        <li><a href="registro.jsp">Registro Usuario</a></li>            
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav> <!--Fin Barra Navegador-->
                <br>
                
                <div id="formuRegistro" class="col-md-6">
                    <legend>Iniciar Sesion</legend>
                    <form role="form" method="Post" action="Controlador1" id="FormularioUser" name="FormularioUser">
                        <input class="form-control" type="hidden" name="accion" value="IniciarSesion" />
                        <label>Usuario</label>
                        <input class="form-control"type="text" id="User" name="User" placeholder="Estrellita21"/><br>
                        <label>Contraseña</label>
                        <input class="form-control"type="password" id="Clave" name="Clave" placeholder="************"/><br>
                        <center><button type="submit" class="btn btn-default" id="regU" name="regU">Aceptar</button></center>
                    </form>   
                    
                </div>
            </div>
        </div>
    </body>
</html>
