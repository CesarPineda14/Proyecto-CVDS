package edu.eci.cvds.managedbeans;

import edu.eci.cvds.entities.*;
import edu.eci.cvds.services.implementation.CiclasServices;
import javax.inject.Inject;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;
/*
@ManagedBean(name = "ReserveSearchBean")
@RequestScoped;
*/
public class ReserveSearchBean {

    @Inject
    private CiclasServices ciclasServices;
    public Reserve reserve;
    public List<Reserve> reserveList;

}
