package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.ResourceType;

import java.util.List;

public interface ResourceTypeMapper {
    public List<ResourceType> getResourceTypeList();
}
