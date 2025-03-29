class shop{
    private static int discount;


    private String productName;
    private int price;
    private int quantity;

    public shop(String productname,int price,int quantity){
        this.productName=productname;
        this.price=price;
        this.quantity=quantity;
    }
    public void displayDetails(){
        System.out.println(productName);
        System.out.println(price);
        System.out.println(quantity);
    }

    public void display(int discount){
        System.out.println(price-discount);
    }
}
public class Shopping{
    public static void main(String[] args) {
        shop obj = new shop("oreo", 10, 5);
        obj.displayDetails();
        shop.display(5);
        
    }
}