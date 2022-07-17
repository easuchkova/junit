public class Main {

    public static void main(String[] args) {

        Account acc1 = new SavingsAccount("Сберегательный счет 1", 1000);
        Account acc3 = new CheckingAccount("Рассчетный счет 1", 1000);
        Account acc4 = new CreditAccount("Кредитный счет 1", 0);

        acc1.transfer(acc4, 50);
        System.out.println("ACC1: " + acc1.balance);
        System.out.println("ACC4: " + acc4.balance);

        acc3.transfer(acc4, 100);
        System.out.println("ACC3: " + acc3.balance);
        System.out.println("ACC4: " + acc4.balance);

        acc4.pay(1000);
        System.out.println("ACC4: " + acc4.balance);

        acc1.transfer(acc4, 500);
        System.out.println("ACC1: " + acc1.balance);
        System.out.println("ACC4: " + acc4.balance);

        acc1.transfer(acc4, 50);
        System.out.println("ACC1: " + acc1.balance);
        System.out.println("ACC4: " + acc4.balance);

    }
}
