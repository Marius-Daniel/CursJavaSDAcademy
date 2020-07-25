package persistence.entities;

import javax.persistence.*;

@Entity
@Table(name="students")
@NamedQueries({
        @NamedQuery(name="findStudentByName",query="select student from Student student where student.name=:name"),
        @NamedQuery(name="findStudentByYearOfBirth",query="select student from Student student where student.yearOfBirth=:yearOfBirth"),
        @NamedQuery(name="deleteStudentByName",query="delete Student where name=:name"),
        @NamedQuery(name="deleteStudentByYearOfBirth",query="delete Student where yearOfBirth=:yearOfBirth")
})
public class Student {

    public Student(){

    }

    public Student(String name,String firstName,int yearOfBirth,String elective){
        this.name=name;
        this.firstName=firstName;
        this.yearOfBirth=yearOfBirth;
        this.elective=elective;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="first_name")
    private String firstName;
    @Column(name="year_of_birth")
    private int yearOfBirth;
    @Column(name="elective")
    private String elective;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getElectives() {
        return elective;
    }

    public void setElectives(String electives) {
        this.elective = elective;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", elective='" + elective  + '\'' +
                '}';
    }
}
