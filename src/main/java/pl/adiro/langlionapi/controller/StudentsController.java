package pl.adiro.langlionapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.adiro.langlionapi.model.lessons.Student;
import pl.adiro.langlionapi.service.StudentService;

@RestController
public class StudentsController {
    private StudentService studentService;

    @Autowired
    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/v1/students")
    Iterable<Student> getAllStudents() {
        return studentService.findAll();
    }
}
