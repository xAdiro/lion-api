package pl.adiro.langlionapi.model.lessons;

public enum LessonStatus {
    COMPLETED,
    CANCELLED_ON_TIME,
    CANCELLED_TOO_LATE,
    CANCELLED_RANDOM_SITUATION,
    CANCELLED_BY_TEACHER_RANDOM_SITUATION,
    CANCELLED_BY_TEACHER_WITHOUT_REASON,
    STUDENT_NOT_RESPONDING,
    OTHER
}
