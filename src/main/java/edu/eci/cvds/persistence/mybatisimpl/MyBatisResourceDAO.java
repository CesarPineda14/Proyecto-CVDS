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
    public void save(Resource resource) throws PersistenceException {
        try {
            System.out.println("aqui pasa");
            resourceMapper.createResource(resource);
        }
        catch (Exception e) {
        }
    }

    @Override
    public Resource load(long id) throws PersistenceException {
        try {
            //System.out.println("aqui pasa");
            return resourceMapper.getResource();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
