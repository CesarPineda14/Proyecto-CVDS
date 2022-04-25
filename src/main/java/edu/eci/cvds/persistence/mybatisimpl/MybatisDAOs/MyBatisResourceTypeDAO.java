package edu.eci.cvds.persistence.mybatisimpl.MybatisDAOs;

import com.google.inject.Inject;
import edu.eci.cvds.entities.ResourceType;
import edu.eci.cvds.persistence.mybatisimpl.DAOs.ResourceTypeDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ResourceTypeMapper;

public class MyBatisResourceTypeDAO implements ResourceTypeDAO {

    @Inject
    private ResourceTypeMapper resourceTypeMapper;


    @Override
    public ResourceType getResourceType() {
        try{
            return resourceTypeMapper.getResourceType();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
