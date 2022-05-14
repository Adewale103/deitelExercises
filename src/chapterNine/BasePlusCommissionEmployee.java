package chapterNine;

public class BasePlusCommissionEmployee {
    private final CommissionEmployee commissionEmployee;
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName,String socialSecurityNumber,double grossSales,double commissionRate, double baseSalary){
        if(baseSalary < 0){
            throw new IllegalArgumentException("baseSalary must be > 0");
        }
        commissionEmployee = new CommissionEmployee(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary){
       if(baseSalary < 0){
           throw new IllegalArgumentException("baseSalary must be > 0");
       }
       this.baseSalary = baseSalary;
    }

    public double earnings(){
        return baseSalary + (commissionEmployee.getCommissionRate() * commissionEmployee.getGrossSales());
    }

    public CommissionEmployee getCommissionEmployee() {
        return commissionEmployee;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString(){
        return String.format("%s%n%s: %s",commissionEmployee,"Base Salary",getBaseSalary());
    }
}
