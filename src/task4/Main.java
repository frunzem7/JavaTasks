package task4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        RegistrationDate registrationDate1 = new RegistrationDate(
                new Student("Mariana", "Morari", 22, true,
                        List.of(University.ASEM)), LocalDate.of(2022, 8, 10));
        RegistrationDate registrationDate2 = new RegistrationDate(
                new Student("David", "Lascu", 22, true,
                        List.of(University.ULIM)), LocalDate.of(2022, 8, 10));
        RegistrationDate registrationDate3 = new RegistrationDate(
                new Student("Andrea", "Stepan", 22, false,
                        List.of(University.UTM)), LocalDate.of(2022, 8, 10));
        RegistrationDate registrationDate4 = new RegistrationDate(
                new Student("Maria", "Barba", 22, true,
                        List.of(University.ASEM)), LocalDate.of(2022, 8, 10));
        RegistrationDate registrationDate5 = new RegistrationDate(
                new Student("Ioana", "Ionitov", 22, false,
                        List.of(University.USM)), LocalDate.of(2022, 9, 10));
        RegistrationDate registrationDate6 = new RegistrationDate(
                new Student("Alina", "Platon", 22, true,
                        List.of(University.ASEM)), LocalDate.of(2022, 8, 10));
        RegistrationDate registrationDate7 = new RegistrationDate(
                new Student("Alexa", "Leca", 22, false,
                        List.of(University.UTM)), LocalDate.of(2022, 8, 10));
        RegistrationDate registrationDate8 = new RegistrationDate(
                new Student("Ruxandra", "Zaharia", 22, true,
                        List.of(University.ULIM)), LocalDate.of(2022, 9, 10));
        RegistrationDate registrationDate9 = new RegistrationDate(
                new Student("Evelina", "Borta", 22, true,
                        List.of(University.USM)), LocalDate.of(2022, 8, 10));
        RegistrationDate registrationDate10 = new RegistrationDate(
                new Student("Adriana", "Zgirvaci", 22, false,
                        List.of(University.ASEM)), LocalDate.of(2022, 9, 10));
        RegistrationDate registrationDate11 = new RegistrationDate(
                new Student("Viorelia", "Grosu", 22, true,
                        List.of(University.ASEM)), LocalDate.of(2022, 8, 10));
        RegistrationDate registrationDate12 = new RegistrationDate(
                new Student("Vadim", "Ursu", 22, true,
                        List.of(University.ULIM)), LocalDate.of(2022, 8, 10));
        RegistrationDate registrationDate13 = new RegistrationDate(
                new Student("Victor", "Fustei", 22, false,
                        List.of(University.ASEM)), LocalDate.of(2022, 9, 10));
        RegistrationDate registrationDate14 = new RegistrationDate(
                new Student("Viorica", "Vicol", 22, false,
                        List.of(University.ULIM)), LocalDate.of(2022, 9, 10));
        RegistrationDate registrationDate15 = new RegistrationDate(
                new Student("Dima", "Duca", 22, true,
                        List.of(University.UTM)), LocalDate.of(2022, 8, 10));

        List<RegistrationDate> registrationDates = List.of(registrationDate1, registrationDate2,
                registrationDate3, registrationDate4, registrationDate5, registrationDate6, registrationDate7,
                registrationDate8, registrationDate9, registrationDate10, registrationDate11, registrationDate12,
                registrationDate13, registrationDate14, registrationDate15);

        List<Student> students = registrationDates.stream().map(RegistrationDate::getStudent).toList();
        Map<University, List<Student>> studentsByUniversity = getStudentsByUniversity(students);
    }
    static Map<University, List<Student>> getStudentsByUniversity(List<Student> students) {
        return Arrays.stream(University.values())
                .collect(Collectors.toUnmodifiableMap(v -> v, v -> findStudentsByUniversity(students, v)));
    }

    static List<Student> findStudentsByUniversity(List<Student> students, University university) {
        return students.stream()
                .filter(student -> student.getUniversities().contains(university))
                .toList();
    }
}