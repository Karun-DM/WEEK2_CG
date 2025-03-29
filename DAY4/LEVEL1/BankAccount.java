public class BankAccount {
    static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println(bankName + " | " + accountNumber + " | " + accountHolderName + " | $" + balance);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
        System.out.println("Deposited $" + amount + " | New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        System.out.println("Withdrawn $" + amount + " | New Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Alice", 5000);
        BankAccount acc2 = new BankAccount(1002, "Bob", 3000);

        acc1.displayDetails();
        acc2.displayDetails();
        acc1.deposit(1000);
        acc2.withdraw(500);

        getTotalAccounts();
    }
}
