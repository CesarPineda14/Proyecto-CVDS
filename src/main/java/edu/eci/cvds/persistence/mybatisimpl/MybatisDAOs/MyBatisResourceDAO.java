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
    public List<Resource> loadListResources() {
        try{
            return resourceMapper.getListResources();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void updateResource(Resource resource){
        try{

            if (resource.getEstado().equals("Activo")) {
                resource.setEstado("Inactivo");
            }
            else if (resource.getEstado().equals("Inactivo")){
                //System.out.println("entra");
                resource.setEstado("Activo");}
            resourceMapper.updateResource(resource);
            System.out.println("pasa por aca");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
