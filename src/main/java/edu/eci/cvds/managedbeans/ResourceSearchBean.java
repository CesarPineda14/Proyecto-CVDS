package edu.eci.cvds.managedbeans;

import edu.eci.cvds.entities.*;
import edu.eci.cvds.services.impl.ECIBookServices;
import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name="ResourceSearchBean")
@RequestScoped
public class ResourceSearchBean extends BasePageBean{

    @Inject
    private ECIBookServices eciBookServices;
    public Resource resource;
    public List<Resource> resourcesList;
    private String selectedOptionUbication;
    private String selectedOptionType;
    private String selectedOptioncapacidad;



    public ResourceSearchBean() {
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

    public void createResource(Resource resource){
        try {
            eciBookServices.createResource(resource);
        }
        catch (Exception e){

        }
    }

    public void updateResource(){
        try{
            eciBookServices.updateResource(resource);
        }catch(Exception e){

        }
    }

    public List<Resource> searchResourceType(){
        try {
            return eciBookServices.searchResourceType(Integer.parseInt(selectedOptionType));
        }
        catch (Exception e){
            return null;
        }
    }

    public List<Resource> searchResourceCapacity(){
        try {
            return eciBookServices.searchResourceCapacity(Integer.parseInt(selectedOptioncapacidad));
        }
        catch (Exception e){
            return null;
        }
    }

    public List<Resource> searchResourceLocation(){
        try {
            return eciBookServices.searchResourceLocation(Integer.parseInt(selectedOptionUbication));
        }
        catch (Exception e){
            return  null;
        }
    }
}
