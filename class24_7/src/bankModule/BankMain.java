package bankModule;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to Simple Banking System ===");

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Choose Account Type (1 for Saving, 2 for Current): ");
        int choice = sc.nextInt();

        AccountCreation account;
        if (choice == 1) {
            account = new SavingAccount(name, accNo);
        } else {
            account = new CurrentAccount(name, accNo);
        }

        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();

        int option;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Show Account Details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depAmt = sc.nextDouble();
                    deposit.depositAmount(account, depAmt);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withAmt = sc.nextDouble();
                    withdraw.withdrawAmount(account, withAmt);
                    break;

                case 3:
                    account.showAccountDetails();
                    break;

                case 4:
                    System.out.println("Thank you for banking with us!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);

        sc.close();
    }
}

