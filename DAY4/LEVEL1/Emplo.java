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
        System.out.println("team size "+size);
    }
}
class developer extends Employee{
    String language;
    public developer(String name,int id,int salary,String language){
        super(name, id, salary);
        System.out.println("lang? "+language);
    }
}
class intern extends Employee{
    int training_period;
    public intern(String name,int id,int salary,int training_period){
        super(name, id, salary);
        System.out.println("training period??? "+training_period);
    }
}
public class Employeeess{}

























public class Employeeess {
    
}
