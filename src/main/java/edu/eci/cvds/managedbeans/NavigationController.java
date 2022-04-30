package edu.eci.cvds.managedbeans;

import java.io.Serializable;  

import javax.faces.bean.ManagedBean; 
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped

public class NavigationController implements Serializable {
    public String paginaInicio() {
        return "inicioSesion";
    }
    public String paginaRegistroRec() {
        return "registrarRecurso";
    }
    public String paginaConsultaRec() {
        return "consultarRecursos";
    }
    public String paginaReservas() {
        return "reservas";
    }

    public String paginaAdmin() {
        return "paginaAdmin";
    }
}
