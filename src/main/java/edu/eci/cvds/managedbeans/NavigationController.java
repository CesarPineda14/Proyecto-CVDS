package edu.eci.cvds.managedbeans;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped

public class NavigationController implements Serializable {
    public void paginaInicio() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/inicioSesion.xhtml");
    }

    public void paginaRegistroRec() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/registrarRecurso.xhtml");
    }

    public void paginaConsultaRec() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/consultarRecursos.xhtml");
    }

    public void paginaReservas() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/reservarRecurso.xhtml");
    }

    public void paginaAdmin() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/paginaAdmin.xhtml");
    }

    public void paginaModificar() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/modificarRecursos.xhtml");
    }

    public void paginaCambiarEstado() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/cambiarEstadoR.xhtml");
    }

}
