import java.util.*;
public class MainQueue {
    public static void main(String[] args)
    {
        int a,b,c;
        Queue q1 = new Queue();
        Scanner input = new Scanner(System.in);
        System.out.println("Push Element:");
        a = input.nextInt();
        System.out.println("Push Element");
        b = input.nextInt();
        System.out.println("Push Element");
        c = input.nextInt();
        q1.push(a);
        System.out.println(q1.pop());
        q1.push(b);
        System.out.println(q1.pop());
        q1.push(c);
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.pop());
     
        
    }
    
}