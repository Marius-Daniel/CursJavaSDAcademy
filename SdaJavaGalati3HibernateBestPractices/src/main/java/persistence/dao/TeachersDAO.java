package persistence.dao;

import org.hibernate.Session;
import persistence.entities.Teachers;

import javax.persistence.Query;
import java.util.List;

public class TeachersDAO {

    public void insert(Teachers teachers){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(teachers);
        session.getTransaction().commit();
        session.close();
    }

    public List<Teachers> findTeacherByName(String name){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query findTeacherByNameQuery = session.createNamedQuery("findTeacherByName");
        findTeacherByNameQuery.setParameter("name",name);
        List<Teachers> teachersList = findTeacherByNameQuery.getResultList();
        session.getTransaction().commit();
        session.close();
        return  teachersList;
    }

    public  List<Teachers> findTeachersByAge(int age){
        Session session =HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query findTeachersByAgeQuery = session.createNamedQuery("findTeachersByAge");
        findTeachersByAgeQuery.setParameter("age", age);
        List<Teachers> teacherList = findTeachersByAgeQuery.getResultList();
        session.getTransaction().commit();
        return  teacherList;
    }

    public void deleteTeachersByName(String name){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query deleteTeachersByNameQuery = session.createNamedQuery("deleteTeachersByName");
        deleteTeachersByNameQuery.setParameter("name", name);
        int reslt = deleteTeachersByNameQuery.executeUpdate();
        session.getTransaction().commit();
    }

    public void deleteTeachersByAge(int age){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query deleteTeachersByAgeQuery = session.createNamedQuery("deleteTeachersByAge");
        deleteTeachersByAgeQuery.setParameter("age", age);
        int result = deleteTeachersByAgeQuery.executeUpdate();
        session.getTransaction().commit();
        System.out.println(result);
    }
}
