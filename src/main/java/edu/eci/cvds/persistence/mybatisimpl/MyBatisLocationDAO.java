package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.persistence.LocationDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.LocationMapper;

public class MyBatisLocationDAO implements LocationDAO {

    @Inject
    private LocationMapper locationMapper;

}
