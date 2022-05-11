package edu.eci.cvds.services.impl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.*;
import edu.eci.cvds.persistence.ExceptionReport.ReportFile;
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
	public List<Resource> getListResources() throws ServicesException {
		try{
			return resourceDAO.loadListResources();
		}
		catch (Exception e){
			return null;
		}
	}

	@Override
	public void createResource(Resource resource) throws ServicesException{
		try {
			resourceDAO.save(resource);
			ReportFile.loadReport("Recurso agregado");
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
			ReportFile.loadReport(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Location> getLocation() throws ServicesException {
		try{
			return locationDAO.getLocation();
		} catch (Exception e){
			ReportFile.loadReport(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Reserve> getListReserve() throws ServicesException {
		try {
			return reserveDAO.getListReserves();
		} catch (Exception e){
			System.out.println(e.getMessage());
			ReportFile.loadReport(e.getMessage());
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
			ReportFile.loadReport(e.getMessage());
		}
	}

	@Override
	public void updateResource(Resource resource) throws ServicesException {
		try{
			resourceDAO.updateResource(resource);
			ReportFile.loadReport(resource.getEstado());
		}
		catch (Exception e){
			ReportFile.loadReport(e.getMessage());
		}
	}
}
