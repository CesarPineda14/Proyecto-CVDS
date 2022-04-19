package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.User;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.UserDAO;

public class MyBatisUserDAO implements UserDAO {

    @Inject
    //Injectar mapper

    @Override
    public void save(User rs) throws PersistenceException {

    }

    @Override
    public User load(long id) throws PersistenceException {
        return null;
    }
}
