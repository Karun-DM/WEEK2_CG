class GOAT{
    String name;
    String status;
    public GOAT(String name,String status){
        this.name=name;
        this.status=status;

    }
    void display(){
        System.out.println(name+" "+status);
    }
}
class got extends GOAT{
    int ranking;
    public got(String name,String status,int ranking){
    
    super(name,status);
    this.ranking=ranking;
}
}
public class Emps{
    public static void main(String[] args) {
        
        got obj=new got(null, null, 0)
    }
}
