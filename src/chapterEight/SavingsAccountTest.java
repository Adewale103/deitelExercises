package chapterEight;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("saver1 = "+saver1.getSavingBalance());
        System.out.println("saver2 = "+saver2.getSavingBalance());

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("saver1 = "+saver1.getSavingBalance());
        System.out.println("saver2 = "+saver2.getSavingBalance());

    }
}
