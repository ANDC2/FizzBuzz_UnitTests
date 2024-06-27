import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest{
    BankAccount bankAccount;

    @BeforeEach
    public void setup() {
        //new object with clean state
        bankAccount = new BankAccount();
    }
    @AfterEach
    public void afterEach() {
        //  logging the final balance after each test
        System.out.println("Final balance after test: " + bankAccount.getBalance());
    }

    @Test
    public void depositPositiveAmount() {
        assertEquals(200, bankAccount.deposit(100));

    }

    @Test
    public void depositof0ReturnIllegalException() {
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.deposit(0);
        });
    }
    @Test
    public void depositNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.deposit(-50);
        });
    }
    @Test
    public void withdrowWithinBalance(){
        assertEquals(0, bankAccount.withdraw(100));
    }
    @Test
    public void withdrowMoreThanBalance(){
        assertThrows(IllegalArgumentException.class, () ->{
            bankAccount.withdraw(200);
        });
    }
    @Test
    public void withdrw0AmountThrowsException(){
        assertThrows(UnsupportedOperationException.class, () ->{
            bankAccount.withdraw(0);
        });
    }
    @Test
    public void withdrwNegativeAmountThrowsException(){
        assertThrows(UnsupportedOperationException.class, () ->{
            bankAccount.withdraw(-100);
        });
    }
    @Test
    public  void exceedDailyLimit(){
        bankAccount.deposit(10000);
        assertThrows(IllegalArgumentException.class, () ->{
            bankAccount.withdraw(3100);
    });
}
}