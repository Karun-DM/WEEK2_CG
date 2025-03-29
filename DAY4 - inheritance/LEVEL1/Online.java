class Order{
    int order_id;
    String order_date;
    public Order(int order_id,String order_date){
        this.order_date=order_date;
        this.order_id=order_id;

    }
    public void displaydetails(){
        System.out.println("date "+order_date);
        System.out.println("order id "+order_id);
    }
}

class ShippedOrder extends Order{
    int trackingNumber;
    public ShippedOrder(int order_id,String order_date,int trackingNumber){
        super(order_id, order_date);
        this.trackingNumber=trackingNumber;
    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("trackingNumber "+trackingNumber);
    }
}
class DeliverOrder extends ShippedOrder{
    int deleverydate;
    public DeliverOrder(int order_id,String order_date,int trackingNumber,int deleverydate){
        super(order_id, order_date,trackingNumber);
        this.deleverydate=deleverydate;
    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("delevery date"+deleverydate);
    }
}
public class Online{
    public static void main(String[] args) {
        DeliverOrder obj=new DeliverOrder(05, "12-03-2009", 1234123, 9023904);
        obj.displaydetails();
    }
}