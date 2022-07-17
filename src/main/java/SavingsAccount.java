public class SavingsAccount extends Account {

    public SavingsAccount(String account, int balance) {
        super(account);
        this.balance = balance;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("Вы не можете совершить платеж со счета " + account + ". Выберите другой счет.");
        return false;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if ((balance - amount) >= 0) {
            if (account.addMoney(amount)) {
                this.balance -= amount;
                System.out.println(amount + " у.е. успешно переведены c " + this.account + " на " + account.account + "" +
                        ". Остаток на счету " + this.balance + " у.е.");
            }
            ;
            return true;
        } else {
            System.out.println("Недостаточно средств. Введите сумму до " + balance);
            return false;
        }
    }

    @Override
    public boolean addMoney(int amount) {
        this.balance += amount;
        System.out.println("Средства успешно зачислены на счет! Остаток по счету равен " + this.balance);
        return true;
    }
}
