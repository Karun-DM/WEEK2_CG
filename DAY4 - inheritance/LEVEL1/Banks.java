class details{
    static String name="icici";
    static int accountcount=0;

    final int accountnumber;
    private int balance;
    String nameOFcustomer;

    public details(int accountnumber,int balance, String nameOFcustomer){
        this.accountnumber=accountnumber;
        this.balance=balance;
        this.nameOFcustomer=nameOFcustomer;
    }

    public  void displayDetails(){
        System.out.println(accountnumber);
        System.out.println(balance);
        System.out.println(nameOFcustomer);
        accountcount++;
    }

    public static void getTotalAccounts(){
        System.out.println("account count "+accountcount);
    }
    public void deposit(int deposits){
        System.out.println("deposit "+(balance+deposits));
    }


}
public class Banks{
    public static void main(String[] args) {
        details obj = new details(12344444, 322333, "karun");
        details obj2 = new details( 44444, 3, "bhuvi");
        details obj3 = new details( 13232, 300, "opopoui");
        obj.displayDetails();
        obj.deposit(10000000);
        System.out.println();
        obj2.displayDetails();
        obj.deposit(10000000);
        obj3.displayDetails();
        System.out.println();
        obj3.getTotalAccounts();
    }
}