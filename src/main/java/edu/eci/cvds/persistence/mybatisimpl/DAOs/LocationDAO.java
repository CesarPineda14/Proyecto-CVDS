package edu.eci.cvds.persistence.mybatisimpl.DAOs;

import edu.eci.cvds.entities.Location;

import java.util.List;

public interface LocationDAO {
    public List<Location> getLocation();
}
