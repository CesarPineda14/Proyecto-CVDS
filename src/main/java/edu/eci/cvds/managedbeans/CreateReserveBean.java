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

    private List<Resource> resourceList;
    private List<Reserve> reserveList;


    public CreateReserveBean() {

        try {
            //resourceTypeList = eciBookServices.getResourceType();
            resourceList = eciBookServices.getListResources();
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



}
