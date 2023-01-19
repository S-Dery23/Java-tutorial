package src.main.model.account;

public abstract class Account {
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

    public Account(Account source){
        this.id = source.id;
        this.name = source.name;
        this.balance = source.balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Please input proper data");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Please input proper data");
        }
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return (this.getClass().getSimpleName()) +
                "id = '" + this.id + "'" +
                ", name = '" + this.name + "'" +
                ", balance = " + this.balance +
                '}';
    }
}
