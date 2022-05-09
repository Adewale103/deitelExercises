package chapterEight;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingBalance;

    public String getSavingBalance() {
        return String.format("%s%.2f","$",savingBalance);
    }

    public SavingsAccount(double savingBalance) {
        this.savingBalance = savingBalance;
        annualInterestRate = 0.5;
    }

    public void calculateMonthlyInterest(){
        savingBalance = (savingBalance * annualInterestRate/12) + savingBalance;
    }
    public static void modifyInterestRate(double new_annualInterestRate){
        if(new_annualInterestRate > 0){
        annualInterestRate = new_annualInterestRate;
        }
        else throw new IllegalArgumentException("annual interest rate should be greater than zero!");
    }
}
