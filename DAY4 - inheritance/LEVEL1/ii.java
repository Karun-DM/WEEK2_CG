abstract class Animal{
    abstract void sound();

    void eat(){
        System.out.println("anything");
    }
}

class dog extends Animal{
    void sound(){
        System.out.println("bark");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("meow");
    }
}

public class ii{
    public static void main(String[] args) {
        Animal obj = new dog();
        obj.sound();
        Animal obj2 = new cat();
        obj2.sound();



            
        
    }
}