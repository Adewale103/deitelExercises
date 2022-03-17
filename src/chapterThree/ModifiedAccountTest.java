package chapterThree;

import java.util.Scanner;

public class ModifiedAccountTest {
    public static void main(String[] args){
        ModifiedAccount account1 = new ModifiedAccount("Adewale",23.50);
        ModifiedAccount account2 = new ModifiedAccount("Bunmi",-15.23);

        System.out.printf("%s Balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s Balance: $%.2f%n",account2.getName(),account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter account name: ");
        String name = input.nextLine();
        account1.setName(name);

        System.out.println("Enter deposit amount for account1: ");
        double amountDeposited = input.nextDouble();

        account1.deposit(amountDeposited);
        System.out.printf("adding %.2f to account1%n",amountDeposited);

        System.out.printf("%s Balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s Balance: $%.2f%n",account2.getName(),account2.getBalance());

        System.out.println("Enter account name: ");
        String name2 = input.nextLine();
        account2.setName(name2);

        System.out.println("Enter deposit amount for account2");
        double amountDeposited2 = input.nextDouble();

        account2.deposit(amountDeposited2);
        System.out.printf("adding %.2f to account2%n",amountDeposited2);

        System.out.printf("%s Balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s Balance: $%.2f%n",account2.getName(),account2.getBalance());

        System.out.println("Enter withdrawal amount for account1");
        double amountWithdrew = input.nextDouble();
        account1.withdraw(amountWithdrew);

        System.out.printf("%s Balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s Balance: $%.2f%n",account2.getName(),account2.getBalance());

        System.out.println("Enter withdrawal amount for account2");
        double amountWithdrew2 = input.nextDouble();
        account2.withdraw(amountWithdrew2);

        System.out.printf("%s Balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s Balance: $%.2f%n",account2.getName(),account2.getBalance());


    }
}
