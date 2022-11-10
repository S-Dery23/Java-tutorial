import javax.xml.transform.Source;

public class Car {
    private String brand;
    private double price;
    private int yearModel;

    public Car(String brand, double price, int yearModel) {
        this.brand = brand;
        this.price = price;
        this.yearModel = yearModel;
    }

    // source constructor
    public Car(Car Source){
        this.brand = Source.brand;
        this.price = Source.price;
        this.yearModel = Source.yearModel;
    }

    // getters
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getYearModel() {
        return yearModel;
    }

    // setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

}
