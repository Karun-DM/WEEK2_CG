class Vehicles{
    private static int registrationFee=2000;
    String ownerName;
    String vehicleType;
    int RegNo;
    public Vehicles(String ownerName,String vehicleType,int RegNo){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.RegNo=RegNo;
    }
    public void display(){
        System.out.println(ownerName);
        System.out.println(vehicleType);
        System.out.println(RegNo);
    }
    public static void access(){
        System.out.println(registrationFee);
    }
}
public class Vehicl{
    public static void main(String[] args) {
        Vehicles obj = new Vehicles("bhuvi", "audi", 9999);
        Vehicles obj2 = new Vehicles("vijay", "rollsroyce", 9998);

        obj.access();
        System.out.println();
        obj.display();
        System.out.println();
        obj2.display();
    }
}








 