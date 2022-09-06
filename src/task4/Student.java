package task4;

import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Boolean eligibleForErasmusScolarship;
    private final List<University> universities;

    public Student(String firstName, String lastName, Integer age, Boolean eligibleForErasmusScolarship,
                   List<University> universities) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.eligibleForErasmusScolarship = eligibleForErasmusScolarship;
        this.universities = universities;
    }

    public List<University> getUniversities() {
        return universities;
    }
}