import persistence.dao.StudentDAO;
import persistence.dao.TeachersDAO;
import persistence.entities.Student;
import persistence.entities.Teachers;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();
        TeachersDAO teachersDAO = new TeachersDAO();

        // inseram un student
        Student studentToInsert = new Student("Popescu", "Ionel", 1990, "informatica");

        studentDAO.insert(studentToInsert);

        //cautam un student dupa nume
        String name = "Popescu";
        List<Student> studentList = studentDAO.findStudentByName(name);
        System.out.println("Afisam studentii in functie de nume");
        for (Student student : studentList) {
            System.out.println(student);
        }

        //cautam un student dupa anul nasterii
        int yearOfBirth = 1990;
        List<Student> studentListByYear = studentDAO.findStudentByYearOfBirth(yearOfBirth);
        System.out.println("Afisam studentii in functie de anul nasterii");
        for (Student student : studentListByYear) {
            System.out.println(student);
        }

        //stergem un student in functie de nume
        studentDAO.deleteStudentByName(name);

        // stergem un student in functie de anul nasterii
        studentDAO.deleteStudentByYearOfBirth(1980);

        // introducem un profesor
        Teachers teacherToInsert = new Teachers("Ion", "Creanga", 65, "Romana",
                1, "Engleza", "yes");
        Teachers teacherToInsert2 = new Teachers("Vasile", "Blaga", 37, "Informatica",
                1, "Matematica", "yes");
        teachersDAO.insert(teacherToInsert);
        teachersDAO.insert(teacherToInsert2);

        // cautam profesot dupa nume
        List<Teachers> teachersList = teachersDAO.findTeacherByName("Ion");
        for (Teachers teachers : teachersList) {
            System.out.println(teachers);
        }

        // cautam profesor dupa varsta
        List<Teachers> teachersList1 = teachersDAO.findTeachersByAge(37);
        for (Teachers teachers : teachersList1) {
            System.out.println(teachers);
        }

        // stergem un profesor dupa nume
        teachersDAO.deleteTeachersByName("Ion");

        // stergem profesor
        teachersDAO.deleteTeachersByAge(37);
    }
}
