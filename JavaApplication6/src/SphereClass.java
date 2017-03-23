import java.util.*;
public class SphereClass {
    public static void main(String[] args)
    {
        double radius,area, volume;
        Scanner scan = new Scanner(System.in);
        System.out.print("Eneter Radius:");
        radius = scan.nextDouble();
        volume = 4/3 * Math.PI*Math.pow(radius, 3);
        area   = 4/3 * Math.PI*Math.pow(radius, 2);
        System.out.print("Area is      :");
        System.out.print("Volume is    :");
    }
}