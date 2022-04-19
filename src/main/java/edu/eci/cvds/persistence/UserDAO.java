package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.User;

public interface UserDAO {
    public void save(User rs) throws PersistenceException;

    public User load() throws PersistenceException;

    //metodo para consultar recurso

    //metodo para insertar recurso

}
