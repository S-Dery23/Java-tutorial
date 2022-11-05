package Challenge_4;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    //Task 1: See if the user wants to play. 
        String choice = scan.nextLine();

    /*Task 2: Set up the game
       • if the answer is yes: 
             – print: Great!
             – print: rock - paper - scissors, shoot!
             – pick up user's choice.
             – get the computer choice (can only be done after task 3).
             – get the result (can only be done after task 4)
             – print everything (can only be done after task 5).
    
       • else:
             – print: Darn, some other time...!        
    */

    switch (choice) {
        case "yes":
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!");
            String userChoice = scan.nextLine();
            String computerChoice = computerChoice();

            System.out.println("Your choice was " + userChoice + " and computer chose " + computerChoice);

            System.out.println(result(userChoice, computerChoice));

            break;
        
        case "no":
            System.out.println("Darn, some other time...!");
            break;
    
        default: System.out.println("You choice was not reasonable");
            break;
    }
              

        scan.close();
    }


    //Task 3  – Write a function where the computer picks a random choice.
    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */

    public static String computerChoice() {
        int random = (int) (Math.random()*3);
        if (random == 0) {
             return "rock";
        }else if(random == 1){
        return "paper";
        }else{
             return  "scissors";
        }
    }
    
    //Task 4  – Write a function that compares the choices and returns the result.
    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   
     *   1. result is "You win!" if:
     *
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *
     *       Computer: "scissors"  You: "paper"
     *
     *   3. Otherwise, the result is "You lose!":
     * 
     * 
     *   4. Otherwise, print "ERROR" and exit the program.
     *
     *
     */

    public static String result(String userChoice, String computerChoice) {
        if((userChoice.equals("rock") && computerChoice.equals("scissors")) || (userChoice.equals("paper") && computerChoice.equals("rock")) || (userChoice.equals("scissors") && computerChoice.equals("paper"))){
            return "You Win";
        }else if(userChoice.equals(computerChoice)){
            return "It's a Draw";
        }else{
            return "You lose";
        }
     }
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

}
