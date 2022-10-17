package ru.mulashkin.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.mulashkin.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
