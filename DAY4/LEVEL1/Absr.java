abstract class car{
    abstract void drive();
    String type;
    public car(String type){
        this.type=type;
    }
    public void display(){
        System.out.println("cars");
    }
    
    
}
class sec extends car{
    public sec(String type){
    super(type);
    }

    public void drive(){
        System.out.println("drive");
    }
}
public class Absr{
    public static void main(String[] args) {
        car obj = new sec("kk");
        obj.display();
        obj.drive();
    }
}
