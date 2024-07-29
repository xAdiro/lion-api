package pl.adiro.langlionapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.adiro.langlionapi.model.lessons.Student;

@RestController
public class LessonController {

    @GetMapping("/students")
    public Iterable<Student> getStudents(){
        return null;
    }
}
