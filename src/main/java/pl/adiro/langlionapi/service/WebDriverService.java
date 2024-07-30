package pl.adiro.langlionapi.service;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Service;

@Service
public interface WebDriverService {
     WebDriver getWebDriver();
}
