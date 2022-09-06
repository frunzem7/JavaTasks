package task3;

import java.util.List;

public class Bank {
    private final List<SavingsAccount> savingsAccounts;
    private final Float annualInterestRate;

    public Bank(List<SavingsAccount> savingsAccounts, Float annualInterestRate) {
        this.savingsAccounts = savingsAccounts;
        this.annualInterestRate = annualInterestRate;
        SavingsAccount.modifyInterestRate(annualInterestRate);
    }

    void calculateGlobalMonthlyInterest() {
        Double amountBeforeInterest = savingsAccounts.stream().mapToDouble(SavingsAccount::getSavingsBalance).sum();
        savingsAccounts.forEach(SavingsAccount::calculateMonthlyInterest);
        Double amountAfterInterest = savingsAccounts.stream().mapToDouble(SavingsAccount::getSavingsBalance).sum();
        System.out.println("Before: " + amountBeforeInterest);
        System.out.println("After: " + amountAfterInterest);
        System.out.println("Interest amount: " + (amountAfterInterest - amountBeforeInterest));
    }
}