package edu.eci.cvds.managedbeans;

import edu.eci.cvds.entities.*;
import edu.eci.cvds.services.impl.ECIBookServices;
import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name="resourceBean")
@RequestScoped
public class ResourceBean extends BasePageBean{

    @Inject
    private ECIBookServices eciBookServices;
    public Resource resource;
    public List<Resource> resourcesList;



    public ResourceBean() {
        try{
            resourcesList = new ArrayList<Resource>();
            //resource = loadResource();
        } catch (Exception e){

        }
    }

    public void save(Resource resource) throws Exception{
        try{
            //Uso de metodos en clase eciBookServices
            //eciBookServices.createResource(resource);
        }
        catch (Exception e){
            // cambiar cuando se implementen las excepciones
            // de servicesException
        }
    }



    public Resource loadResource() throws Exception{
        try {
            return eciBookServices.getResource();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Resource> loadListResources() throws Exception {
        try{
            return eciBookServices.getListResources();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Resource> getResourcesList() {
        return resourcesList;
    }
}
