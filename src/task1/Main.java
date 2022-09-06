package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1L, "Alina", "Morari", 34, Gender.FEMALE);
        Person person2 = new Person(2L, "Andrei", "Stepan", 25, Gender.MALE);

        Object[] objects = new Object[]{1, 3, "Ala", "Bala", person1, 's', person2, 5.5};
        concatenateValues(objects);
    }

    static void concatenateValues(Object[] objects) {
        String stringConcate = "";
        Float sumNumbers = 0.0F;
        List<Person> persons = new ArrayList<>();
        for (Object object : objects) {
            if (object instanceof Number number) {
                sumNumbers = sumNumbers + number.floatValue();
            } else if (object instanceof Person person) {
                persons.add(person);
            } else if (object instanceof String string) {
                stringConcate = stringConcate + string;
            } else if (object instanceof Character character) {
                stringConcate = stringConcate + character;
            }
        }

        System.out.println(stringConcate);
        System.out.println(sumNumbers);
        persons.forEach(System.out::println);
    }
}