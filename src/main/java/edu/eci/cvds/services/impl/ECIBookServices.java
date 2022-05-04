package edu.eci.cvds.services.impl;

import edu.eci.cvds.entities.*;
import edu.eci.cvds.services.ServicesException;

import java.util.List;

public interface ECIBookServices {

    public User getUser() throws ServicesException;

    public void createUser() throws ServicesException;

    public Resource getResource() throws ServicesException;

    public List<Resource> getListResources() throws ServicesException;

    public void createResource(Resource resource) throws ServicesException;

    public List<ResourceType> getResourceType() throws ServicesException;

    public List<Location> getLocation() throws ServicesException;

    public List<Reserve> getListReserve() throws ServicesException;

    public void createReserve(Reserve reserve) throws ServicesException;

    public void updateResource(Resource resource) throws ServicesException;

    public List<Resource> searchResourceType(String tipo) throws ServicesException;

    public List<Resource> searchResourceCapacity(String capacidad) throws ServicesException;

    public List<Resource> searchResourceLocation(String ubicacion) throws ServicesException;
}
