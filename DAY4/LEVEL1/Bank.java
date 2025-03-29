class BankAccount{
    int accountNumber;
    int balance;
    public BankAccount(int accountNumber,int balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    
    }
    public void displaydetails(){
        System.out.println("accountNumber "+accountNumber);
        System.out.println("balance "+balance);
    }
}
class SavingsAccount extends BankAccount{
    int intrestRate;
    public SavingsAccount(int accountNumber,int balance,int intrestRate){
        super(accountNumber, balance);
        this.intrestRate=intrestRate;

    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("intrestarte "+intrestRate);
    }
}

class CheckingAccount extends BankAccount{
    int withdraw;
    public CheckingAccount(int accountNumber,int balance,int withdraw){
        super(accountNumber, balance);
        this.withdraw=withdraw;

    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("withdraw "+withdraw);
    }
}
class FixedDeposit extends BankAccount{
    int principal;
    public FixedDeposit(int accountNumber,int balance,int principal){
        super(accountNumber, balance);
        this.principal=principal;

    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("principal "+principal);
    }
}

public class Bank{
    public static void main(String[] args) {
        BankAccount obj = new SavingsAccount(12000, 100, 05);
        BankAccount obj1 = new CheckingAccount(12000, 100, 555);
        BankAccount obj2 = new FixedDeposit(12000, 100, 1000000);
        obj.displaydetails();
        System.out.println();
        obj1.displaydetails();
        System.out.println();
        obj2.displaydetails();
    }
}