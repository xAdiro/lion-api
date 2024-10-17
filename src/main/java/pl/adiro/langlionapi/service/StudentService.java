package pl.adiro.langlionapi.service;

import pl.adiro.langlionapi.model.lessons.Student;

import java.util.Optional;

public interface StudentService {
    Iterable<Student> findAll();
    Iterable<Student> findByName(String name);
    Iterable<Student> findByFullName(String name, String surname);

}
