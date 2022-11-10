import java.util.Arrays;

public class Person {
    String name;
    String nationality;
    String dob;
    String[] passport;
    int seatNumber;

    public Person(String name, String nationality, String dob, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dob = dob;
        // this.passport = Arrays.copyOf(passport, passport.length);
        this.seatNumber = seatNumber;
    }
}
