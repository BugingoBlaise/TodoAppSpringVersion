package org.example.dao;

import org.example.entity.User;
 import org.hibernate.Session;
import org.postgresql.core.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class UserDao extends GenericDao<User> {

   /* public static User findByEmail(String email) {
        Session ses= HibernateUtil.getSessionFactory().openSession();
        Query que=ses.createQuery("FROM User b WHERE b.email= :v ");
        que.setString("v", email);
        List list=que.list();
        if(list.size() > 0) {
            ses.close();
            return (User) list.get(0);
        }
        return null;
    }*/
}
