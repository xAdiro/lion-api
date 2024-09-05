package pl.adiro.langlionapi.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.adiro.langlionapi.model.lessons.Lesson;
import pl.adiro.langlionapi.model.lessons.Student;

import java.time.Duration;

@Service
public class LanglionLessonService implements LessonService{

    private final WebDriver driver;
    private final Wait<WebDriver> wait;

    @Autowired
    public LanglionLessonService(WebDriver driver,CredentialsService credentialsService){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        logIn(credentialsService);
    }

    @Override
    public Iterable<Lesson> findAll() {
        driver.get("https://champions.langlion.com/new_lesson_teacher");
        return null;
    }

    @Override
    public Iterable<Lesson> findAllBy(Student student) {
        return null;
    }

    @Override
    public Lesson save(Lesson lesson) {
        return null;
    }

    @Override
    public void delete(Lesson lesson) {

    }

    private void logIn(CredentialsService credentialsService){
        driver.get("https://champions.langlion.com/");

        WebElement loginField = driver.findElement(By.id("login"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButt = driver.findElement(By.xpath(
                "//form[@id='form_login']//a[contains(@class,'btn-primary')]")
        );

        loginField.sendKeys(credentialsService.getLogin());
        passwordField.sendKeys(credentialsService.getPassword());
        submitButt.click();

        var calendarElementIdentifier = By.id("menu-calendar");
        wait.until(ExpectedConditions.elementToBeClickable(calendarElementIdentifier));
    }
}
