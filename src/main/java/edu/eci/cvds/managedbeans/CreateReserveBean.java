package edu.eci.cvds.managedbeans;


import com.google.inject.Inject;

import edu.eci.cvds.services.ExceptionServices;
import org.primefaces.event.SelectEvent;

import edu.eci.cvds.entities.Reserve;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.services.implementation.CiclasServices;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.persistence.criteria.CriteriaBuilder;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@ManagedBean(name = "createReserve")
@RequestScoped
public class CreateReserveBean extends BasePageBean{

    @Inject
    private CiclasServices ciclasServices;

    private List<Resource> resourceList;
    private List<Reserve> reserveList;
    private Date fecha;
    private String fechaSelec = "";
    private String selectedOneMenuRecurso;
    private String selectedOneMenuUser;
    private Date horaInicialSelected;
    private Date horaFinalSelected;
    private String periodicidad;
    private Date fechaFinal;



    public void createReserve() {
        try {
            Integer selectedOneMenuRecursoI = Integer.parseInt(selectedOneMenuRecurso);
            Integer selectedOneMenuUserI = Integer.parseInt(selectedOneMenuUser);
            Time horaInicialT = new Time (horaInicialSelected.getTime());
            Time horaFinalT = new Time (horaFinalSelected.getTime());
            Reserve reserve = new Reserve(selectedOneMenuRecursoI, selectedOneMenuUserI, horaInicialT, horaFinalT,
                    periodicidad, new java.sql.Date(fechaFinal.getTime()));
            addMessage("Confirmed", "Reserva Agregada");
            ciclasServices.createReserve(reserve);
        } catch (Exception e){
            addMessage("Not Confirmed", "Reserva No Agregada");
            System.out.println(e.getMessage());
        }
    }

    public CreateReserveBean() {

        try {
            //resourceTypeList = eciBookServices.getResourceType();
            resourceList = ciclasServices.getListResources();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void actualizarFecha(SelectEvent event) {
        SimpleDateFormat fecha1 = new SimpleDateFormat("EEEEE dd MMMMM yyyy");
        StringBuilder cadena_fecha1_11 = new StringBuilder(fecha1.format(event.getObject()));
        fechaSelec = cadena_fecha1_11.toString();
        
    }

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public Date getHoraInicialSelected() {
        return horaInicialSelected;
    }

    public void setHoraInicialSelected(Date horaInicialSelected) {
        this.horaInicialSelected = horaInicialSelected;
    }

    public Date getHoraFinalSelected() {
        return horaFinalSelected;
    }

    public void setHoraFinalSelected(Date horaFinalSelected) {
        this.horaFinalSelected = horaFinalSelected;
    }

    public String getSelectedOneMenuRecurso() {
        return selectedOneMenuRecurso;
    }

    public void setSelectedOneMenuRecurso(String selectedOneMenuRecurso) {
        this.selectedOneMenuRecurso = selectedOneMenuRecurso;
    }

    public String getSelectedOneMenuUser() {
        return selectedOneMenuUser;
    }

    public void setSelectedOneMenuUser(String selectedOneMenuUser) {
        this.selectedOneMenuUser = selectedOneMenuUser;
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


    public void setCiclasServices(CiclasServices ciclasServices) {
        this.ciclasServices = ciclasServices;
    }

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList = resourceList;
    }

    public List<Reserve> getReserveList() {
        return reserveList;
    }

    public void setReserveList(List<Reserve> reserveList) {
        this.reserveList = reserveList;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFechaSelec() {
        return fechaSelec;
    }

    public void setFechaSelec(String fechaSelec) {
        this.fechaSelec = fechaSelec;
    }
}
