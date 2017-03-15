/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author felix
 */
@WebService(serviceName = "ClienteExchange")
@Stateless()
public class ClienteExchange {

    private String id;
    private String MonedaOriginal;
    private String MonedaDestino;
    private String Operacion;
    private double factor;

    @WebMethod
    public String CalculoConversion(String MonedaO, String MonedaD, double Monto) {
        String conexionBD = "jdbc:mysql://localhost:3306/casacambio";
        com.mysql.jdbc.Connection conexion = null;
        String con;
        ResultSet rs;
        double ValorConversion=0;
        NumberFormat formato = new DecimalFormat("#0.00");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (com.mysql.jdbc.Connection) DriverManager.getConnection(conexionBD, "root", "");
            Statement s = conexion.createStatement();
            con = "SELECT Operacion,Factor from conversion where MonedaOriginal='"+MonedaO+"'and MonedaDestino='"+MonedaD+"'";
            rs = s.executeQuery(con);
            System.out.println("Soy el Resultado del query: " + rs.toString());
            {
                while (rs.next()) {
                    Operacion = rs.getString("Operacion");
                    factor = rs.getDouble("Factor");
                    System.out.println("SOY LA OPERACION " + Operacion);
                    System.out.println("SOY EL FACTOR " + factor);
                    System.out.println("SOY EL MONTO: " + Monto);
                }
                String op1 = "Division";
                String op2 = "Multiplicacion";
                if (Operacion.equalsIgnoreCase(op1)) {
                    ValorConversion=0;
                    ValorConversion = Monto / factor;
                    System.out.println("SOY LA DIVISION: " + ValorConversion);
                } else if(Operacion.equalsIgnoreCase(op2)) {
                    ValorConversion=0;
                    ValorConversion = Monto * factor;
                    System.out.println("SOY LA MULTIPLICACION: " + formato.format(ValorConversion));
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No Contamos con esa Conversion" + e);
        }
        return formato.format(ValorConversion);
    }
    
    @WebMethod
    public ArrayList Monedas (){
        ArrayList<Object> listaMonedas = new ArrayList<>();
        String conexionBD = "jdbc:mysql://localhost:3306/casacambio";
        com.mysql.jdbc.Connection conexion = null;
        String con;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (com.mysql.jdbc.Connection) DriverManager.getConnection(conexionBD, "root", "");
            Statement s = conexion.createStatement();
            con = "SELECT DISTINCT MonedaOriginal FROM conversion order by MonedaOriginal";
            rs = s.executeQuery(con);
            {
                while (rs.next()) {
                    MonedaOriginal = rs.getString("MonedaOriginal");
                    listaMonedas.add(MonedaOriginal);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se ha completado la peticion Mostrar..." + e);
        }
        return listaMonedas;
    }
}
