package edu.eci.cvds.persistence.mybatisimpl.MybatisDAOs;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Location;
import edu.eci.cvds.persistence.mybatisimpl.DAOs.LocationDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.LocationMapper;

public class MyBatisLocationDAO implements LocationDAO {

    @Inject
    private LocationMapper locationMapper;

    @Override
    public Location getLocation() {
        return locationMapper.getLocation();
    }
}
