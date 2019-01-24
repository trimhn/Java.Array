import java.util.Scanner;

public class AddTwoNos {
    public static void main(String[] args) {

        promptInputs();



    }



    public static void promptInputs() {

        Scanner input = new Scanner(System.in);



        System.out.println("Enter first no:");

        int Num1 = input.nextInt();



        System.out.println("Enter second no:");

        int Num2 = input.nextInt();



        int sum = SumNum(Num1, Num2);

        System.out.println("Sum of tow Nos: " + sum);

    }



    public static int SumNum(int Num1, int Num2) {



        int sum = 0;



        sum = Num1 + Num2;



        return sum;



    }
}