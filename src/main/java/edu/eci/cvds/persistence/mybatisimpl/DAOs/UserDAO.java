package edu.eci.cvds.persistence.mybatisimpl.DAOs;

import edu.eci.cvds.entities.User;
import edu.eci.cvds.persistence.ExceptionPersistence;

public interface UserDAO {
    public void save(User rs) throws ExceptionPersistence;

    public User load() throws ExceptionPersistence;


}
