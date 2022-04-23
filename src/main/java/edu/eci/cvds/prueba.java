package edu.eci.cvds;
import com.google.inject.Injector;
import edu.eci.cvds.entities.Resource;
import edu.eci.cvds.persistence.ResourceDAO;
import edu.eci.cvds.persistence.UserDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisResourceDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisUserDAO;
import edu.eci.cvds.services.ServicesException;
import edu.eci.cvds.services.impl.ECIBookServices;
import edu.eci.cvds.services.impl.ECIBookServicesImpl;
import org.mybatis.guice.XMLMyBatisModule;

import java.util.Optional;

import static com.google.inject.Guice.createInjector;

public class prueba {

    private static prueba instance = new prueba();

    private static Optional<Injector> optInjector;

    private Injector myBatisInjector(String env, String pathResource) {
        return createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                setEnvironmentId(env);
                setClassPathResource(pathResource);
                bind(UserDAO.class).to(MyBatisUserDAO.class);
                bind(ResourceDAO.class).to(MyBatisResourceDAO.class);
                bind(ECIBookServices.class).to(ECIBookServicesImpl.class);
            }
        });
    }

    private prueba(){
        optInjector = Optional.empty();
    }

    public ECIBookServices getServiciosAlquiler(){
        if (!optInjector.isPresent()) {
            optInjector = Optional.of(myBatisInjector("development","mybatis-config.xml"));
        }

        return optInjector.get().getInstance(ECIBookServices.class);
    }


    public ECIBookServices getServiciosAlquilerTesting(){
        if (!optInjector.isPresent()) {
            optInjector = Optional.of(myBatisInjector("test","mybatis-config-h2.xml"));
        }

        return optInjector.get().getInstance(ECIBookServices.class);
    }
    public Resource createResource(){
        Resource resource = new Resource(
                "0003",
                "Edificio I",
                "Sala de estudio", "drgdfgd"
        );
        return  resource;
    }

    public static prueba getInstance(){
        return instance;
    }

    public static void main(String[] args) throws ServicesException {
        System.out.println("-------------------------------- CONSULAR CLIENTES --------------------------------");
        System.out.println(instance.getServiciosAlquiler().getUser().getApellidos());
        System.out.println(instance.getServiciosAlquiler().getUser().getNombres());

        System.out.println("------------------CONSULTAR RECURSO ----------------------------------------");

        Resource resource = getInstance().createResource();
        instance.getServiciosAlquiler().createResource(resource);
        System.out.println(instance.getServiciosAlquiler().getResource().getNombre());

        //System.out.println(instance.getServiciosAlquiler().getResource());
        // Funcionaaaaaaaaa el select
        //al menos algo, no esta solicitando el recurso
        long documento = 10999900099L;
        /*
        System.out.println("---------------------------------- CONSULAR CLIENTE " + documento + " ------------------------------------");
        System.out.println(instance.getServiciosAlquiler().consultarCliente(documento).toString());
        System.out.println("----------------------------- CONSULAR ITEMS DEL CLIENTE " + documento +" -----------------------------");
        System.out.println(instance.getServiciosAlquiler().consultarItemsCliente(10999900099L).toString());*/
    }

//        public static void main(String[] args) throws PersistenceException {
//          ECIBookServices instance
////        System.out.println(instance.consultarCliente(2165711).toString());
////        System.out.println(instance.consultarRecursos());
//            for(Recurso r: instance.consultarRecursos()){
//                System.out.println(r.toString());
//            }
//
//        }
//    }
}