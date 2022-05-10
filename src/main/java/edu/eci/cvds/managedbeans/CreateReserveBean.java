package edu.eci.cvds.managedbeans;


import com.google.inject.Inject;
import edu.eci.cvds.entities.Reserve;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.entities.ResourceType;
import edu.eci.cvds.services.ServicesException;
import edu.eci.cvds.services.impl.ECIBookServices;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import java.sql.Time;
import java.sql.Date;
import java.util.List;
@ManagedBean(name = "createReserve")
@RequestScoped
public class CreateReserveBean extends BasePageBean{

    @Inject
    private ECIBookServices eciBookServices;

    private String recurso;
    private Time horaInicial;
    private Time horaFinal;
    private String periodicidad;
    private Date fechaFinal;
    private List<Resource> resourceList;
    private List<ResourceType> resourceTypeList;


    public CreateReserveBean() {

        try {
            resourceTypeList = eciBookServices.getResourceType();
            //resourceList = eciBookServices.getListResources();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void createResources() throws ServicesException {
        System.out.println("Esta entrando");
        try {
            Reserve reserve = new Reserve(Integer.parseInt(recurso), horaInicial,
                    horaFinal, periodicidad, fechaFinal);
            eciBookServices.createReserve(reserve);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ECIBookServices getEciBookServices() {
        return eciBookServices;
    }

    public void setEciBookServices(ECIBookServices eciBookServices) {
        this.eciBookServices = eciBookServices;
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

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList = resourceList;
    }

    public List<ResourceType> getResourceTypeList() {
        return resourceTypeList;
    }

    public void setResourceTypeList(List<ResourceType> resourceTypeList) {
        this.resourceTypeList = resourceTypeList;
    }

}
