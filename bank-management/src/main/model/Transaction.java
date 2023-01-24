package src.main.model;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Transaction implements Comparable<Transaction>{
    public enum Type {WITHDRAW, DEPOSIT};
    private Type type;
    private long timestamp;
    private String id;
    private double amount;

    public Transaction(Type type, long timestamp, String id, double amount){
        if (id == null || id.isBlank() || amount < 0){
            throw new IllegalArgumentException("Invalid Parameters");
        }
        this.type = type;
        this.timestamp = timestamp;
        this.id = id;
        this.amount = amount;
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
        if (id == null || id.isBlank()){
            throw new IllegalArgumentException("Invalid ID");
        }
        this.id = id;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        if (amount < 0){
            throw new IllegalArgumentException("Invalid Amount");
        }
        this.amount = amount;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public String returnDate() {
        Date date = new Date(this.timestamp * 1000);
        return new SimpleDateFormat("dd-MM-yyyy").format(date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction that)) return false;
        return timestamp == that.timestamp && Double.compare(that.amount, amount) == 0 && type == that.type && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, timestamp, id, amount);
    }

    @Override
    public int compareTo(@NotNull Transaction o) {
        return Double.compare(this.timestamp, o.timestamp);
    }

    @Override
    public String toString() {
        return (type) + "    " +
                "\t" + this.returnDate() + "" +
                "\t" + this.id + "" +
                "\t$" + this.amount + "";
    }
}
