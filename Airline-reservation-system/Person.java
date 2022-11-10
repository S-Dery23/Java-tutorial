import java.util.Arrays;

// import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dob;
    private String[] passport = new String[3];
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
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
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

    public String[] getPassport() {
        return Arrays.copyOf(passport, passport.length);
    }

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

    public void setPassport() {
        passport[0] = this.name;
        passport[1] = this.nationality;
        passport[2] = this.dob;
    }

    public boolean applyPassport() {
        int random = (int) (Math.random()*2);
        switch (random) {
            case 0: return false;
        
            default: return true;
        }
    }

    public void chooseSeat(){
        int random = (int) (Math.random()*11 + 1);
        this.seatNumber = random;
    }
}
