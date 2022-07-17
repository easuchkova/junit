import org.junit.jupiter.api.*;

public class testAddMoney {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Add Money tests");
    }

    @org.junit.jupiter.api.Test
    public void testAddMoneyToCreditAccount() {
        // given:
        CreditAccount accCredit = new CreditAccount("My credit accout", 0);

        // when:
        boolean result = accCredit.addMoney(1000);

        // then:
        Assertions.assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    public void testAddMoneyToSavingAccount(){
        // given:
        SavingsAccount accSaving = new SavingsAccount("My saving account", 0);

        // when:
        boolean result = accSaving.addMoney(1000);

        // then:
        Assertions.assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    public void testAddMoneyToCheckingAccount() {
        // given
        CheckingAccount accCheck = new CheckingAccount("My checking accout", 0);

        // when:
        boolean result = accCheck.addMoney(1000);

        // then:
        Assertions.assertTrue(result);
    }
}
