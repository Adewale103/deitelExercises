package chapterNine;

public class HomeLoan extends Loan {
    private double rate;

    public HomeLoan(double principal, int loanTenure){
        super(principal,loanTenure);
        this.rate = 0.23;
    }
    @Override
    public double getRate() {
        return rate;
    }


}
