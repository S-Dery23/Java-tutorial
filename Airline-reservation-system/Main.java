import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // String[] passport = {"Rayan Slim", "Canadian", "01//01//1111"};
        Person person = new Person("Rayan Slim", "Canadian", "01//01//1111", 10);

        person.printClass();

        if (person.applyPassport()) {
            System.out.println("Congratulations " + person.getName() + " your passport has been approved");
            person.setPassport();
        } else {
            System.out.println("Sorry " + person.getName() + " we were not able to process your passport");
        }

        person.printClass();
    }

}