package edu.eci.cvds.entities;

import java.sql.Time;

public class ResourceType {
    private String tipo;
    private String descripcion;
    private Time horaMinima;
    private Time horaMaxima;

    public ResourceType(String tipo, String descripcion, Time horaMinima, Time horaMaxima) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.horaMinima = horaMinima;
        this.horaMaxima = horaMaxima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Time getHoraMinima() {
        return horaMinima;
    }

    public void setHoraMinima(Time horaMinima) {
        this.horaMinima = horaMinima;
    }

    public Time getHoraMaxima() {
        return horaMaxima;
    }

    public void setHoraMaxima(Time horaMaxima) {
        this.horaMaxima = horaMaxima;
    }
}
