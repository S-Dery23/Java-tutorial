import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you ready to play Hangman -yes or no?");
        String answer = scanner.nextLine();

        if(answer.equals("yes")){
            int guess = (int) (Math.random()*64);
            String word = words[guess];
            
            System.out.println("Your word has " + word.length() + " letters");

            System.out.println("Therefore you have 7 chances to guess word");
            System.out.println("Are you ready");
            String response = scanner.nextLine();

            while (!response.equals("yes")) {
                System.out.println("When you are ready type yes");
                response = scanner.nextLine();
            }

            char[] guessWord = new char[word.length()];
            for (int index = 0; index < guessWord.length; index++) {
                guessWord[index] = '_';
            }

            int numberOfGuesses = 0;
            int guessedNumber = 0;
            char[] wrong = new char[7];
            while (numberOfGuesses != 7 ) {
                System.out.println(gallows[numberOfGuesses]);
                System.out.print("\t Correct guesses: ");
                System.out.print(guessWord);
                System.out.print("\n \t Wrong guesses: ");
                System.out.print(wrong);
                
                System.out.println("\n");
                if (guessedNumber == word.length()) {
                    System.out.println("You have won");
                    break;
                }
                
                System.out.println("\n \nInput guess ");
                String check = scanner.nextLine();

                if (word.contains(check)) {
                    for(int j = 0; j < word.length(); j++){
                        if (word.charAt(j) == check.charAt(0)) {
                            guessWord[j] = check.charAt(0);
                            guessedNumber++;
                        }
                        
                    }
                }else{
                    System.out.println("sorry you guess is wrong");
                    wrong[numberOfGuesses] = check.charAt(0);
                    numberOfGuesses++;
                }

            } 
            

            if (numberOfGuesses == 7) {
                System.out.println("Game over YOU LOST \n The word is " + word);
            }else{
                System.out.println("\n The word is " + word.toUpperCase());
                System.out.println("\n Congrats you guessed the word correctly with only " + numberOfGuesses + " mistakes.");
            }

        }else{
            System.out.println("Goodbye :( ");
        }
        scanner.close();
    }

}
    


