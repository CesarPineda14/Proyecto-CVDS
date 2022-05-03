package edu.eci.cvds.managedbeans;

import java.io.Serializable;  

import javax.faces.bean.ManagedBean; 
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped

public class NavigationController implements Serializable {
    public String paginaInicio() {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/inicioSesion.xhtml");
    }
    public void paginaRegistroRec() {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/registrarRecurso.xhtml");
    }
    public String paginaConsultaRec() {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/consultarRecursos.xhtml");
    }
    public String paginaReservas() {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/consultarRecursos.xhtml");
    }

    public String paginaAdmin() {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/paginaAdmin.xhtml");
    }

    public String paginaModificar(){
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/modificarRecursos.xhtml");
    }

    public String paginaCambiarEstado(){
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/cambiarEstadoR.xhtml");
    }

}
