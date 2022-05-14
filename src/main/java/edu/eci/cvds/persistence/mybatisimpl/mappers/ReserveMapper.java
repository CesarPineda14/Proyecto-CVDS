package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Reserve;

import java.util.List;

public interface ReserveMapper {
    public List<Reserve> getListReserves();

    public void createReserve(Reserve reserve);

    public void deleteReserve(Reserve reverse);
}
