import java.util.Scanner;

public class ArrayAve {
    public static void  main (String[]args){
        int arraynum[]=new int[10];
        double sum=0;
        double average=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nos");
        for(int index=0; index<arraynum.length;index++){
            arraynum[index]=sc.nextInt();
            sum=sum+arraynum[index];
            average=sum/10;


        }
        System.out.println("Sum is:" +sum);
        System.out.println("Average of the entered arrays is:" + average);
    }
}
