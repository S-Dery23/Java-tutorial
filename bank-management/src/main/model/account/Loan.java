package src.main.model.account;

public class Loan extends Account{

    private final double INTEREST_RATE = 0.02;
    private final double MAX_DEBT = 10000;
    private final double WITHDRAWAL_LIMIT = -10000;
    public Loan(String id, String name, double balance){
        super(id, name, balance);
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(super.getBalance() - amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.getBalance() + amount > MAX_DEBT){
            return false;

        }
        super.setBalance(super.round(super.round(super.getBalance() + amount + (amount * INTEREST_RATE))));
        return true;
    }

    public Loan(Loan source){
        super(source);
    }



}
