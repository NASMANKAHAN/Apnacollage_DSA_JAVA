package RecursionBasics1;

public class practics {
    public static int calcSum(int i) {
        if (i == 1) {
            return 1;
        }
        int Snm1 = calcSum(i - 1);
        int Sn = i + Snm1;
        return Sn;
    }

    public static int fact(int i) {
        if (i == 0) {
            return 1;
        }
        int fnm1 = fact(i - 1);
        int fn = i * fact(i - 1);
        return fn;
    }

    // Calculate nth term in fibonacci
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        // System.out.println(calcSum(n));
        System.out.println(fib(n));
    }
}
