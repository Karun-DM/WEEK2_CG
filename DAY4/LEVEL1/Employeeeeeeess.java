class Employee{
    String name;
    int id;
    int salary;

    public Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displaydetails(){
        System.out.println("emplyoee id "+ id);
        System.out.println("emplyoee name "+ name);
        System.out.println("emplyoee salary "+ salary);
    }
}
class manager extends Employee{
    int size;
    public manager(String name,int id,int salary,int size){
        super(name, id, salary);
        this.size=size;
    }
    public void displaydetails(){

        super.displaydetails();
        
        System.out.println("team size "+size);
         
        
    }
}
class developer extends Employee{
    String language;
    public developer(String name,int id,int salary,String language){
        super(name, id, salary);
        this.language=language;
         
        
    }
    public void displaydetails(){
        super.displaydetails();
        
        
        System.out.println("lang "+language);
         
        
    }
}
class intern extends Employee{
    int training_period;
    public intern(String name,int id,int salary,int training_period){
        super(name, id, salary);
        this.training_period=training_period;
        
    }
    public void displaydetails(){
        super.displaydetails();
        
        
        System.out.println("trainingperiod "+training_period);
         
        
    }
}
public class Employeeeeeeess{
    public static void main(String[] args) {
        Employee obj = new manager("dinkaran", 10, 20000, 05);
        Employee obj1 = new developer("jawa/bhuvi", 5, 450000, "java");
        Employee obj2 = new intern("karun",3,2000,5);
        obj.displaydetails();
        System.out.println();
        obj1.displaydetails();
        System.out.println();
        obj2.displaydetails();


    }
}




















 
