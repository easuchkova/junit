public class CreditAccount extends Account {
    public CreditAccount(String account, int balance) {
        super(account);
        this.balance = balance;
    }

    @Override
    public boolean pay(int amount) {
        balance -= amount;
        System.out.println("Оплата прошла! Остаток по счету: " + balance);
        return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        System.out.println("Вы не можете перевести деньги со счета " + this.account + ". Выберите другой счет.");
        return false;
    }

    @Override
    public boolean addMoney(int amount) {
        if (this.balance + amount > 0) {
            System.out.println("Баланс не может быть положительным. Внесите сумму до " + balance * (-1));
            return false;
        } else {
            balance += amount;
            System.out.println("Счет пополнен!");
            return true;
        }
    }
}
