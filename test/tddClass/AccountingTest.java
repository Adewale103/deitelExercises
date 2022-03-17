package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountingTest {
    @Test
    public void depositTest(){
        Accounting customer1 = new Accounting();
        customer1.deposit(500.45);
        assertEquals(500.45,customer1.getBalance());
    }
    @Test
    public void multipleDepositTest() {
        Accounting customer1 = new Accounting();
        customer1.deposit(1000);
        customer1.deposit(200);
        customer1.deposit(600);
        assertEquals(1800, customer1.getBalance());

    }
    @Test
    public void negativeDepositTest(){
        Accounting customer1 = new Accounting();
        customer1.deposit(-600);
        assertEquals(0,customer1.getBalance());
    }
    @Test
    public void withdrawalTest(){
        Accounting customer1 = new Accounting();
        customer1.deposit(1000);
        customer1.withdraw(500);
        assertEquals(500,customer1.getBalance());
    }
    @Test
    public void overWithdrawalTest(){
        Accounting customerA = new Accounting();
        customerA.deposit(6000);
        customerA.deposit(15000);
        customerA.withdraw(34000);
        assertEquals(21000,customerA.getBalance());
    }
    @Test
    public void negativeWithdrawalTest(){
        Accounting wale = new Accounting();
        wale.withdraw(-54);
        assertEquals(0,wale.getBalance());

    }
    @Test
    public void EmptyAccount(){
        Accounting wale = new Accounting();
        wale.withdraw(50);
        assertEquals(0,wale.getBalance());
    }
    @Test
    public void chargesTest(){
        Accounting wale = new Accounting();
        wale.deposit(20000);
        wale.effectMonthlyCharges();
        assertEquals(19800, wale.getBalance());
    }
}
