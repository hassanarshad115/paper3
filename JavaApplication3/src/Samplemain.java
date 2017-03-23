//tostring ma agr phly constructor ma he value dy d jay to nchy to string ma sirf gename sy phly name is ""
//"" ismy likh dy q k phly he constructor ma value dy chuky hain r main class ma tw obj bna kr 
//just obj ko chla dy
//......................
//agr constructor ma value ni d to nchy set r get wala portion jb bnaty hain to set ma beshak
//sbsy phly set ma value na d gye ho fr b nchy set waly portion ma value dy skty hain
//last work agr constructor r set k zrye value ni d to tostrin m phly "the name is hassan"+name
//asy b kr skty hain
//string toString waly portion ma phly jo oper veriables lye ho inhy String ha to string k saath
//agr int ha to int k sath declare kary 
//fr return k agy get k sath hr ak ko ouTPUT
public class Samplemain {
    public static void main(String []args)
    {
        Sample s2=new Sample();//for tostring method
        System.out.println(s2);//for tostring method
        System.out.println();
        System.out.println();

    Sample s=new Sample();
    s.setname("Amir jamshaid");
    s.setdepartment("computer science");
    s.setdesignation("head of department");
    s.setsalary(100000);
    
    System.out.println("the name is= \t"+s.getname());
    System.out.println("the department is=\t"+s.getdepartment());
    System.out.println("designation is=\t"+s.getdesignation());
    System.out.println("salary of hod is=\t"+s.getsalary());
    
    
    
    }
    
}