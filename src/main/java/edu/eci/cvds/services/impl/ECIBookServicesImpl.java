package edu.eci.cvds.services.impl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.*;
import edu.eci.cvds.persistence.mybatisimpl.DAOs.*;
import edu.eci.cvds.services.ServicesException;

/**
 * Implementación de {@link ECIBookServices}
 */
public class ECIBookServicesImpl implements ECIBookServices {

	@Inject
	private UserDAO userDAO;

	@Inject
	private ResourceDAO resourceDAO;

	@Inject
	private ResourceTypeDAO resourceTypeDAO;

	@Inject
	private LocationDAO locationDAO;

	@Inject
	private ReserveDAO reserveDAO;


	@Override
	public User getUser() throws ServicesException {
		try{
			return userDAO.load();
		}
		catch (Exception e){
			return null;
		}
	}

	@Override
	public void createUser() throws ServicesException {

	}

	@Override
	public Resource getResource() throws ServicesException {
		try {
			return resourceDAO.load(1);
		}catch (Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Resource> getListResources() throws ServicesException {
		try{
			return resourceDAO.loadListResources();
		}
		catch (Exception e){
			System.out.println();
			return null;
		}
	}

	@Override
	public void createResource(Resource resource) throws ServicesException{
		try {
			resourceDAO.save(resource);
			System.out.println("recurso agregado");
			System.out.println(resource);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<ResourceType> getResourceType() throws ServicesException {
		try{
			return resourceTypeDAO.getResourceType();
		}catch (Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Location> getLocation() throws ServicesException {
		try{
			return locationDAO.getLocation();
		} catch (Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Reserve> getListReserve() throws ServicesException {
		try {
			return reserveDAO.getListReserves();
		} catch (Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public void createReserve(Reserve reserve) throws ServicesException {
		try {
			reserveDAO.createReserve(reserve);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateResource(Resource resource) throws ServicesException {
		try{
			resourceDAO.updateResource(resource);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Resource> searchResourceType(Integer tipo) throws ServicesException {
		try{
			System.out.println("pasaaaaaaaaaa");
			return resourceDAO.searchResourceType(tipo);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Resource> searchResourceCapacity(Integer capacidad) throws ServicesException {
		try{
			return resourceDAO.searchResourceCapacity(capacidad);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Resource> searchResourceLocation(Integer ubicacion) throws ServicesException {
		try{
			return resourceDAO.searchResourcelocation(ubicacion);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}
}
