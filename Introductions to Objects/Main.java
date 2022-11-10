public class Main{

    public static void main(String[] args) {
    
        System.out.println("hello World");
        Car hyundai = new Car("Hyundai Accent", 70000, 2018);

        System.out.println("Car Type: " + hyundai.getBrand());
        System.out.println("Price: " + hyundai.getPrice());
        System.out.println("Year Model : " + hyundai.getYearModel());

    }
}

