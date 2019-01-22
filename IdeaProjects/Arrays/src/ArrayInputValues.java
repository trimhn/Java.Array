import java.util.Scanner;

public class ArrayInputValues {
    public static void  main (String[]args){
            int arraynum[]=new int[10];
            int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nos");
        for(int index=0; index<arraynum.length;index++){
            arraynum[index]=sc.nextInt();
            sum=sum+arraynum[index];

        }
        System.out.println("Sum of the entered arrays is:" + sum);
    }
}
