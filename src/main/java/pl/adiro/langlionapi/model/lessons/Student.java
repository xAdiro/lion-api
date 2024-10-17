package pl.adiro.langlionapi.model.lessons;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;


@Data
public class Student {
    private String name;
    private String surname;
    private String subject;
    private int grade;
    private String level;
}
