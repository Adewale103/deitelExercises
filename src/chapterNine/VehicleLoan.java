package chapterNine;

public class VehicleLoan extends Loan{
    private double rate;

    public VehicleLoan(double principal, int loanTenure){
        super(principal,loanTenure);
        this.rate = 1.90;
    }
}
