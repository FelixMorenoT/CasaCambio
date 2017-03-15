package Modelo;

public class Usuario {
    private int id;
    private String Correo;
    private String Nombre;
    private String User;
    private String Clave;

    public Usuario() {
    }

    public Usuario(int id, String Correo, String Nombre, String User, String Clave) {
        this.id = id;
        this.Correo = Correo;
        this.Nombre = Nombre;
        this.User = User;
        this.Clave = Clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    
    
}
