package edu.eci.cvds.security;

import edu.eci.cvds.services.ExceptionServices;

public interface SessionLogger {

    public void login(String nombre, String clave) throws ExceptionServices;

    public boolean isLogged() throws ExceptionServices;

    public void logout() throws ExceptionServices;
}