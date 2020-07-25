package persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "teachers")
@NamedQueries({
        @NamedQuery(name="findTeacherByName",query="select teachers from Teachers teachers where teachers.name=:name"),
        @NamedQuery(name="findTeachersByAge",query="select teachers from Teachers teachers where teachers.age=:age"),
        @NamedQuery(name="deleteTeachersByName",query="delete Teachers where name=:name"),
        @NamedQuery(name="deleteTeachersByAge",query="delete Teachers where age=:age")
})

public class Teachers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name ="age")
    private int age;

    @Column(name ="subject")
    private String subject;

    @Column(name ="tenure")
    private int tenure;

    @Column(name = "secondary_subject")
    private String secondary;

    @Column(name = "group_master")
    private String group_master;

    public Teachers(String name, String surname, int age, String subject, int tenure, String secondary, String group_master) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.subject = subject;
        this.tenure = tenure;
        this.secondary = secondary;
        this.group_master = group_master;
    }

    public Teachers() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public String getSecondary() {
        return secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public String getGroup_master() {
        return group_master;
    }

    public void setGroup_master(String group_master) {
        this.group_master = group_master;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", tenure=" + tenure +
                ", secondary='" + secondary + '\'' +
                ", group_master='" + group_master + '\'' +
                '}';
    }
}
