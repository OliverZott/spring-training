package org.velosaurus.hibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.velosaurus.hibernate.dao.StudentDAO;
import org.velosaurus.hibernate.entity.Student;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {

//            createStudent(studentDAO);
//            readStudent(studentDAO);
//            getAllByLastName(studentDAO, "VanBaum");
//            getAll(studentDAO);
            updateStudent(studentDAO);
        };
    }

    private void updateStudent(StudentDAO studentDAO) {
        int studentId = 8;

        Student student = studentDAO.findById(studentId);
        student.setFirstName("Olli");
        studentDAO.update(student);
        System.out.println(student);

    }

    private void getAll(StudentDAO studentDAO) {
        var students = studentDAO.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void createStudent(StudentDAO studentDAO) {

        System.out.println("Generating student object...");
        Student student = new Student("Jane", "Doe", "jd@mail.at");

        System.out.println("Saving student object...");
        studentDAO.save(student);

        System.out.println("Saved student with id: '" + student.getId() + "'");
    }

    private void readStudent(StudentDAO studentDAO) {
        System.out.println("Generating student object...");
        Student student = new Student("Sigi", "VanBaum", "svb@mail.com");

        System.out.println("Saving student object...");
        studentDAO.save(student);

        System.out.println("Retrieving student with id: '" + student.getId() + "'");
        Student retrievedStudent = studentDAO.findById(student.getId());
        System.out.println("Found student: " + retrievedStudent);
    }

    private void getAllByLastName(StudentDAO studentDAO, String lastName) {
        System.out.println("Finding all named: " + lastName);
        List<Student> students = studentDAO.findByLastName(lastName);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
