package edu.eci.cvds.persistence.mybatisimpl.MybatisDAOs;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.DAOs.ResourceDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ResourceMapper;

import java.util.List;


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
            System.out.println(e.getMessage());
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

    @Override
    public List<Resource> loadListResources() {
        try{
            return resourceMapper.getListResources();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
