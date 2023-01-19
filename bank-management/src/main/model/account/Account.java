package src.main.model.account;

public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name, double balance){
        if (id == null || id.isBlank() || name == null || name.isBlank()) {
            throw new IllegalArgumentException("Please input proper data");
        }
        this.id = id;
        this.name = name;
        this.balance = balance;

    }

}
