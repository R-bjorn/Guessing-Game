import java.util.*;

public class GuessingGame {
    // Variables
    static int random_number, userInput, userTries = 0;
    static Scanner sc = new Scanner(System.in);
    static boolean Game_Status = true;

    // For Introduction Message
    public static void Intro_Greeting() {
        System.out.println("This is A Random Number Guessing Game!");
        System.out.println("You have to Find out the Random Number Between 1 to 100.");
        System.out.println(
                "You will get 5 Tries! In this 5 tries, whatever you guess, The program will tell you if the Random Number is Higher/Lower than your Guessed Number!");
        System.out.println("Have Fun!!!!!!!!!!!!!!!!!\n");
    }

    // Generates Random Numbers between 1 to 100
    public static void Random_Gen() {
        Random random_gen = new Random();
        System.out.println("Generating a Random Number!");
        random_number = random_gen.nextInt(100) + 1;
        System.out.println("The Game has generated a Random Number!");
    }

    // Main
    public static void main(String[] Args) {
        while (Game_Status) {
            Intro_Greeting();
            Random_Gen();
            // User_Input();
            // Play_Again();
        }
    }
}