package edu.eci.cvds.entities;

import java.sql.Time;
import java.sql.Date;

public class Reserve {

    private Integer codigo;
    private String recurso;
    private Time horaInicial;
    private Time horaFinal;
    private String periodicidad;
    private Date fechaFinal;

    private Integer recurso2;


    public Reserve(Integer codigo, String recurso, Time horaInicial, Time horaFinal, String periodicidad, Date fechaFinal) {
        this.codigo = codigo;
        this.recurso = recurso;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.periodicidad = periodicidad;
        this.fechaFinal = fechaFinal;
    }

    public Reserve(Integer recurso, Time horaInicial, Time horaFinal, String periodicidad, Date fechaFinal) {
        this.recurso2 = recurso;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.periodicidad = periodicidad;
        this.fechaFinal = fechaFinal;
    }

    public Integer getRecurso2() {
        return recurso2;
    }

    public void setRecurso2(Integer recurso2) {
        this.recurso2 = recurso2;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    public Time getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Time horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Time getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Time horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }


}
