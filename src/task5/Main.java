package task5;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer count = 0;

        while (true) {
            System.out.println(LocalDateTime.now() + " Enter your phone number: ");
            String numberPhone = sc.nextLine();

            if (numberPhone.matches("^(\\+373) \\d{2} \\d{6}")) {
                break;
            } else if (numberPhone.matches("^(\\(373\\))-\\d{2}-\\d{2}-\\d{2}-\\d{2}")) {
                break;
            } else if (numberPhone.matches("^(\\+373) \\d{2} \\d{3}-\\d{3}")) {
                break;
            } else {
                System.out.println(LocalDateTime.now() + " This number is not valid! " +
                        "Try again, for ex: +373 60 066006, +(373)-79-85-85-85 or +373 79 666-999.");
            }
            count++;

            if (count == 4) {
                throw new IllegalArgumentException(LocalDateTime.now() +
                        " You have already tried 4 times. Try again in an hour.");
            }
        }

        count = 0;

        while (true) {
            System.out.println(LocalDateTime.now() + " Enter how much money you want to charge your phone: ");
            Float amount = sc.nextFloat();

            if (amount >= 10 && amount <= 500) {
                break;
            }
            count++;

            if (count == 3) {
                throw new IllegalArgumentException(LocalDateTime.now() +
                        " You have already tried 3 times. Try again in an hour");
            }
        }
        System.out.println(LocalDateTime.now() + " Transaction is done!");
    }
}