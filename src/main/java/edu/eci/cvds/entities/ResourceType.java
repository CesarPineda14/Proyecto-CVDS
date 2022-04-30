package edu.eci.cvds.entities;

import java.sql.Time;

public class ResourceType {
    private int codigo;
    private String nombre;
    private String descripcion;
    private Time horaMinima;
    private Time horaMaxima;

    public ResourceType(int codigo, String nombre, String descripcion, Time horaMinima, Time horaMaxima) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horaMinima = horaMinima;
        this.horaMaxima = horaMaxima;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
