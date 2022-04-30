package edu.eci.cvds.entities;

public class Resource {
    private Integer codigo;
    private Integer tipo;
    private Integer ubicacion;
    private String nombre;
    private String estado;

    public Resource(Integer codigo, Integer tipo, Integer ubicacion, String nombre, String estado) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
