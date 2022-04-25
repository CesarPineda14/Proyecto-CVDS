package edu.eci.cvds.persistence.mybatisimpl.DAOs;

import edu.eci.cvds.entities.User;
import edu.eci.cvds.persistence.PersistenceException;

public interface UserDAO {
    public void save(User rs) throws PersistenceException;

    public User load() throws PersistenceException;


}
