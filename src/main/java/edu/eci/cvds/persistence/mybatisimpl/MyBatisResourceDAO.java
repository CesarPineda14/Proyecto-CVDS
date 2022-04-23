package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.ResourceDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ResourceMapper;


public class MyBatisResourceDAO implements ResourceDAO{

    @Inject
    private ResourceMapper resourceMapper;

    @Override
    public Resource save(String codigo, String nombre, String ubicacion, String tipo, int capacidad) throws PersistenceException {
        try {
            return resourceMapper.createResource(codigo, nombre, ubicacion, tipo, capacidad);
        }
        catch (Exception e) {
            return null;
        }
    }

    @Override
    public Resource load(long id) throws PersistenceException {
        try {
            return resourceMapper.getResource();
        }
        catch (Exception e){
            return null;
        }
    }
}
