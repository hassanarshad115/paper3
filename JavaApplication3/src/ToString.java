
public class ToString {
    //drived class ha ye //is breket m veriables declare hoty hai
    private  String name;
    private String department;
    private String designation;
    private int salary;
    public ToString() //constructor create q k return type ni ha r class k name jsa h
    {            //value initialize
    name="";
    department="";
    designation="";
    salary=0      ;
    
    }
    public int getsalary()
    {
    return salary;
    }
    public String getdesignation()
    {
    return designation;
    }
    public String getdepartment()
    {
    
    return department;
    }
    public String getname()
    {
    return name;
    }
    public String toString()
    {
  
    //now for return/output statement
    //hr veriable ko get k sath lgaygy jsy nchy d hoe ha
    
    return "the name is= hassan \t"+getname()+"the department is= MCS \t"+getdepartment()
            +"designation is=HOD \t"
            +getdesignation() +"salary is=5000 \t"+getsalary();
           
    //tostring sirf return krwany k lye hota ha
    
    
    
    
    }
    
}
