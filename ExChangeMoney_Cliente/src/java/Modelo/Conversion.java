package Modelo;

public class Conversion {
    private int Id;
    private String MonedaOriginal;
    private String MonedaDestino;
    private String Operacion;
    private double Factor;

    public Conversion() {
    }

    public Conversion(int Id, String MonedaOriginal, String MonedaDestino, String Operacion, double Factor) {
        this.Id = Id;
        this.MonedaOriginal = MonedaOriginal;
        this.MonedaDestino = MonedaDestino;
        this.Operacion = Operacion;
        this.Factor = Factor;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMonedaOriginal() {
        return MonedaOriginal;
    }

    public void setMonedaOriginal(String MonedaOriginal) {
        this.MonedaOriginal = MonedaOriginal;
    }

    public String getMonedaDestino() {
        return MonedaDestino;
    }

    public void setMonedaDestino(String MonedaDestino) {
        this.MonedaDestino = MonedaDestino;
    }

    public String getOperacion() {
        return Operacion;
    }

    public void setOperacion(String Operacion) {
        this.Operacion = Operacion;
    }

    public double getFactor() {
        return Factor;
    }

    public void setFactor(double Factor) {
        this.Factor = Factor;
    }


    
    
}
