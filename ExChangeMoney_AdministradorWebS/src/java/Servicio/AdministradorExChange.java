/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.jws.WebService;
import javax.jws.WebMethod;

import javax.ejb.Stateless;

/**
 *
 * @author felixmorenotabares
 */
@WebService(serviceName = "AdministradorExChange")
@Stateless()
public class AdministradorExChange {

    private String id;
    private String MonedaOriginal;
    private String MonedaDestino;
    private String Operacion;
    private double factor;

    @WebMethod
    public boolean InsercionConversion(String MonedaO, String MonedaD, String Ope, double Fac) {
        String conexionBD = "jdbc:mysql://localhost:3306/casacambio";
        Connection conexion = null;
        boolean funciono = false;
        String con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(conexionBD, "root", "");
            Statement s = conexion.createStatement();
            con = "INSERT INTO conversion (MonedaOriginal,MonedaDestino,Operacion,Factor)VALUES ('" + MonedaO + "','" + MonedaD + "','" + Ope + "','" + Fac + "')";
            s.executeUpdate(con);
            funciono = true;
        } catch (Exception e) {
            System.out.println("No se ha completado la peticion insercion" + e);
        }
        return funciono;
    }

    @WebMethod
    public boolean ActualizarConversion(int Identificador, String MonedaO, String MonedaD, String Operacion, double Factor) {
        String conexionBD = "jdbc:mysql://localhost:3306/casacambio";
        com.mysql.jdbc.Connection conexion = null;
        boolean funciono = false;
        String con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (com.mysql.jdbc.Connection) DriverManager.getConnection(conexionBD, "root", "");
            Statement s = conexion.createStatement();
            con = "update Conversion set "
                    + "MonedaOriginal='" + MonedaO
                    + "',MonedaDestino='" + MonedaD
                    + "',Operacion='" + Operacion
                    + "',Factor='" + Factor
                    + "' where Conversion_id='" + Identificador + "'";
            s.executeUpdate(con);
            funciono = true;
        } catch (Exception e) {
            System.out.println("No se ha completado la peticion Actualizacion...");
        }
        return funciono;
    }

    @WebMethod
    public ArrayList MostrarConversion() {
        String conexionBD = "jdbc:mysql://localhost:3306/casacambio";
        com.mysql.jdbc.Connection conexion = null;
        String con;
        ResultSet rs;
        ArrayList<Object> ListadoConversiones = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (com.mysql.jdbc.Connection) DriverManager.getConnection(conexionBD, "root", "");
            Statement s = conexion.createStatement();
            con = "SELECT * FROM conversion";
            rs = s.executeQuery(con);
            {
                while (rs.next()) {
                    id = rs.getString("Conversion_id");
                    ListadoConversiones.add(id);
                    MonedaOriginal = rs.getString("MonedaOriginal");
                    ListadoConversiones.add(MonedaOriginal);
                    MonedaDestino = rs.getString("MonedaDestino");
                    ListadoConversiones.add(MonedaDestino);
                    Operacion = rs.getString("Operacion");
                    ListadoConversiones.add(Operacion);
                    factor = rs.getDouble("Factor");
                    ListadoConversiones.add(factor);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se ha completado la peticion Mostrar..." + e);
        }
        return ListadoConversiones;
    }

    @WebMethod
    public boolean EliminarConversion(int Identificar) {
        String conexionBD = "jdbc:mysql://127.0.0.1/casacambio";
        com.mysql.jdbc.Connection conexion = null;
        boolean funciono = false;
        String con;
        try {
            Class.forName("com.mysql.jdbc.Driver");//el driver de mysql
            conexion = (com.mysql.jdbc.Connection) DriverManager.getConnection(conexionBD, "root", "");//conexion a la base de datos
            Statement s = conexion.createStatement();
            con = "delete from Conversion where Conversion_id='" + Identificar + "'";
            s.executeUpdate(con);
            funciono = true;
        } catch (Exception e) {
            System.out.println("No se ha completado la peticionn Eliminar...");
        }
        return funciono;
    }

}
