package edu.eci.cvds.guice;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import edu.eci.cvds.persistence.LocationDAO;
import edu.eci.cvds.persistence.ResourceDAO;
import edu.eci.cvds.persistence.ResourceTypeDAO;
import edu.eci.cvds.persistence.UserDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisLocationDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisResourceDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisResourceTypeDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisUserDAO;
import edu.eci.cvds.services.impl.ECIBookServices;
import edu.eci.cvds.services.impl.ECIBookServicesImpl;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.removeAttribute(Injector.class.getName());
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		Injector injector = Guice.createInjector(new XMLMyBatisModule() {
			@Override
			protected void initialize() {

				install(JdbcHelper.PostgreSQL);

				setEnvironmentId("development");

				setClassPathResource("mybatis-config.xml");

				//Inyeccion implementacion servicios
				bind(ECIBookServices.class).to(ECIBookServicesImpl.class);
				//Inyeccion DAOS
				bind(UserDAO.class).to(MyBatisUserDAO.class);
				bind(ResourceDAO.class).to(MyBatisResourceDAO.class);
				bind(ResourceTypeDAO.class).to(MyBatisResourceTypeDAO.class);
				bind(LocationDAO.class).to(MyBatisLocationDAO.class);

			}
		}

		);

		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.setAttribute(Injector.class.getName(), injector);
	}

}