package edu.eci.cvds.services.impl;

import edu.eci.cvds.entities.Location;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.entities.ResourceType;
import edu.eci.cvds.entities.User;
import edu.eci.cvds.services.ServicesException;

import java.util.List;

public interface ECIBookServices {

    public User getUser() throws ServicesException;

    public void createUser() throws ServicesException;

    public Resource getResource() throws ServicesException;

    public List<Resource> getListResources() throws ServicesException;

    public void createResource(Resource resource) throws ServicesException;

    public ResourceType getResourceType() throws ServicesException;

    public Location getLocation() throws ServicesException;
}
