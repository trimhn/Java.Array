import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args){

        int guess = 0;

        int x = -1;



        // Assign random # to x

        Random rnd = new Random();

        x = 1 + rnd.nextInt(10);



        // Uncomment below command in developer mode

//        System.out.println("(For dev only: The number is " + x + ")");



        System.out.println("I have a number between 1 and 10. Take a guess!");

        // Get initial user guess

        Scanner keyboard = new Scanner(System.in);

        guess = keyboard.nextInt();



        // Get user guess as many times as needed

        while(guess!=x){

            System.out.println("Your guess: " + guess);

            System.out.println("That is incorrect. Guess again.");

            guess = keyboard.nextInt();

        }

        System.out.println("Your guess: " + guess);

        System.out.println("That is correct! You guessed my number.");

    }
}
