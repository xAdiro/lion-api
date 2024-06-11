package pl.adiro.langlionapi.model.lessons;

import lombok.Data;


@Data
public class Student {
    private String fullName;

    private String subject;

    private String grade;

    private String level;
}
