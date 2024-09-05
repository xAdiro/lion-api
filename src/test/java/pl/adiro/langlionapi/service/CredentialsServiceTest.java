package pl.adiro.langlionapi.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CredentialsServiceTest {
    @Autowired
    private CredentialsService credentialsService;

    @Test
    void IsLoginNotEmpty(){
        var login = Optional.ofNullable(credentialsService.getLogin());

        assertTrue(login.isPresent());
        assertFalse(login.get().isBlank());
    }

    @Test
    void IsPasswordNotEmpty(){
        var password = Optional.ofNullable(credentialsService.getPassword());

        assertTrue(password.isPresent());
        assertFalse(password.get().isBlank());
    }
}