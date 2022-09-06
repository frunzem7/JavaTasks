package task4;

import java.time.LocalDate;
import java.time.Month;

public class RegistrationDate {

    private final Student student;
    private final LocalDate registrationDate;

    public RegistrationDate(Student student, LocalDate registrationDate) {
        this.student = student;
        this.registrationDate = registrationDate;
    }

    public Student getStudent() {
        return student;
    }

    void readyForErasmus() {
        if (registrationDate.getMonth().equals(Month.AUGUST)) {
            System.out.println("Congratulations, you registered on time!");
        } else {
            throw new IllegalArgumentException("You missed the deadline!");
        }
    }
}