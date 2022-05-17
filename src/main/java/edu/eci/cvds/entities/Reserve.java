package edu.eci.cvds.entities;

import java.sql.Time;
import java.sql.Date;

public class Reserve {

    private Integer codigo;
    private Integer recurso;
    private Integer usuario;
    private Time horaInicial;
    private Time horaFinal;
    private String periodicidad;
    private Date fechaFinal;
    private String programa;
    private String recursoi;
    private String nombresu;
    private String apellidosu;

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public Reserve(Integer recurso, Integer usuario, Time horaInicial, Time horaFinal, String periodicidad, Date fechaFinal) {
        this.recurso = recurso;
        this.usuario = usuario;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.periodicidad = periodicidad;
        this.fechaFinal = fechaFinal;
    }

    public Reserve(Integer recurso, Time horaInicial, Time horaFinal, String periodicidad, Date fechaFinal) {
        this.recurso = recurso;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.periodicidad = periodicidad;
        this.fechaFinal = fechaFinal;
    }

    public Reserve(Integer recurso, Time horaInicial, Time horaFinal, String periodicidad, Date fechaFinal, String programa) {
        this.recurso = recurso;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.periodicidad = periodicidad;
        this.fechaFinal = fechaFinal;
        this.programa = programa;
    }

    public String getRecursoi() {
        return recursoi;
    }

    public void setRecursoi(String recursoi) {
        this.recursoi = recursoi;
    }

    public String getNombresu() {
        return nombresu;
    }

    public void setNombresu(String nombresu) {
        this.nombresu = nombresu;
    }

    public String getApellidosu() {
        return apellidosu;
    }

    public void setApellidosu(String apellidosu) {
        this.apellidosu = apellidosu;
    }

    public Reserve(String recursoi, String nombresu, String apellidosu, Time horaInicial, Time horaFinal, String periodicidad, Date fechaFinal, String programa) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.periodicidad = periodicidad;
        this.fechaFinal = fechaFinal;
        this.programa = programa;
        this.recursoi = recursoi;
        this.nombresu = nombresu;
        this.apellidosu = apellidosu;
    }

    public Reserve getReserve(){
        return this;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getRecurso() {
        return recurso;
    }

    public void setRecurso(Integer recurso) {
        this.recurso = recurso;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
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
