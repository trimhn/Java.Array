public class ArrayNum1 {
    public static void main (String []args){
        int[]nums={1, 2,3,41,5,6,7,8,95,10};
        //nums= new int[10];
        int arraySize=nums.length;
        System.out.println("Total Array items: "+arraySize);
        for(int index=0; index<=nums.length;index++){
            System.out.println(nums[index]);
        }
    }
}
