package institution;

import person.Student;

import java.util.LinkedList;
import java.util.List;

public class University {
    private String name;
    private List<Student> studentList = new LinkedList<>();

    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
