public class QueueAssigment {
 private static final int capacity = 3;
 int arr[] = new int[capacity];
 int size = 0;
 int top = -1;
 int rear = 0;

 public void push(int pushedElement) {
  if (top < capacity - 1) {
   top++;
   arr[top] = pushedElement;
   System.out.println("Element " + pushedElement
     + " is pushed to Queue !");
   display();
  } else {
   System.out.println("Overflow !");
  }

 }

 public void pop() {
  if (top >= rear) {
   rear++;
   System.out.println("Pop operation done !");
   display();
  } else {
   System.out.println("Underflow !");
  }
 }

 public void display() {
  if (top >= rear) {
   System.out.println("Elements in Queue : ");
   for (int i = rear; i <= top; i++) {
    System.out.println(arr[i]);
   }
  }
 }

 public static void main(String[] args) {
  QueueAssigment queue = new QueueAssigment();
  queue.pop();
  queue.push(1);
  queue.push(1);
  queue.push(1);
  queue.push(1);
  queue.pop();
  queue.pop();
  queue.pop();
  queue.pop();
 }

}