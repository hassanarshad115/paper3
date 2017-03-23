
    
    
import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args)

    {
        double side_a, side_b, side_c, area;
        double s; // half perimeter
        Scanner a_input = new Scanner(System.in);
        Scanner b_input = new Scanner(System.in);
        Scanner c_input = new Scanner(System.in);


        System.out.println("\n");

        System.out.println("Enter side a: ");
        side_a = a_input.nextDouble();
        System.out.println("Enter side b: ");
        side_b = b_input.nextDouble();
        System.out.println("Enter side c: ");
        side_c = c_input.nextDouble();

        s = (side_a+side_b+side_c)/2;
        area = Math.sqrt(s*((s-side_a)*(s-side_b)*(s-side_c)));

        System.out.println("Area of triangle is: " + area);
    }
}
