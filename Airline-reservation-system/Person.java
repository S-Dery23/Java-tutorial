import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dob;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dob, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dob = dob;
        // this.passport = Arrays.copyOf(passport, passport.length);
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }
    
    public String getDob() {
        return dob;
    }

    // public String[] getPassport(String[] passport) {
    //     return passport;
    // }

    public int getSeatNumber(){
        return seatNumber;
    }

}
