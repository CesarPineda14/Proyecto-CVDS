package edu.eci.cvds.services.impl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.entities.User;
import edu.eci.cvds.persistence.*;
import edu.eci.cvds.services.impl.ECIBookServices;
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
}
