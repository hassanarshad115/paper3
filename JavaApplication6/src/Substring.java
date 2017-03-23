
import java.util.*;
public class Substring {
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    String Fname,Lname,Finalname;
    Random r = new Random();
    System.out.println("Eneter First name:");
    Fname = scan.next();
    System.out.println("Eneter last name:");
    Lname = scan.next();
    while(Lname.length()<5)
    {
       System.out.println("Last name at least 5 letter long::");
       Fname = scan.next(); 
    }
    scan.close();
    Finalname = Fname.substring(0, 1) + Lname.substring(0, 5);
    System.out.println("Final name is:"+ Finalname);
}
}