class Course{
    int duration;
    String coursename;
    public Course(int duration,String coursename){
        this.duration=duration;
        this.coursename=coursename;

    }
    public void displaydetails(){
        System.out.println("duration "+duration);
        System.out.println("course name "+coursename);
    }
}

class OnlineCourse extends Course{
    String platform;
    boolean recorded;
    public OnlineCourse(int duration,String coursename,String platform,boolean recorded){
        super(duration,coursename);
        this.platform=platform;
        this.recorded=recorded;
    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("platform "+platform);
        System.out.println("recrder "+recorded);
    }
}
class PaidCourse extends OnlineCourse{
    int fee;
    int discount;
    public PaidCourse(int duration,String coursename,String platform,boolean recorded,int fee,int discount){
        super( duration,coursename,platform,recorded);
        this.fee=fee;
        this.discount=discount;
    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("fee? "+fee);
        System.out.println("discount "+discount);
    }
}
 
 
public class Educ{
    public static void main(String[] args) {
        Course obj=new PaidCourse(05, "ML", "GUVI", false, 5000, 1200);
        obj.displaydetails();
    }
}