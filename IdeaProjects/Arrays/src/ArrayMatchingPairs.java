//Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4] 
//Write a program that will print out all matching pairs from arrays 1 and 2.
//Expected output:
//(7,7) and (6,6)
public class ArrayMatchingPairs {
    public static void main(String []args){
        int [] num1=new int[]{1,7,6,5,9};
        int [] num2= new int[]{2,7,6,3,4};
        for (int index=0;index<num1.length;index++){

            if (num1[index]== num2[index]){
                System.out.println("("+ num1[index]+","+num2[index]+")");
            }

        }

    }
}
