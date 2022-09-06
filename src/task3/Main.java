package task3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate(4.0F);

        SavingsAccount savingsAccount1 = new SavingsAccount(1L, "Alexa",
                "Codreanu", 24, Gender.FEMALE, 2000.00F);

        SavingsAccount savingsAccount2 = new SavingsAccount(2L, "Roma",
                "Duca", 30, Gender.MALE, 3000.00F);

        savingsAccount1.calculateMonthlyInterest();
        savingsAccount2.calculateMonthlyInterest();

        System.out.println(savingsAccount1);
        System.out.println(savingsAccount2);
        System.out.println();

        SavingsAccount.modifyInterestRate(5.0F);
        savingsAccount1.calculateMonthlyInterest();
        savingsAccount2.calculateMonthlyInterest();

        System.out.println(savingsAccount1);
        System.out.println(savingsAccount2);
        System.out.println();

        SavingsAccount.transferFunds(savingsAccount1, savingsAccount2, 700F);
        System.out.println(savingsAccount1);
        System.out.println(savingsAccount2);
        System.out.println();

        Bank bank = new Bank(List.of(savingsAccount1, savingsAccount2), 10F);
        bank.calculateGlobalMonthlyInterest();
    }
}