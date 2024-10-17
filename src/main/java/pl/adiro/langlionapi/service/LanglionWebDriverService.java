package pl.adiro.langlionapi.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
public class LanglionWebDriverService implements WebDriverService {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    @Autowired
    public void LanglionStudentService(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }

    @Override
    public Wait<WebDriver> getWait() {
        return wait;
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
