package edu.eci.cvds.persistence.mybatisimpl.DAOs;


import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.persistence.PersistenceException;

import java.util.List;

public interface ResourceDAO {
    public void save(Resource resource) throws PersistenceException;

    public Resource load(long id) throws PersistenceException;

    public List<Resource> loadListResources();

    public void updateResource(Resource resource);

    public List<Resource> searchResourceType(Integer tipo);

    public List<Resource> searchResourceCapacity(Integer capacidad);

    public List<Resource> searchResourcelocation(Integer ubicacion);
}

    //metodo para consultar recurso

    //metodo para insertar recurso


