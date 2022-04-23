package edu.eci.cvds.persistence;


import edu.eci.cvds.entities.Resource;

public interface ResourceDAO {
    public void save(Resource resource) throws PersistenceException;

    public Resource load(long id) throws PersistenceException;

    //metodo para consultar recurso

    //metodo para insertar recurso

}
