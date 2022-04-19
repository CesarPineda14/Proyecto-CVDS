package edu.eci.cvds.persistence.mybatisimpl;

import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.ResourceDAO;

public class MyBatisResourceDAO implements ResourceDAO {

    @Override
    public void save(Resource rs) throws PersistenceException {

    }

    @Override
    public Resource load(long id) throws PersistenceException {
        return null;
    }
}
