package pl.adiro.langlionapi.model.lessons;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class Lesson {

    private LocalDate date;

    private LocalTime startTime;

    private LocalTime endTime;

    private Student student;

    private String topic;

    private LessonStatus status;

    private Attendance attendance;
}
