class manage{
    static String companyName="capgemini";
    String name;
    String designation;
    final int id;
    static int count=0;

    public manage(String name,String designation,int id){
        this.name=name;
        this.designation=designation;
        this.id=id;
      
    }
    public void displayDetails(){
        System.out.println("name "+name);
        System.out.println("designation "+designation);
        System.out.println("id "+id);
        count++;
    }
     
    
    public static void cName(){
        System.out.println("company name "+companyName);
    }
    public void countsss(){
        System.out.println("count "+ count);
    }

}
public class Management{
    public static void main(String[] args) {
        manage obj = new manage("karun", "manager", 1234);
        manage obj2 = new manage("karuns", "managers", 12345);
        
        
        manage.cName();
        System.out.println();
         
        obj.displayDetails();
        obj2.displayDetails();
       
        obj.countsss();
         
        
       
    }
}