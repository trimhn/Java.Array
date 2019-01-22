import java.util.ArrayList;
public class ArrayNum {
    public static void main(String[] args) {
        int[] nums = new int[9];

        // int nums= 0;
        int sum=0;
        for (int index = 0; index <= nums.length; index++) {
            sum = sum + index;
            System.out.println(sum);
        }
    }
}