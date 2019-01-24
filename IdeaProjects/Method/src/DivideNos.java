import java.util.Scanner;

public class DivideNos {
    public static void main(String[] args) {

        divideTwoNumbers();



    }





    public static void divideTwoNumbers() {

        Scanner input = new Scanner(System.in);



        System.out.println("Enter first number");

        double Num1 = input.nextDouble();



        System.out.println("Enter second number");

        double Num2 = input.nextDouble();



        double result = DivideOps(Num1, Num2);

        System.out.println("The Division of two nos:" + result);

    }







    public static double DivideOps(double Num1, double Num2) {



        double result = 0;



        if (Num2 == 0) {

            System.out.println("Undefined");

            System.exit(0);



        } else {

            result = Num1 / Num2;

        }

        return result;

    }
}
