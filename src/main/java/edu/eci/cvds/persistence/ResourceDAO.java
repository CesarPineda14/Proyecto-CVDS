package edu.eci.cvds.persistence;


import edu.eci.cvds.entities.Resource;

public interface ResourceDAO {
    public Resource save(String codigo, String nombre, String ubicacion, String tipo, int capacidad) throws PersistenceException;

    public Resource load(long id) throws PersistenceException;

    //metodo para consultar recurso

    //metodo para insertar recurso

}
