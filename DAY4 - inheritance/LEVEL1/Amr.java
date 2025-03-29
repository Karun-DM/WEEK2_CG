class Student{
    static String universitName="SRM";
    String name;
    final int rollNo;
    String grade;
    public Student(String name,int rollNo,String grade){
        this.grade=grade;
        this.name=name;
        this.rollNo=rollNo;
    }

    public void display(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(grade);
    }
    public static void access(){
        System.out.println(universitName);
    }
}
public class Amr{
    public static void main(String[] args) {
        Student obj = new Student("bhuvi", 123, "A");
        obj.access();
        System.out.println();
        obj.display();
        
    }
}
