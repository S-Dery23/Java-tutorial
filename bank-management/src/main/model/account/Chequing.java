package src.main.model.account;

public class Chequing extends Account{

    public Chequing(String id, String name, double balance){
        super(id, name, balance);
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public boolean withdraw(double amount) {
        super.setBalance(super.round(super.getBalance() - amount));
        return true;
    }

    public Chequing(Chequing source){
        super(source);
    }



}
