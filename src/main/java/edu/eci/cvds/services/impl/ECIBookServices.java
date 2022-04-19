package edu.eci.cvds.services.impl;

import edu.eci.cvds.entities.User;
import edu.eci.cvds.services.ServicesException;

public interface ECIBookServices {

    public User getUser() throws ServicesException;

    public void createUser() throws ServicesException;

}
