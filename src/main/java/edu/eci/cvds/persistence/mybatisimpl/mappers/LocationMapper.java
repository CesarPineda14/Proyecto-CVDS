package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Location;

import java.util.List;

public interface LocationMapper {
    public List<Location> getLocationList();
}
