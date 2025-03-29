class Animal{
    String name;
    int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
        }
    public void sound(){
        System.out.println("animal sound");
    }
}
class bird extends Animal{
    public bird(String name,int age){
        super(name,age);
    }
    public void sound(){
        System.out.println("chip chip");
        
    }
}

class dog extends Animal{
    public dog(String name,int age){
        super(name,age);
    }
    public void sound(){
        System.out.println("bark");
    }
}
class cat extends Animal{
    public cat(String name,int age){
        super(name,age);
    }
    public void sound(){
        System.out.println("meow");
    }
}
public class Animalss{
    public static void main(String[] args) {
        Animal mydog=new dog("jerry", 5);
        Animal mycat=new cat("pose",3);
        Animal mybird=new bird("jack sparrow",17);
        mycat.sound();
        mydog.sound();
        mybird.sound();

    }
}