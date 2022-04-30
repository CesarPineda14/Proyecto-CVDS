package edu.eci.cvds.entities;

import java.sql.Time;

public class Location {
    private int codigo;
    private String nombre;
    private Time horaMinima;
    private Time horaMaxima;

    public int getCodigo() {
        return codigo;
    }

    public Location(int codigo, String nombre, Time horaMinima, Time horaMaxima) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horaMinima = horaMinima;
        this.horaMaxima = horaMaxima;
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
