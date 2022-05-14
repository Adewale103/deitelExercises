package chapterNine;

import java.util.Scanner;

public class LoanTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the home loan principal: ");
        int homePrincipal = input.nextInt();

        System.out.println("Enter the home loan tenure: ");
        int homeTenure = input.nextInt();

        HomeLoan homeLoan = new HomeLoan(homePrincipal,homeTenure);
        System.out.println(homeLoan);
        System.out.println("Monthly installation "+homeLoan.monthlyInstallation());



    }
}
