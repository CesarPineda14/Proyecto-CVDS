package edu.eci.cvds.managedbeans;


import com.google.inject.Inject;
import edu.eci.cvds.entities.Reserve;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.services.implementation.CiclasServices;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import java.util.List;
@ManagedBean(name = "createReserve")
@RequestScoped
public class CreateReserveBean extends BasePageBean{

    @Inject
    private CiclasServices ciclasServices;

    private List<Resource> resourceList;
    private List<Reserve> reserveList;


    public CreateReserveBean() {

        try {
            //resourceTypeList = eciBookServices.getResourceType();
            resourceList = ciclasServices.getListResources();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }



    public CiclasServices getEciBookServices() {
        return ciclasServices;
    }

    public void setEciBookServices(CiclasServices ciclasServices) {
        this.ciclasServices = ciclasServices;
    }



}
