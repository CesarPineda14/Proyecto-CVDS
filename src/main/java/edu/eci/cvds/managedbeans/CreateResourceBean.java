package edu.eci.cvds.managedbeans;


import com.google.inject.Inject;
import edu.eci.cvds.services.impl.ECIBookServices;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="createResource")
@RequestScoped
public class CreateResourceBean {
    @Inject
    private ECIBookServices eciBookServices;
    private String selectedOption;

    public CreateResourceBean() {
        
    }

    public void createResource(){

    }

}
