package Modelo;

import java.util.ArrayList;

public class ConversionDB {

    public static ArrayList<Conversion> llenarListaConversion() {
        ArrayList<Object> Datos = (ArrayList<Object>) mostrarConversion();
        ArrayList<Conversion> ListaC = new ArrayList<>();

        int i = 0;

        while (i < Datos.size()) {
            Conversion c = new Conversion();
            c.setId(Integer.parseInt(Datos.get(i) + ""));
            c.setMonedaOriginal(Datos.get(i + 1) + "");
            c.setMonedaDestino(Datos.get(i + 2) + "");
            c.setOperacion(Datos.get(i + 3) + "");
            c.setFactor(Double.parseDouble(Datos.get(i + 4) + ""));
            ListaC.add(c);
            i = i + 5;
        }
        return ListaC;
    }

    private static java.util.List<java.lang.Object> mostrarConversion() {
        ServicioAdmin.AdministradorExChange_Service service = new ServicioAdmin.AdministradorExChange_Service();
        ServicioAdmin.AdministradorExChange port = service.getAdministradorExChangePort();
        return port.mostrarConversion();
    }

}
