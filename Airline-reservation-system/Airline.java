import java.util.Arrays;

public class Airline {
    private Person[] people;
    
    public Airline(){
        people = new Person[11];
    }

    public Person getPerson(int index){
        return this.people[index];
    }

    public void setPerson(Person person){
        this.people[person.getSeatNumber()-1] = new Person(person);
    }
}
