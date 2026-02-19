package co.edu.uniquindio.taller.tallerapp.model;

public class Cliente {
    private TipoBicicleta tipoBicicleta;
    private String nombre;
    private String identificacion;
    private String telefono;
    private String direccion;

    public Cliente() {}


    public Cliente(String nombre, String identificacion, String telefono, String direccion, TipoBicicleta tipoBicicleta) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipoBicicleta = tipoBicicleta;
    }

    public TipoBicicleta getTipoBicicleta() {
        return tipoBicicleta;
    }
    public void setTipoBicicleta(TipoBicicleta tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
