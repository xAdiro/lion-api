package pl.adiro.langlionapi.repository;

import pl.adiro.langlionapi.model.lessons.Student;

import java.util.Collections;
import java.util.Optional;

public class LanglionStudentRepository implements StudentRepository{
    @Override
    public <S extends Student> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Student> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Student> findById(String fullName) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String fullName) {
        return false;
    }

    @Override
    public Iterable<Student> findAll() {
        return Collections.emptyList();
    }

    @Override
    public Iterable<Student> findAllById(Iterable<String> fullNames) {
        return Collections.emptyList();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String fullName) {

    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> fullNames) {

    }

    @Override
    public void deleteAll(Iterable<? extends Student> students) {

    }

    @Override
    public void deleteAll() {

    }
}
