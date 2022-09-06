package task3;

public class SavingsAccount {
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Gender gender;
    private static Float annualInterestRate = 0.0F;
    private Float savingsBalance = 0.0F;
    private Float monthlyInterest = 0.0F;

    public SavingsAccount(Long id, String firstName, String lastName, Integer age, Gender gender, Float savingsBalance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.savingsBalance = savingsBalance;
    }

    public Float getSavingsBalance() {
        return savingsBalance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", savingsBalance=" + savingsBalance +
                ", monthlyInterest=" + monthlyInterest +
                '}';
    }

    public void calculateMonthlyInterest() {
        savingsBalance = savingsBalance + (savingsBalance * annualInterestRate / 12);
    }

    public static void modifyInterestRate(Float interestRate) {
        annualInterestRate = interestRate / 100;
    }

    public static void transferFunds(SavingsAccount savingsAccount1, SavingsAccount savingsAccount2, Float sum) {
        if (savingsAccount1.savingsBalance < sum) {
            throw new IllegalArgumentException("First person haven't enough money!");
        }
        savingsAccount1.savingsBalance = savingsAccount1.savingsBalance - sum;
        savingsAccount2.savingsBalance = savingsAccount2.savingsBalance + sum;
    }
}