public class Car {
    private String brand;
    private double price;
    private int yearModel;

    public Car(String brand, double price, int yearModel) {
        this.brand = brand;
        this.price = price;
        this.yearModel = yearModel;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getYearModel() {
        return yearModel;
    }


}
