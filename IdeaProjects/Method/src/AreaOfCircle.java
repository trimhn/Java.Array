import java.util.Scanner;

public class AreaOfCircle {
    public static void main (String args[]){
        AreaOfCircle();
    }
    public static void AreaOfCircle() {
        final double pi = 3.14;


        Scanner sc= new Scanner(System.in);
     System.out.println("Input radius of Circle: ");
        double radius=sc.nextDouble();
        double area=AreaCirc(pi, radius);
        System.out.println("Area of Circle: " +area);

    }
    public static double AreaCirc(final double pi,double radius){
        double area=0;
        area=pi*radius*radius;
        return area;
    }
}
