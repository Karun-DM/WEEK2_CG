class Empd{
    private int id;
    public void set(int id1){
        id=id1;
    }
    public int get(){
        return id;
    }
}
public class Encap{
    public static void main(String args[]){
        Empd obj=new Empd();
        obj.set(10);
        System.out.println(obj.get());
        
    }
    
}