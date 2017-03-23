public class Queue {
    private int[] Object;
    private int front;
    private int rear;
    private int QueueSize;
    
    public Queue()
    {
        QueueSize = 3;
        Object    = new int[QueueSize];
        front     = -1;
        rear      = -1;
    }
    public void push(int data)
    {
        if((front+1)>=QueueSize)
        
            resize();
            Object[++front]=data;
        
    }
    
    public int pop()
    {
    if(front >rear)
    
        return Object[++rear]; 
    
    return 0;
    }
    
    public boolean IsEmpty()
    {
        return front <= rear; 
    }
    
    
    private void resize()
    {
        int temp[] = Object;
        QueueSize  = QueueSize*2;
        Object     = new int[QueueSize];
        for(int i=0; i<=front; i++)
        {
            Object[i] = temp[i];
        }
    }
}