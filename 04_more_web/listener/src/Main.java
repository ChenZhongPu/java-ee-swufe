class BankruptListener implements BalanceListener {
    @Override
    public void onBalanceChange(BalanceEvent balanceEvent) {
        if (balanceEvent.getBalance() < 1000) {
            System.out.println("Warning! Be careful for bankruptcy");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Account account = new Account(5000);
        account.addListener(new BankruptListener());
        System.out.println("The user spends $4500");
        account.setBalance(500);
    }
}
