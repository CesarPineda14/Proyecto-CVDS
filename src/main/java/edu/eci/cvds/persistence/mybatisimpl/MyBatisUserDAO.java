package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.User;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.UserDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.UserMapper;

public class MyBatisUserDAO implements UserDAO {

    @Inject
    //Injectar mapper
    private UserMapper userMapper;
    // Insert
    @Override
    public void save(User rs) throws PersistenceException {
        try {
            userMapper.createUser();
        }
        catch (Exception e){
        }
    }
    // Consulta
    @Override
    public User load() throws PersistenceException {
        try {
            return userMapper.getUser();
        }
        catch (Exception e){
            return null;
        }
    }


}
