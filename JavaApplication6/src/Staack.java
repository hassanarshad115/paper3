
        import java.util.*;
 
 public class Staack {
 
     static int item, top = -1, size, stack[], choice;
     static Scanner input = new Scanner(System.in);
 
     public static void main(String[] args) {
          System.out.println("Enetr Size of Stack:");
         Staack.size = Staack.input.nextInt();
         Staack.stack = new int[size];
         while (true) {
             System.out.println("1:Push");
             System.out.println("2:Pop");
           System.out.println("3:Display");
            System.out.println("4:Quit");
              System.out.print("Eneter your choice:");
             Staack.choice = Staack.input.nextInt();
 
             switch (choice) {
                 case 1:
                     Staack.Push();
                     break;
                 case 2:
                     Staack.Pop();
                     break;
                 case 3:
                     Staack.Display();
                     break;
                 case 4:
                     Staack.Quit(1);
                 default:
                     System.out.print("Invalid Choice\t");
             }
         }
 
     }
 
     private static void Quit(int i) {
         // TODO Auto-generated method stub
 
     }
 
     static void Push() {
         if (top == size) {
             System.out.println("Stack overflow");
         } else {
             ++top;
             System.out.println("Push an element:");
             Staack.item = Staack.input.nextInt();
             Staack.stack[top] = Staack.item;
         }
     }
 
     static void Pop() {
         if (top == -1) {
             System.out.println("Stack underflow");
         } else {
 
             Staack.item = Staack.stack[top];
             System.out.println("poped Element:" + Staack.item);
             top--;
         }
     }
 
     static void Display() {
         if (top == -1) {
             System.out.println("Stack empty");
         } else {
 
             System.out.println("Elements in stack are:");
             for (int i = top; i >= 0; i--) {
                 System.out.println(Staack.stack[i]);
             }
         }
     }
 }