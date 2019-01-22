//Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.
public class ArryLiscBackward {
    public static void main(String args[]) {
        int[] nos = new int[]{1,2,3,4,5,6,7,8,9};
        for (int index = nos.length; index >0; index--){
            System.out.println(index);
        }

    }
}