package edu.eci.cvds.entities;

import java.sql.Time;

public class Location {
    private String ubicacion;
    private Time horaMinima;
    private Time horaMaxima;

    public Location(String ubicacion, Time horaMinima, Time horaMaxima) {
        this.ubicacion = ubicacion;
        this.horaMinima = horaMinima;
        this.horaMaxima = horaMaxima;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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
