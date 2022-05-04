package edu.eci.cvds.managedbeans;


import com.google.inject.Inject;
import edu.eci.cvds.entities.Location;
import edu.eci.cvds.entities.ResourceType;
import edu.eci.cvds.services.impl.ECIBookServices;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

@ManagedBean(name="createResource")
@RequestScoped
public class CreateResourceBean {
    @Inject
    private ECIBookServices eciBookServices;
    private String selectedOption;
    private List<ResourceType> resourceTypeList;
    private List<Location> locationList;

    public CreateResourceBean() {

        try {
            resourceTypeList = eciBookServices.getResourceType();
            locationList = eciBookServices.getLocation();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void createResource(){
        
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }
}
