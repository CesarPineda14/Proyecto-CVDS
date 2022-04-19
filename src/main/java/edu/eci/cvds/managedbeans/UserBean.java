package edu.eci.cvds.managedbeans;

import edu.eci.cvds.services.ServicesException;
import edu.eci.cvds.services.impl.ECIBookServices;
import edu.eci.cvds.services.impl.ECIBookServicesImpl;

import javax.inject.Inject;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="userBean")
@RequestScoped
public class UserBean extends BasePageBean{
    private String email;
    private String password;

    @Inject
    private ECIBookServices eciBookServices;

    public void createUser() throws Exception{
        try{
            //Uso de metodos en clase eciBookServices
        }
        catch (Exception exception){
            // cambiar cuando se implementen las excepciones
            // de servicesException
            throw exception;
        }
    }
    public void signIn() throws Exception{
        try{
            ////Uso de metodos en clase eciBookServices
        }
        catch (Exception e){

        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
