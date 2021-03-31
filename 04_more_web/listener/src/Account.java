public class Account {
    private double balance;
    private BalanceListener balanceListener;

    public Account(double balance) {
        this.balance = balance;
    }

    public void addListener(BalanceListener balanceListener) {
        this.balanceListener = balanceListener;
    }

    public void setBalance(double bal) {
        balance = bal;
        balanceListener.onBalanceChange(new BalanceEvent(balance));
    }
}
