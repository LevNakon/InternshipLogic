package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

import java.sql.*;

public class Application {
    public static void main(String[] args) throws SQLException {
        /*String url = "jdbc:mysql://127.0.0.1:3306/students";
        String login = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url,login,password);
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student");
        ResultSet resultSet = preparedStatement.executeQuery();*/
        //You can take students from DB

        University university = new University("CH.U.I.");
        Student student1 = new Student("Andrew Kostenko");
        student1.setKnowledge(new Knowledge(13));
        Student student2 = new Student("Julia Veselkina");
        student2.setKnowledge(new Knowledge(15));
        Student student3 = new Student("Maria Perechrest");
        student3.setKnowledge(new Knowledge(17));
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        Internship internship = new Internship("Interlink");
        internship.setStudent(university);
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
