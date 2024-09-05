package pl.adiro.langlionapi.service;

import pl.adiro.langlionapi.model.lessons.Lesson;
import pl.adiro.langlionapi.model.lessons.Student;


public interface LessonService {
    Iterable<Lesson> findAll();
    Iterable<Lesson> findAllBy(Student student);
    Lesson save(Lesson lesson);
    void delete(Lesson lesson);
}
