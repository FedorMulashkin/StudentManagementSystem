package ru.mulashkin.studentmanagementsystem.service;

import ru.mulashkin.studentmanagementsystem.entity.Student;

import java.util.*;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
