class vehicle{
    int maxspeed;
    String fueltype;

    public vehicle(int maxspeed,String fueltype){
        this.maxspeed=maxspeed;
        this.fueltype=fueltype;
    }

    public void displaydetails(){
        System.out.println("maxspeed = "+maxspeed);
       System.out.println("fueltype = "+fueltype);
    }
}

class car extends vehicle{
    int seatcapacity;
    public car(int maxspeed,String fueltype,int seatcapacity){
        super(maxspeed,fueltype);
        this.seatcapacity=seatcapacity;

    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("seat capacity "+seatcapacity);
    }
    
}
class truck extends vehicle{
    String types;
    public truck(int maxspeed,String fueltype,String types){
        super(maxspeed, fueltype);
        this.types=types;
    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("type "+types);
    }
}
class motorcycle extends vehicle{

    String name;
    public motorcycle(int maxspeed,String fueltype,String name){
        super(maxspeed, fueltype);
        this.name=name;
        
    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("name "+name);
        
    }
}
public class TRa{
    public static void main(String[] args) {
       vehicle obj = new car(100, "petrol", 4);
       vehicle obj1 = new motorcycle(100, "petrol", "ducati");
       vehicle obj2=new truck(40, "diesel", "big");
       obj.displaydetails();
       System.out.println();
       obj1.displaydetails();
       System.out.println();
       obj2.displaydetails();
    }
}
class vehicle{
    int maxspeed;
    String fueltype;

    public vehicle(int maxspeed,String fueltype){
        this.maxspeed=maxspeed;
        this.fueltype=fueltype;
    }

    public void displaydetails(){
        System.out.println("maxspeed = "+maxspeed);
        System.out.println("fueltype = "+fueltype);
    }
}

class car extends vehicle{
    int seatcapacity;
    public car(int maxspeed,String fueltype,int seatcapacity){
        super(maxspeed,fueltype);
        this.seatcapacity=seatcapacity;

    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("seat capacity "+seatcapacity);
    }
    
}
class truck extends vehicle{
    String types;
    public truck(int maxspeed,String fueltype,String types){
        super(maxspeed, fueltype);
        this.types=types;
    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("type "+types);
    }
}
class motorcycle extends vehicle{

    String name;
    public motorcycle(int maxspeed,String fueltype,String name){
        super(maxspeed, fueltype);
        this.name=name;
        
    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("name "+name);
        
    }
}
public class K{
    public static void main(String[] args) {
       vehicle obj = new car(100, "petrol", 4);
       vehicle obj1 = new motorcycle(100, "petrol", "ducati");
       vehicle obj2=new truck(40, "diesel", "big");
       obj.displaydetails();
       System.out.println();
       obj1.displaydetails();
       System.out.println();
       obj2.displaydetails();
    }
}