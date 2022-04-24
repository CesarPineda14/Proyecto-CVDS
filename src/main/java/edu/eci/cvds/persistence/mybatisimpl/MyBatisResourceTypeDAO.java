package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.persistence.ResourceDAO;
import edu.eci.cvds.persistence.ResourceTypeDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ResourceTypeMapper;

public class MyBatisResourceTypeDAO implements ResourceTypeDAO {

    @Inject
    private ResourceTypeMapper resourceTypeMapper;
}
