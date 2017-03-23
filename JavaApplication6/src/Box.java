public class Box {
    private double height;
    private double width;
    private double depth;
    private boolean full;//status of box
            
    public Box(double h,double w, double d, boolean f)
    {
     
         height = h;
         width = w;
         depth = d;
         full = f;
    }
    
    public void setHeigth(double hi)
    {
        height = hi;
    }
    
     public void setWidth(double wi)
    {
        width = wi;
    }
     
      public void setDepth(double de)
    {
        depth = de;
    }
      
       public double getHeigth()
    {
        return height;
    }
       public double getWidth()
    {
        return width;
    }
       public double getDepth()
    {
        return depth;
    }
       
       public  void setFull(boolean b)
       {
           full = b;
       }
       public  boolean getFull()
       {
           
           return full;
       }
       public String toString()
       {
           String Result ="Heigth of Box is:"+getHeigth()+"Width is:"+getWidth()+
                   "Depth od Box is:"+getDepth()+"And Status is:"+getFull();
           String Result1 = (getFull()==true?"  Full":"Empty");
   Result= Result+Result1;
            return Result;
       }
}