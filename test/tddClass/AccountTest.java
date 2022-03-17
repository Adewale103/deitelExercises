package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class AccountTest {

    @Test
    public void depositTest() {
        //given
        Account ucheAccount = new Account();
        //when
        ucheAccount.deposit(100);
        //assert
        assertEquals(100, ucheAccount.getBalance());

    }

    @Test
    public void depositMultipleTest() {
        //given
        Account ucheAccount = new Account();
        //when
        ucheAccount.deposit(100);
        ucheAccount.deposit(500);
        ucheAccount.deposit(600);
        //assert
        assertEquals(1200, ucheAccount.getBalance());

    }

    @Test

    public void negativeDepositTest() {
        //given
        Account ucheAccount = new Account();
        //when
        ucheAccount.deposit(1000);
        ucheAccount.deposit(-400);
        //assert
        assertEquals(1000, ucheAccount.getBalance());
    }

    @Test
    public void withdrawalTest() {
        //given
        Account ucheAccount = new Account();
        ucheAccount.deposit(5000);
        ucheAccount.withdrawal(3000);
        assertEquals(2000, ucheAccount.getBalance());

    }

    @Test
    public void emptyAccountTest() {
        //given
        Account ucheAccount = new Account();
        ucheAccount.deposit(0);
        ucheAccount.withdrawal(3000);
        assertEquals(0, ucheAccount.getBalance());

    }

    @Test
    public void moreWithdrawalTest() {
        //given
        Account ucheAccount = new Account();
        ucheAccount.deposit(3000);
        ucheAccount.withdrawal(4000);
        assertEquals(3000, ucheAccount.getBalance());

    }
}
