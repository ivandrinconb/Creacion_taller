package co.edu.uniquindio.taller.tallerapp.model;

public class Bicicleta {
    private String color;
    private String marca;
    private String serial;
    private int modelo;

    public Bicicleta() {}


    public Bicicleta(String color, String marca, String serial, int modelo) {
        this.color = color;
        this.marca = marca;
        this.serial = serial;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}


