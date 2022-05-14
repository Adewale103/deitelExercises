package chapterNine;

public class CommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate ){
        if(grossSales < 0){
            throw new IllegalArgumentException("grossSales must be > 0");
        }

        if(commissionRate < 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("commissionRate must be > 0 or <= 1");
        }
    this.firstName = firstName;
    this.lastName = lastName;
    this.socialSecurityNumber = socialSecurityNumber;
    this.grossSales = grossSales;
    this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate){
        if (commissionRate < 0 || commissionRate > 1){
            throw new IllegalArgumentException("commissionRate must be > 0 and < 1");
        }
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0){
            throw new IllegalArgumentException("grossSales must be > 0");
        }
        this.grossSales = grossSales;
    }
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
        "commission employee", firstName, lastName,
        "social security number", socialSecurityNumber,
        "gross sales", grossSales,
        "commission rate", commissionRate);
    }
}
