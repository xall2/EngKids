/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engkids_adproproject;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author randah
 */
public class HibernateUtil1 {

    private static final SessionFactory sessionFactory1;
    
    static {
        try {
             // loads configuration and mappings
            Configuration configuration = new Configuration().configure("/engkids_adproproject/hibernate1.cfg.xml");
            ServiceRegistry serviceRegistry= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
             configuration.addAnnotatedClass(score.class);
            // builds a session factory from the service registry
            sessionFactory1 = configuration.buildSessionFactory(serviceRegistry);  
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory1;
    }
}
