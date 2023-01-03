package src.main.models;

import java.util.Arrays;

public class Team {

    private static final String POSITION_CHASER = "chaser";
    private static final String POSITION_SEEKER = "seeker";
    private static final String POSITION_KEEPER = "keeper";

    private String house;
    private String keeper;
    private String seeker;
    private String[] chasers;

/* FREQUENTLY ASKED QUESTIONS:
    
Question: the constants are final, so why can't we make them public? It's not possible for the caller to update them.
  Answer: Even if the constant is final, I prefer to expose a method instead of the variable. But if you want to expose the variable, that's also correct.

*/
    public Team(String house, String keeper, String seeker, String[] chasers){
        if (house == null || house.equals(" ")){
            throw new IllegalArgumentException("House should not be null/blank");
        }
        this.house = house;

        if (keeper == null || keeper.equals(" ")){
            throw new IllegalArgumentException("Keeper should not be null/blank");
        }
        this.keeper = keeper;

        if (seeker == null || seeker.equals(" ")){
            throw new IllegalArgumentException("Seeker should not be null/blank");
        }
        this.seeker = seeker;

        if (chasers.length != 3 || Team.hasNull(chasers) || Team.hasBlank(chasers)){
            throw new IllegalArgumentException("The Chasers should be 3");
        }
        this.chasers = Arrays.copyOf(chasers,chasers.length);
    }

    public Team(Team source){
        this.house = source.house;
        this.keeper = source.keeper;
        this.seeker = source.seeker;
        this.chasers = Arrays.copyOf(source.chasers,source.chasers.length);
    }

    public void setHouse(String house) {
        if (house == null || house.equals(" ")){
            throw new IllegalArgumentException("House should not be null/blank");
        }
        this.house = house;
    }

    public void setKeeper(String keeper) {
        if (keeper == null || keeper.equals(" ")){
            throw new IllegalArgumentException("Keeper should not be null/blank");
        }
        this.keeper = keeper;
    }

    public void setSeeker(String seeker) {
        if (seeker == null || seeker.equals(" ")){
            throw new IllegalArgumentException("Seeker should not be null/blank");
        }
        this.seeker = seeker;
    }

    public void setChasers(String[] chasers) {
        if (chasers.length != 3 || Team.hasNull(chasers) || Team.hasBlank(chasers)){
            throw new IllegalArgumentException("The Chasers should be 3");
        }
        this.chasers = Arrays.copyOf(chasers,chasers.length);
    }

    public String getHouse(){
        return this.house;
    }

    public String getKeeper(){
        return this.keeper;
    }

    public String getSeeker(){
        return this.seeker;
    }

    public String[] getChasers(){
        return Arrays.copyOf(this.chasers,this.chasers.length);
    }

     public static String getPositionChaser() {
         return POSITION_CHASER;
     }

     public static String getPositionSeeker() {
         return POSITION_SEEKER;
     }

     public static String getPositionKeeper() {
         return POSITION_KEEPER;
     }

    public void checkParam(String param) {
        if (param == null || param.isBlank()) {
            throw new IllegalArgumentException(param + " cannot be null or blank");
        }
    }

    public static boolean hasBlank(String[] array){
        return Arrays.stream(array).anyMatch((elements) -> elements.isBlank());
    }

    public static boolean hasNull(String[] array){
        return Arrays.stream(array).anyMatch((elements) -> elements == null);
    }

     public String toString(){
         return "House: " + this.house + "\n" +
                 "Keeper: " + this.keeper + "\n" +
                 "Seeker: "  + this.seeker + "\n" +
                 "Chasers: " + Arrays.toString(this.chasers) + "\n";
     }
}
