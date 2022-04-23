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
    public Resource resource;
    public String nombre;
    public String ubicacion;
    public String tipo;
    public int capacidad;
    public String codigo;

    public Resource save( String _nombre, String _ubicacion, String _tipo, int _capacidad,String idinterno) throws Exception{
        try{
            //Uso de metodos en clase eciBookServices
            //resource = eciBookServices.createResource(_nombre, _ubicacion, _tipo, _capacidad, idinterno);
            codigo = resource.getCodigo();
            nombre = resource.getNombre();
            ubicacion = resource.getUbicacion();
            tipo = resource.getTipo();
            //capacidad = resource.getCapacidad();
            return resource;

        }
        catch (Exception e){
            // cambiar cuando se implementen las excepciones
            // de servicesException
            return null;
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
