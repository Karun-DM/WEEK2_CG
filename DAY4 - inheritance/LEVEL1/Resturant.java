class Person{
    protected String name;
    protected int id;

    Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void displaydetails(){
        System.out.println("id "+id+" name "+name);
    }
}

interface worker{
    void performduties();
}

class Chef extends Person implements worker{
    public Chef(String name,int id){
        super(name, id);
    }
    public void performduties(){
        System.out.println("is cooking for guests");
    }

}
class waiter extends Person implements worker{
    public waiter(String name,int id){
        super(name, id);
    }
    public void performduties(){
        System.out.println("is serving");
    }
}
public class Resturant{
    public static void main(String[] args) {
        Chef obj=new Chef("karun", 123);
        waiter obj1=new waiter("bhuvi", 1234);
        obj.displaydetails();
        obj.performduties();
        System.out.println();
        obj1.displaydetails();
        obj1.performduties();

    }
}