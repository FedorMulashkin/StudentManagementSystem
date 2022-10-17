package ru.mulashkin.studentmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mulashkin.studentmanagementsystem.entity.Student;
import ru.mulashkin.studentmanagementsystem.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
