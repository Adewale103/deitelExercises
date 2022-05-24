package chapterNine;

public class Loan {
    private double principal;
    private int loanTenure;
    private double rate;

    public Loan(double principal, int loanTenure) {
        this.principal = principal;
        this.loanTenure = loanTenure;
        this.rate = 1.0;

    }

    public double monthlyInstallation(){
        return principal * rate/(12 * loanTenure);
    }

    public double getPrincipal() {
        return principal;
    }

    public int getLoanTenure() {
        return loanTenure;
    }

    public double getRate() {
        return rate;
    }
    @Override
    public String toString(){
        return String.format("%s: %.2f%n%s: %d%n%s: %.2f","Principal",getPrincipal(),
                "Loan tenure",getLoanTenure(),"Rate",getRate());
    }
}
