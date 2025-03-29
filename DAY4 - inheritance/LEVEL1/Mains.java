class Student{
    private String name;
    private int age;
    public String get(){
        return name;
    }



    public void set(String newName){
        name=newName;
    }
    public int getA(){
        return age;
    }
    public void setA(int newage){
        age=newage;
    }

}
public class Mains{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.set("karun");
        obj.setA(34);
        System.out.println(obj.get());
        System.out.println(obj.getA());
    }
}

    