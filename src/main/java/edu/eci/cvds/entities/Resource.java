package edu.eci.cvds.entities;

public class Resource {
    //Atributos sobre atributos de la base de datos
    private String codigo;
    private String tipo;
    private String nombre;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEnUso() {
        return enUso;
    }

    public void setEnUso(Boolean enUso) {
        this.enUso = enUso;
    }

    private Boolean enUso;
}