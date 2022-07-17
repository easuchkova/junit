import javax.accessibility.AccessibleIcon;

public class CheckingAccount extends Account {
    public CheckingAccount(String account, int balance) {
        super(account);
        this.balance = balance;
    }

    @Override
    public boolean pay(int amount) {
        if (balance - amount < 0) {
            System.out.println("Недостаточно средств. Введите сумму не более " + balance);
            return false;
        } else {
            balance -= amount;
            System.out.println("Платеж прошел!");
            return true;
        }
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (this.balance - amount < 0) {
            System.out.println("Недостаточно средств. Введите сумму не более " + this.balance);
            return false;
        } else {
            if (account.addMoney(amount)) {
                this.balance -= amount;
            }
            return true;
        }
    }

    @Override
    public boolean addMoney(int amount) {
        balance += amount;
        System.out.println("Баланс счета " + account + " успешно пополнен. Текущий баланс: " + balance);
        return true;
    }
}
