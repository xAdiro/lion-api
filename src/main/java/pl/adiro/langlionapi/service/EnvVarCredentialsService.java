package pl.adiro.langlionapi.service;

import org.springframework.stereotype.Service;

@Service
public class EnvVarCredentialsService implements CredentialsService{
    @Override
    public String getLogin() {
        return System.getenv("LANGLION_LOGIN");
    }

    @Override
    public String getPassword() {
        return System.getenv("LANGLION_PASSWORD");
    }
}
