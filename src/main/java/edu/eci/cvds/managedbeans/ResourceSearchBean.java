package edu.eci.cvds.managedbeans;

import edu.eci.cvds.entities.*;
import edu.eci.cvds.services.impl.ECIBookServices;
import javax.inject.Inject;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "ResourceSearchBean")
@RequestScoped
public class ResourceSearchBean extends BasePageBean {

    @Inject
    private ECIBookServices eciBookServices;
    public Resource resource;
    public List<Resource> resourcesList;
    private String selectedOptionUbication;
    private String selectedOptionType;
    private String selectedOptioncapacidad;



    public ResourceSearchBean() {
        try {
            resourcesList = new ArrayList<Resource>();
            // resource = loadResource();
        } catch (Exception e) {

        }
    }



    public List<Resource> loadListResources() throws Exception {
        try {
            return eciBookServices.getListResources();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Resource> getResourcesList() {
        return resourcesList;
    }




    public void createResource(Resource resource) {
        try {
            eciBookServices.createResource(resource);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateResource(Resource resource) {
        try {

            eciBookServices.updateResource(resource);
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

    public String getSelectedOptionType() {
        return selectedOptionType;
    }

    public void setSelectedOptionType(String selectedOptionType) {
        this.selectedOptionType = selectedOptionType;
    }

    public String getSelectedOptioncapacidad() {
        return selectedOptioncapacidad;
    }

    public void setSelectedOptioncapacidad(String selectedOptioncapacidad) {
        this.selectedOptioncapacidad = selectedOptioncapacidad;
    }
}
