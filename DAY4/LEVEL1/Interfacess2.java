class Vehicle{
    int maxpseed;
    String model;
    public Vehicle(int maxpseed,String model){
        this.maxpseed=maxpseed;
        this.model=model;
    }
    public void display(){
        System.out.println(maxpseed);
        System.out.println(model);
    }
}
interface  Refuelable  {
    void refuel();
}
class  petrol extends Vehicle implements Refuelable{
    public petrol(int maxpseed,String model){
        super(maxpseed,model);
    }
    public void display(){
        super.display();
    }
    public void refuel(){
        System.out.println("refeul it");
    }
}

class  ElectricVehicle extends Vehicle{
    public ElectricVehicle(int maxpseed,String model){
        super(maxpseed,model);
    }
    public void display(){
        super.display();
    }
    public void charge(){
        System.out.println("charge it");
    }
}

public class Interfacess2 {
    public static void main(String[] args) {
        ElectricVehicle obj = new ElectricVehicle(89, "FERRARI");
        petrol obj2 = new petrol(890, "F1");
        obj.display();
        obj.charge();
        System.out.println();
        obj2.display();
        obj2.refuel();
        
    }
    
}












