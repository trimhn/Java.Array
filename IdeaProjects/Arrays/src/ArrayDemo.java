import java.util.ArrayList;
public class ArrayDemo {
    public static void main (String[]args){
        //declares array of strings
        //String[] anArray;
        //allocates memory of items
        String[] anArray=new String[10];
        anArray[0]="Kennedy";
        anArray[1]="Johnson";
        anArray[2]="Nixon";
        anArray[3]="Ford";
        anArray[4]="Carter";
        anArray[5]="Reagan";
        anArray[6]="Bush";
        anArray[7]="Clinton";
        anArray[8]="Bush";
        anArray[9]="Obama";
        int arraysize = anArray.length;
        System.out.println(arraysize);


    }
}
