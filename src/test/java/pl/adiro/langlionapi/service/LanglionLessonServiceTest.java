package pl.adiro.langlionapi.service;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LanglionLessonServiceTest {

    @Autowired
    WebDriverService webDriverService;

    @Test
    void isLoginSuccessful(){
        new LanglionLessonService(webDriverService);
    }
}
