package pl.adiro.langlionapi.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.adiro.langlionapi.model.lessons.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class LanglionStudentService implements StudentService {
    private final WebDriver driver;
    private final Wait<WebDriver> wait;
    private final String LESSONS_URL = "https://champions.langlion.com/new_lesson_teacher";

    @Autowired
    public LanglionStudentService(WebDriverService webDriverService) {
        driver = webDriverService.getDriver();
        wait = webDriverService.getWait();
    }

    @Override
    public Iterable<Student> findAll() {
        driver.get(LESSONS_URL);
        var addLessonButt = driver.findElement(By.id("add-lesson"));
        wait.until(ExpectedConditions.elementToBeClickable(addLessonButt));

        addLessonButt.click();
        var addLessonHeader = driver.findElement(By.id("wizard_header"));
        wait.until(ExpectedConditions.elementToBeClickable(addLessonHeader));

        var studentFormOptions = driver.findElements(By.xpath("//select[@id='school_class_subject_id']/option"));

        List<Student> students = new LinkedList<>();
        for (var studentOption : studentFormOptions) {
            String studentText = studentOption.getAttribute("textContent");
            if (studentText.isBlank()) continue;
            Student newStudent = studentFromText(studentText);
            newStudent.setId(Integer.parseInt(studentOption.getAttribute("value")));
            students.add(newStudent);
        }
        return students;
    }

    @Override
    public Iterable<Student> findByName(String name) {
        return null;
    }

    @Override
    public Iterable<Student> findByFullName(String name, String surname) {
        return null;
    }

    private Student studentFromText(String text) {

        text = text.trim().replace("Ind - ", "");
        text = text.replace("\\[[a-zA-Z ]+\\]", "").trim();
        String[] textValues = text.split(" ");

        String name = textValues[0];
        String surname = textValues[1];
        String educationSubjectText = textValues[2]
                .replace("(", "")
                .replace(")", "");

        return Student.builder()
                .name(name)
                .surname(surname)
                .subject(educationSubjectText)
                .build();
    }
}
