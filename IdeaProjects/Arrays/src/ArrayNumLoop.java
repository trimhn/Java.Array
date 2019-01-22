public class ArrayNumLoop {
    public static void main (String []args){
        int[]nums=new int[9];
        //nums= new int[10];
        int sum =0;

        for(int index=0; index<=nums.length;index++){
            sum= sum+index;
            System.out.println(sum);

        }


    }
}
