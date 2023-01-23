package src.main.model;

public class Transaction {

    private enum TYPE{WITHDRAW, DEPOSIT};
    private long timestamp;
    private String id;
    private double amount;

    private TYPE type;

    public Transaction(long timestamp, String id, double amount, TYPE type){
        this.timestamp = timestamp;
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    public Transaction(Transaction source){
        this.timestamp = source.timestamp;
        this.id = source.id;
        this.amount = source.amount;
        this.type = source.type;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TYPE getType() {
        return this.type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
