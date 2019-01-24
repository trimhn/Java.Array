import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        ArrayList<String> movies = new ArrayList<String>();



        //declare scanner to take movies input in temp

        Scanner input = new Scanner(System.in);



        // declare temp to avoid multiple enters

        String temp = "";



        // until the user types Q or q

        while (!temp.equalsIgnoreCase("Q"))

        {

            System.out.println("Enter the name of the movie");

            temp = input.nextLine();   //stores movie input in the temp



            // if condition to terminate after user input Q or q and display all the movie names before input Q or q

            if (!temp.equalsIgnoreCase("Q")) {

                movies.add(temp);    // adding the movie inputs until Q or q

                Collections.sort(movies); //sorting the alphabets of the movies



            }

        }



        // BONUS



        System.out.println("The movies are");



        for (String movie : movies) {



            System.out.println(movie);



        }



        //BONUS 2



        System.out.println("Here is the movie suggestion for you");



        Collections.shuffle(movies); //generating random name

        System.out.println(movies.get(0)); //prints the shuffled name

    }
}
