public class Array_Replace {
    public static void main(String []args){
        String [] letter= new String[]{"w","t","y","h","k"};
        for (int index=0; index< letter.length;index++)
        {

            if (letter[index]=="t")
        {
                letter[index]="hello";
            }
            System.out.println(letter[index]);
        }
    }
}
