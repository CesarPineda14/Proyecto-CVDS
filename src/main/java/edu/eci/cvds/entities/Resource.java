package edu.eci.cvds.entities;

public class Resource {
    private String nombre;
    private String ubicacion;
    private String tipo;
    private String codigo;
    private String estado;

    public Resource(String nombre, String ubicacion, String tipo, String codigo, String estado) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.codigo = codigo;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Resource getResource(){
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
