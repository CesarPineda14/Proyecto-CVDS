package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.entities.User;

import java.util.List;

public interface ResourceMapper {
    public Resource getResource();

    public void createResource(Resource resource);

    public List<Resource> getListResources();
}
