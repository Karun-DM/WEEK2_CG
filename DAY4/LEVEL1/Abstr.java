abstract class shape{
    abstract void area();

    public void display(){
        System.out.println("this is the shape");
    }

}
class circle extends shape{
    int radius;
    public circle(int radius){
        this.radius=radius;
    }
    public void area(){
        System.out.println(radius*radius);
    }
}
class rectangle extends shape{
    int radius;
    public rectangle(int radius){
        this.radius=radius;
    }
    public void areas(){
        System.out.println(radius*radius*radius);
    }
}
public class Abstr{
    public static void main(String[] args) {
        shape obj = new circle(2);
        obj.display();
        obj.area();
        System.out.println();
        
        
    }
}