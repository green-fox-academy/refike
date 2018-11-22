package GreenFoxOrganization;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    String name;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
        this.mentors = new ArrayList<Mentor>();
    }

    public void addStudent (Student student) {
        students.add(student);
    }

    public void addMentor (Mentor mentor) {
        mentors.add(mentor);
    }

    public void info () {
        System.out.println("The "+ name + " cohort has " + students.size()+ " students and " + mentors.size() +" mentors.");
    }
}
