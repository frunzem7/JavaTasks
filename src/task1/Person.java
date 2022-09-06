package task1;

public class Person {
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Gender gender;

    public Person(Long id, String firstName, String lastName, Integer age, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}