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

    public Person (Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dob = source.dob;
        // this.passport = Arrays.copyOf(source.passport, source.passport.length);
        this.seatNumber = source.seatNumber;
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
    //     return Array.copyOf(passport, passport.length);
    // }

    public int getSeatNumber(){
        return seatNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public void setDob(String dob) {
        this.dob = dob;
    }

    // public void getPassport(String[] passport) {
    //     
    // }

    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }

}
