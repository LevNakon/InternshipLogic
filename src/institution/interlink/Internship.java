package institution.interlink;

import institution.University;
import person.Student;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Internship {
    private String name;
    private University university;
    private Set<Student> list_of_students = new HashSet<>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(University university) {
        List<Student> studentList = university.getStudentList();
        double sum = 0;
        double iter = 0;
        for (Student student : studentList) {
            sum += student.getKnowledge();
            iter += 1;
        }
        for (Student student : studentList) {
            if(student.getKnowledge() >= sum/iter){
                list_of_students.add(student);
            }
        }
    }

    public String getStudents() {
        return list_of_students.toString();
    }
}
