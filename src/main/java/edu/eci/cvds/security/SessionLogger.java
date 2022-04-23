package edu.eci.cvds.security;

import edu.eci.cvds.services.ServicesException;

public interface SessionLogger {

    public void login(String nombre, String clave) throws ServicesException;

    public boolean isLogged() throws ServicesException;

    public void logout() throws ServicesException;
}