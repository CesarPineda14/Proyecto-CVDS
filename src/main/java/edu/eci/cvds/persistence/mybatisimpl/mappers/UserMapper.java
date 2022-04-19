package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.User;

public interface UserMapper {
    public User getUser();

    public void createUser();
}
