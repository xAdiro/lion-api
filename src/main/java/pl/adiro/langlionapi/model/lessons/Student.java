package pl.adiro.langlionapi.model.lessons;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;


@Data
@Builder
public class Student {
    private int id;
    private String name;
    private String surname;
    private String subject;
    private int grade;
    private String level;
}
