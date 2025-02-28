package RecursionBasics1;

public class Racursion {

    // public static void printDec(int n) {
    // if (n == 1) {
    // System.out.println(n);
    // return;
    // }
    // System.out.println(n + " ");
    // printDec(n - 1);
    // }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.println(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        // printDec(n);
        // printInc(n);
        System.out.println(fact(n));
    }
}