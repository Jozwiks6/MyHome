package pl.camp.it.myhome.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.camp.it.myhome.dao.IAdminDAO;
import pl.camp.it.myhome.model.Admin;

import javax.persistence.NoResultException;

@Repository
public class AdminDAOImpl implements IAdminDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Admin getAdminByLogin(String login) {
        try{
            Session session = sessionFactory.openSession();
            Query<Admin> query = session.createQuery("FROM pl.camp.it.myhome.model.Admin WHERE login = :login");
            query.setParameter("login", login);


            Admin admin = query.getSingleResult();
            session.close();
            return admin;
        } catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void addAdmin(Admin admin) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.save(admin);
            tx.commit();
        } catch (Exception e){
            if (tx != null){
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }
}
