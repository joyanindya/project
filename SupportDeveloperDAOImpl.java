package com.anindya.dao;

import com.anindya.entity.SupportDeveloper;
import com.anindya.util.HibernateSessionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by jcon928 on 6/18/2017.
 */
public class SupportDeveloperDAOImpl implements SupportDeveloperDAO{
    public boolean insertSupportDeveloperRecords(SupportDeveloper supportDeveloper) throws Exception {
        if(supportDeveloper == null){
            throw new RuntimeException("Support Developer is Not Defined or Support Developer is null");
        }
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(supportDeveloper);
        transaction.commit();
        // LOGGER.info(String.format("The Students Records Inserted Successfully  \n"));
        System.out.println("The Support Developer Records Inserted Successfully  \n");
        session.close();
        return true;
    }

    public List<SupportDeveloper> getAllSupportDeveloperRecords() throws Exception {
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(SupportDeveloper.class);
        List <SupportDeveloper> supportDeveloperList = criteria.list();
        transaction.commit();
        session.close();
        return supportDeveloperList;
    }

    public SupportDeveloper getSupportDeveloperRecordsByID(int supportDeveloperId) throws Exception {
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(SupportDeveloper.class);
        criteria.add(Restrictions.eq("SPDEV_ID",supportDeveloperId));
        SupportDeveloper supportDeveloperListById = (SupportDeveloper) criteria.list();
        transaction.commit();
        session.close();
        return supportDeveloperListById;
    }

    public boolean updateSupportDeveloperRecords(SupportDeveloper supportDeveloper) throws Exception {
        if(supportDeveloper == null){
            throw new RuntimeException("supportDeveloper is Not Defined or supportDeveloper is null");
        }
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(supportDeveloper);
        transaction.commit();
        //LOGGER.info(String.format("The Students Records Updated Successfully \n"));
        System.out.println("The supportDeveloper Records Updated Successfully \n");
        session.close();
        return true;
    }

    public boolean deleteSupportDeveloperRecords(int supportDeveloperId) throws Exception {
        if(supportDeveloperId == 0){
            throw new RuntimeException("supportDeveloper ID is not defined");
        }
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        SupportDeveloper supportDeveloper = (SupportDeveloper) session.load(SupportDeveloper.class, new Integer(supportDeveloperId));
        session.delete(supportDeveloper);
        transaction.commit();
        // LOGGER.info(String.format("The Students Records deleted Successfully \n"));
        System.out.println("TThe supportDeveloper Records deleted Successfully \n");
        session.close();
        return true;
    }
}
