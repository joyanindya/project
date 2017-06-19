package com.anindya.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by jcon928 on 5/30/2017.
 */
public class HibernateSessionFactory {

    static SessionFactory sessionFactory = null;
    public static SessionFactory createSessionFactory() throws Exception {

        if(sessionFactory == null)
            sessionFactory = new Configuration().configure().buildSessionFactory();

        return sessionFactory;
    }


}
