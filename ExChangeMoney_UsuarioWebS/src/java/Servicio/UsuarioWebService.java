/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.ejb.Stateless;

/**
 *
 * @author felixmorenotabares
 */
@WebService(serviceName = "UsuarioWebService")
@Stateless()
public class UsuarioWebService {

    String usuarioB="";
    String clave ="";
    @WebMethod
    public boolean InsertarUsuario(String Correo, String Nombre, String Usuario, String Clave) {
        String conexionBD = "jdbc:mysql://localhost:3306/casacambio";
        Connection conexion = null;
        String con;
        boolean funciono = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(conexionBD, "root", "");
            Statement s = conexion.createStatement();
            con = "INSERT INTO usuario (correo, nombre, user, clave)VALUES ('" + Correo + "','" + Nombre + "','" + Usuario + "',MD5('" + Clave + "'))";
            s.executeUpdate(con);
            funciono = true;
        } catch (Exception e) {
            System.out.println("No se ha completado la peticion insercion" + e);
        }
        return funciono;
    }

    @WebMethod
    public boolean IniciarSesion(String Usuario, String Clave) {
        String conexionBD = "jdbc:mysql://localhost:3306/casacambio";
        com.mysql.jdbc.Connection conexion = null;
        String con;
        ResultSet rs;
        boolean funciono = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (com.mysql.jdbc.Connection) DriverManager.getConnection(conexionBD, "root", "");
            Statement s = conexion.createStatement();
            con = "SELECT user, clave FROM Usuario where user='"+Usuario+"'and clave=MD5('"+Clave+"')";
            rs = s.executeQuery(con);

            {
                while (rs.next()) {
                    usuarioB = rs.getString("user");
                    clave = rs.getString("clave");
                    System.out.println("SOY EL USARIO DB "+ usuarioB);
                    System.out.println("SOY EL USUARIO INGRESADO " + Usuario);
                    if(Usuario.equalsIgnoreCase(usuarioB)){
                        funciono=true;
                        System.out.println("EXITO EN EL INCIO");
                    }else{
                        funciono=false;
                        System.out.println("FALLO EN EL INICIO");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se ha completado la peticion Iniciar..." + e);
        }
        return funciono;
    }

    @WebMethod
    public boolean ActualizarUsuario(String NombreUsuario, String Clave) {
        String conexionBD = "jdbc:mysql://localhost:3306/casacambio";
        Connection conexion = null;
        String con;
        boolean funciono = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(conexionBD, "root", "");
            Statement s = conexion.createStatement();
            con = "update usuario set clave=MD5('" + Clave + "') where user='" + NombreUsuario + "'";
            s.executeUpdate(con);
            funciono = true;
        } catch (Exception e) {
            System.out.println("No se ha completado la peticion insercion" + e);
        }
        return funciono;
    }

    @WebMethod
    public boolean EliminarUsuario(String NombreUsuario) {
        String conexionBD = "jdbc:mysql://localhost:3306/casacambio";
        Connection conexion = null;
        String con;
        boolean funciono = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(conexionBD, "root", "");
            Statement s = conexion.createStatement();
            con = "delete from usuario where user='" + NombreUsuario + "'";
            s.executeUpdate(con);
            funciono = true;
        } catch (Exception e) {
            System.out.println("No se ha completado la peticion insercion" + e);
        }
        return funciono;
    }
}
