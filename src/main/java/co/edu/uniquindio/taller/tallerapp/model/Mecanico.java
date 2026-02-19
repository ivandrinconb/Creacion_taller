package co.edu.uniquindio.taller.tallerapp.model;

public class Mecanico {
    private String nombre;
    private String especialidad;
    private String codigoInterno;

    public Mecanico() {}

    public Mecanico(String nombre, String especialidad, String codigoInterno) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.codigoInterno = codigoInterno;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getCodigoInterno() {
        return codigoInterno;
    }
    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    @Override
    public String toString() {
        return "Mecanico=" + '\n' +
                "nombre=" + nombre  + '\n' +
                "especialidad=" + especialidad  + '\n' +
                "codigoInterno=" + codigoInterno;

    }
}
