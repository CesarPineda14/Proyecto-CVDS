package edu.eci.cvds.managedbeans;


import com.google.inject.Inject;

import org.primefaces.event.SelectEvent;

import edu.eci.cvds.entities.Reserve;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.services.implementation.CiclasServices;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

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


    public CreateReserveBean() {

        try {
            //resourceTypeList = eciBookServices.getResourceType();
            resourceList = ciclasServices.getListResources();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

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



    public CiclasServices getEciBookServices() {
        return ciclasServices;
    }

    public void setEciBookServices(CiclasServices ciclasServices) {
        this.ciclasServices = ciclasServices;
    }

    public void actualizarFecha(SelectEvent event) {
        SimpleDateFormat fecha1 = new SimpleDateFormat("EEEEE dd MMMMM yyyy");
        StringBuilder cadena_fecha1_11 = new StringBuilder(fecha1.format(event.getObject()));
        fechaSelec = cadena_fecha1_11.toString();
        
    }



}
