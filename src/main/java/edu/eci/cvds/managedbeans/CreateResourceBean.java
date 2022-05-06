package edu.eci.cvds.managedbeans;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Location;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.entities.ResourceType;
import edu.eci.cvds.services.ServicesException;
import edu.eci.cvds.services.impl.ECIBookServices;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.util.List;

@ManagedBean(name = "creaRecurso")
@SessionScoped
public class CreateResourceBean extends BasePageBean {
    @Inject
    private ECIBookServices eciBookServices;

    private String selectedOptionUbication;
    private String selectedOptionRecTipe;
    private String selectedOptionState;
    private String nombreRecurso;
    private String capacidadRecurso;
    private List<ResourceType> resourceTypeList;
    private List<Location> locationList;

    public CreateResourceBean() {

        try {
            resourceTypeList = eciBookServices.getResourceType();
            locationList = eciBookServices.getLocation();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void createResources() throws ServicesException {
        System.out.println("Esta entrando");
        try {
            int indexResourceType = Integer.parseInt(selectedOptionRecTipe);
            int indexLocation = Integer.parseInt(selectedOptionUbication);
            Resource resource = new Resource(indexResourceType, indexLocation,
                    nombreRecurso, selectedOptionState,
                    Integer.parseInt(capacidadRecurso));
            eciBookServices.createResource(resource);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getSelectedOptionUbication() {
        return selectedOptionUbication;
    }

    public void setSelectedOptionUbication(String selectedOptionUbication) {
        this.selectedOptionUbication = selectedOptionUbication;
    }

    public String getSelectedOptionRecTipe() {
        return selectedOptionRecTipe;
    }

    public void setSelectedOptionRecTipe(String selectedOptionRecTipe) {
        this.selectedOptionRecTipe = selectedOptionRecTipe;
    }

    public String getSelectedOptionState() {
        return selectedOptionState;
    }

    public void setSelectedOptionState(String selectedOptionState) {
        this.selectedOptionState = selectedOptionState;
    }

    public String getNombreRecurso() {
        return nombreRecurso;
    }

    public void setNombreRecurso(String nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }

    public String getCapacidadRecurso() {
        return capacidadRecurso;
    }

    public void setCapacidadRecurso(String capacidadRecurso) {
        this.capacidadRecurso = capacidadRecurso;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }

    public void setResourceTypeList(List<ResourceType> resourceTypeList) {
        this.resourceTypeList = resourceTypeList;
    }

    public List<Location> getLocationList() {
        return locationList;
    }

    public List<ResourceType> getResourceTypeList() {
        return resourceTypeList;
    }

}
