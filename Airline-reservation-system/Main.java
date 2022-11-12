import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // String[] passport = {"Rayan Slim", "Canadian", "01//01//1111"};
        Person person = new Person("Rayan Slim", "Canadian", "01//01//1111", 10);

        System.out.println(person);
        System.out.println(person.toString());

        if (person.applyPassport()) {
            System.out.println("Congratulations " + person.getName() + " your passport has been approved");
            person.setPassport();
        } else {
            System.out.println("Sorry " + person.getName() + " we were not able to process your passport");
        }

        System.out.println(person);
        System.out.println(person.toString());
    }

}