package pl.adiro.langlionapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.adiro.langlionapi.model.lessons.Lesson;
import pl.adiro.langlionapi.model.lessons.Student;

@Repository
public interface LessonRepository extends CrudRepository<Lesson, Student> {
}
