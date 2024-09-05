package pl.adiro.langlionapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.adiro.langlionapi.model.lessons.Student;
import pl.adiro.langlionapi.service.LessonService;

@RestController
public class LessonController {

    private LessonService lessonService;

    public LessonController(){}

    @Autowired
    public LessonController(LessonService lessonService){
        this.lessonService = lessonService;
    }

    @GetMapping("/students")
    public Iterable<Student> getStudents(){
        return null;
    }
}
