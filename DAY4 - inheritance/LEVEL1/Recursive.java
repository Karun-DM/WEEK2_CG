public class Recursive {
    public static void nat(int n) { // Recursive function
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(n);
            nat(n - 1);
        }
    }

    public static void main(String[] args) {
        nat(10); // Calling the recursive function
    }
}
