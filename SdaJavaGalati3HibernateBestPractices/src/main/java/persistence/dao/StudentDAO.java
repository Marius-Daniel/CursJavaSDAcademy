package persistence.dao;

import org.hibernate.Session;
import persistence.entities.Student;

import javax.persistence.Query;
import java.util.List;

public class StudentDAO {

    public void insert(Student student) {
        // aici vom insera un student
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

    public List<Student> findStudentByName(String name) {
        //aici vom cauta un student dupa nume
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query findStudentByNameQuery = session.createNamedQuery("findStudentByName");
        findStudentByNameQuery.setParameter("name", name);
        List<Student> studentList = findStudentByNameQuery.getResultList();
        session.getTransaction().commit();
        session.close();
        return studentList;
    }

    public List<Student> findStudentByYearOfBirth(int yearOfBirth) {
        //aici vom cauta un student dupa anul nasterii
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query findStudentByYearOfBirthQuery = session.createNamedQuery("findStudentByYearOfBirth");
        findStudentByYearOfBirthQuery.setParameter("yearOfBirth", yearOfBirth);
        List<Student> studentList = findStudentByYearOfBirthQuery.getResultList();
        session.getTransaction().commit();
        session.close();
        return studentList;
    }

    public void deleteStudentByName(String name) {
        //aici vom sterge un student in functie de nume
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query deleteStudentByNameQuery = session.createNamedQuery("deleteStudentByName");
        deleteStudentByNameQuery.setParameter("name", name);
        int result = deleteStudentByNameQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println(result);
    }

    public void deleteStudentByYearOfBirth(int yearOfBirth) {
        //stergem un student in functie de anul nasterii
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query deleteStudentByYearOfBirthQuery = session.createNamedQuery("deleteStudentByYearOfBirth");
        deleteStudentByYearOfBirthQuery.setParameter("yearOfBirth",yearOfBirth);
        int resutl = deleteStudentByYearOfBirthQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println(resutl);
    }
}
