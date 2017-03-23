import java.util.*;
public class ComputeDistance {
    public static void main (String[] args)
    {
    Scanner scan = new Scanner(System.in);
    double x1,x2,y1,y2,distance;
    System.out.print ("Enter the 1st coordinates values: ");
    x1 = scan.nextDouble();
    y1 = scan.nextDouble();
    System.out.print ("Enter the 2nd coordinates values ");
    x2 = scan.nextDouble();
    y2 = scan.nextDouble();
    distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    System.out.println ("The distance is:"+ distance + ".");
    }  
}