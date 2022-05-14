package chapterNine;

public class PersonalLoan extends Loan {
    private double rate;

    public PersonalLoan(double principal, int loanTenure){
        super(principal,loanTenure);
        this.rate = 0.15;
    }
}
