package Modelo;

import java.util.ArrayList;

public class ConversionDB {

    public static ArrayList<Conversion> llenarListaConversion() {
        ArrayList<Object> Datos = (ArrayList<Object>) monedas();
        ArrayList<Conversion> ListaC = new ArrayList<>();

        int i = 0;

        while (i < Datos.size()) {
            Conversion c = new Conversion();
            c.setMonedaOriginal(Datos.get(i) + "");

            ListaC.add(c);
            i = i + 1;
        }
        return ListaC;
    }

    private static java.util.List<java.lang.Object> monedas() {
        servicio.ClienteExchange_Service service = new servicio.ClienteExchange_Service();
        servicio.ClienteExchange port = service.getClienteExchangePort();
        return port.monedas();
    }

}
