import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // String[] passport = {"Rayan Slim", "Canadian", "01//01//1111"};
        Person person = new Person("Rayan Slim", "Canadian", "01//01//1111", 10);

        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: "
         + person.getDob() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

        
    
    }

}