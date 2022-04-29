package edu.eci.cvds.persistence.mybatisimpl.DAOs;

import edu.eci.cvds.entities.Reserve;

import java.util.List;

public interface ReserveDAO {

    public List<Reserve> getListReserves();

    public void createReserve(Reserve reserve);
}
