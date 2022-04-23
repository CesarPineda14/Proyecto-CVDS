package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.entities.User;

public interface ResourceMapper {
    public Resource getResource();

    public Resource createResource(String codigo, String nombre, String ubicacion, String tipo, int capacidad);
}
