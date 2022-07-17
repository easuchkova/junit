import org.junit.jupiter.api.*;

public class testPay {
   @BeforeAll
   public static void beforeAll(){
       System.out.println("Pay tests");
   }

    @org.junit.jupiter.api.Test
    public void testPayFromCreditAccount(){
        // given:
        CreditAccount accCredit = new CreditAccount("My credit accout", 0);
        int expected = -1000;

        // when:
        accCredit.pay(1000);
        int actual = accCredit.balance;

        // then:
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testPayFromSavingAccount(){
        // given:
        SavingsAccount accSaving = new SavingsAccount("My saving account", 0);

        // when:
        boolean result = accSaving.pay(1000);

        // then:
        Assertions.assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    public void testPayFromCheckingAccount(){
        // given
        CheckingAccount accChecking = new CheckingAccount("My checking account", 0);

        // when:
        boolean result = accChecking.pay(1000);

        // then:
        Assertions.assertFalse(result);
    }
}
