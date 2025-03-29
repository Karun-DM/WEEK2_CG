class Device{
    int id;
    String status;
    public Device(int id,String status){
        this.id=id;
        this.status=status;
    }
    public void display(){
        System.out.println(id);
        System.out.println(status);

    }
}
class thermostat extends Device{
    int tempsetting;
    public thermostat(int id,String status,int tempsetting){
        super(id,status);
        this.tempsetting=tempsetting;

    }
    public void display(){
        super.display();
        System.out.println(tempsetting);
    }
}
public class Sma{
    public static void main(String[] args) {
        Device obj = new thermostat(123, "ok", 18);
        obj.display();
        
    }
}