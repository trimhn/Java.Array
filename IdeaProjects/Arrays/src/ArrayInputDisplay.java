import java.util.Scanner;

public class ArrayInputDisplay {
    public static void main(String[] args) {
        String[] name = new String[3];
        name[0]="Bob";
        name[1]="David";
        name[2]="Jack";
       // int index=0;

        //Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the names");

        for (int index = 0; index < name.length; index++) {

           // name[index]=sc.nextLine();
            System.out.println("Array list:" + name[index]);

        }
    }
}