package edu.eci.cvds.persistence.mybatisimpl.DAOs;

import edu.eci.cvds.entities.Reserve;

import java.util.List;

public interface ReserveDAO {

    public List<Reserve> getListReserves();

    public List<Reserve> getListReserves1();

    public void createReserve(Reserve reserve);

    public void deleteReserve(Reserve reserve);
}
