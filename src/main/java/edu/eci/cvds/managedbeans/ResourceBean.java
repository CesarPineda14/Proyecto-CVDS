package edu.eci.cvds.managedbeans;

import edu.eci.cvds.entities.*;
import edu.eci.cvds.services.impl.ECIBookServices;
import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="resourceBean")
@RequestScoped
public class ResourceBean extends BasePageBean{

    @Inject
    private ECIBookServices eciBookServices;

    public void createResource() throws Exception{
        try{
            //Uso de metodos en clase eciBookServices
        }
        catch (Exception exception){
            // cambiar cuando se implementen las excepciones
            // de servicesException
            throw exception;
        }
    }

    public User loadResource() throws Exception{
        try {
            return eciBookServices.getUser();
        }
        catch (Exception e){
            return null;
        }
    }
}
