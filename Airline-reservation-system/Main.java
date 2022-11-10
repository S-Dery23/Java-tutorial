import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // String[] passport = {"Rayan Slim", "Canadian", "01//01//1111"};
        Person person = new Person("Rayan Slim", "Canadian", "01//01//1111", 10);

        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: "
         + person.getDob() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

        Person person1 = new Person(person);
        person1.setName("Jad SLim");
        person1.setSeatNumber(3);

        System.out.println("Name: " + person1.getName() + "\n" + "Nationality: " + person1.getNationality() + "\n" + "Date of Birth: "
         + person1.getDob() + "\n" + "Seat Number: " + person1.getSeatNumber() + "\n");
    
    }

}