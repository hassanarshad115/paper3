class student{
String name;
int rollno;
student(int r,String n)
{
name=n;
rollno=r;


}
/*
public void setname()
{name="hassan";}
public void setrollno()
{rollno=7;}
public String getname()
{return name;}
public int getrollno()
{return rollno;}
*/

public String toString()
{

    return "nameis"+name+"rollno is"+rollno;

}


}
public class GetSet {
    public static void main(String []args)
    {
    student sc=new student("hassan",7);
   // sc.setname();
   // sc.setrollno();
    
System.out.print(sc);
    //System.out.println(sc.getname());
    //System.out.println(sc.getrollno());
    
    
    
    
    }
    
}
