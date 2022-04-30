package edu.eci.cvds.entities;

public class User {
    private String id;
    private String nid;
    private String apellidos;
    private String nombres;
    private String programa;
    private String tipo;
    private String contrasena;

    public User(String id, String nid, String apellidos, String nombres, String programa, String tipo, String contrasena) {
        this.id = id;
        this.nid = nid;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.programa = programa;
        this.tipo = tipo;
        this.contrasena = contrasena;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
