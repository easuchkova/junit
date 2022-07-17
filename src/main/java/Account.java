public abstract class Account {

    protected int balance;
    String account;

    public Account(String account) {
        this.account = account;
    }

    public abstract boolean pay(int amount);

    ;

    public abstract boolean transfer(Account account, int amount);

    ;

    public abstract boolean addMoney(int amount);
}
