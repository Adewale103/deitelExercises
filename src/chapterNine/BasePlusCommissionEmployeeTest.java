package chapterNine;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee user = new BasePlusCommissionEmployee("Wale","Samuel",
                "12345",7122,0.2,3000);

        System.out.println(user);
        System.out.println();

        user.setBaseSalary(1500);

        System.out.println("After updating base salary..........");
        System.out.println();
        System.out.println(user);

    }

}
