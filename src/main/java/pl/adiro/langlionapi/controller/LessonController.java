package pl.adiro.langlionapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.adiro.langlionapi.model.lessons.Student;
import pl.adiro.langlionapi.repository.StudentRepository;

@RestController
public class LessonController {

    @GetMapping("/students")
    public Iterable<Student> getStudents(StudentRepository studentRepository){
        return studentRepository.findAll();
    }
}
