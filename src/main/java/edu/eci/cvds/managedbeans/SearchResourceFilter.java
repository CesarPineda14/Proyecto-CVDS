package edu.eci.cvds.managedbeans;

import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.services.impl.ECIBookServices;

import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name="ResourceSearchFilter")
@RequestScoped
public class SearchResourceFilter extends BasePageBean{

    @Inject
    private ECIBookServices eciBookServices;
    public Resource resource;
    public List<Resource> resourcesListType;
    public List<Resource> resourcesListLocation;
    public List<Resource> resourcesListCapacity;


    public SearchResourceFilter() {
        try{
            resourcesListType = new ArrayList<Resource>();
            resourcesListLocation = new ArrayList<Resource>();
            resourcesListCapacity = new ArrayList<Resource>();
            //resource = loadResource();
        } catch (Exception e){

        }
    }

}
