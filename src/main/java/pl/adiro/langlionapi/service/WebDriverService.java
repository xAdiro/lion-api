package pl.adiro.langlionapi.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public interface WebDriverService {
    WebDriver getDriver();
    Wait<WebDriver> getWait();
}
