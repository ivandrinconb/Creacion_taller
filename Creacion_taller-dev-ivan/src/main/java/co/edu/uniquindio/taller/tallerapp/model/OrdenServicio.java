package co.edu.uniquindio.taller.tallerapp.model;

import java.time.LocalDate;

public class OrdenServicio {
    private LocalDate fechaIngreso;
    private LocalDate horaIngreso;
    private Bicicleta bicicletaAtendida;
    private Mecanico responsable;
    private String motivoServicio;
    private String diagnostico;
    private String trabajosRealizados;
    private double costoFinal;


    public OrdenServicio(LocalDate fechaIngreso,LocalDate horaIngreso,Bicicleta bicicletaAtendida,Mecanico responsable,String motivoServicio,String trabajosRealizados,String diagnostico,double costoFinal) {
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
        this.bicicletaAtendida = bicicletaAtendida;
        this.responsable = responsable;
        this.motivoServicio = motivoServicio;
        this.diagnostico = diagnostico;
        this.trabajosRealizados = trabajosRealizados;
        this.costoFinal = costoFinal;
    }
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public LocalDate getHoraIngreso() {
        return horaIngreso;
    }
    public void setHoraIngreso(LocalDate horaIngreso) {
        this.horaIngreso = horaIngreso;
    }
    public Bicicleta getBicicletaAtendida() {
        return bicicletaAtendida;
    }

    public void setBicicletaAtendida(Bicicleta bicicletaAtendida) {
        this.bicicletaAtendida = bicicletaAtendida;
    }
    public Mecanico getResponsable() {
        return responsable;
    }
    public void setResponsable(Mecanico responsable) {
        this.responsable = responsable;
    }
    public String getMotivoServicio() {
        return motivoServicio;
    }
    public void setMotivoServicio(String motivoServicio) {
        this.motivoServicio = motivoServicio;
    }
    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public String getTrabajosRealizados() {
        return trabajosRealizados;
    }
    public void setTrabajosRealizados(String trabajosRealizados) {
        this.trabajosRealizados = trabajosRealizados;
    }
    public double getCostoFinal() {
        return costoFinal;
    }
    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
    }


}
