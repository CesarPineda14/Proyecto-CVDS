package edu.eci.cvds.services.impl;

import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.entities.User;
import edu.eci.cvds.services.ServicesException;

public interface ECIBookServices {

    public User getUser() throws ServicesException;

    public void createUser() throws ServicesException;

    public Resource getResource() throws ServicesException;

    public Resource createResource(String codigo, String nombre, String ubicacion, String tipo, int capacidad) throws ServicesException;

}
