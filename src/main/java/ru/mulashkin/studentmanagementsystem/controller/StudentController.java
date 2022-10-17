package ru.mulashkin.studentmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.mulashkin.studentmanagementsystem.service.StudentService;

@Controller
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/students")
    public String getListStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
}
