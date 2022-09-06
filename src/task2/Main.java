package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Grades.showAll()));
        System.out.println();

        System.out.println(Grades.BASIC.next());
        System.out.println();

        System.out.println(Grades.BASIC.previous());
    }
}