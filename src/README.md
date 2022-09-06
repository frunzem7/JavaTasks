Task3.

1. Create a class called SavingsAccount that is for used keeping deposits. This class
   should contain a field-identifier of deposits holder (a person to whom the deposit
   belongs to).
2. Use a static variable annualInterestRate for keeping information about the interest
      rate, which is common for all depositors.
3. Every instance of this class has a private member savingsBalance, which
   represents the amount that depositor(holder) has on account.
4. Write a method calculateMonthlyInterest that determines monthly benefit using the
   following formula: (savingsBalance* annualInterestRate)/12; the result should be
   added to savingsBalance.
5. Write a static method modifyInterestRate that gives a new value to
   annualInterestRate.
6. Write a static method transferFunds, which should perform transfer of money from
   one deposit account to another deposit account.
7. In the main method create 2 different objects of type SavingsAccount with balance
   USD 2000 and USD 3000.
8. Set annualInterestRate equal to 4%, then calculate monthly benefit and add it to
   savingsBalance. Display new values for deposits.
9. Modify annualInterestRate to be equal to 5%. Calculate monthly benefit and add it
   savingsBalance. Display new values for deposits.
10. Perform transfer of USD 700 from one saver account to another saver account.
    Display savingsBalance for these accounts before the transfer and after the
    transfer.
11. Create a class called Bank. Bank can hold unlimited number of SavingAccount
    (deposits). Deposits have the same annualInteresRate specified by Bank for all of
    them.
12. Write a method calculateGlobalMonthlyInterest to calculate at once the monthly
    interest to ALL the SavingAccounts the Banks serves. This method should work
    for any number of SavingAccounts. As part of this method, please display the total
    amount of money on all accounts before the calculation, total amount after the
    calculation and total amount of interest calculated for all SavingAccounts.