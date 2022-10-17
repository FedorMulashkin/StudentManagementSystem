package ru.mulashkin.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.mulashkin.studentmanagementsystem.entity.Student;
import ru.mulashkin.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentManagementSystemApplication(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Student student1 = new Student("Fedor", "Mulashkin", "fedor.mulashkin@gmail.com");
//        studentRepository.save(student1);
//        Student student2 = new Student("Tatyana", "Mulashkina", "tatyana.mulashkina@gmail.com");
//        studentRepository.save(student2);
//        Student student3 = new Student("Irina", "Vasilyeva", "irina.vasilyeva@gmail.com");
//        studentRepository.save(student3);
    }
}
