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

    // Array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    // find the element in an array
    public static int firestOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firestOccurence(arr, key, i + 1);
    }

    // find the element in the array higest index
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;

        // return x * power(x, n-1);
    }

    public static int optimizedPower(int a, int n) { // 0(logn)
        if (n == 0) {
            return 1;
        }
        int halfPowerSq = optimizedPower(a, n / 2) * optimizedPower(a, n / 2);

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static int tilingProblem(int n) {// 2 x n (floor size)
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam
        // vertical choice
        int fnm1 = tilingProblem(n - 1);

        // horizontal choice
        int fnm2 = tilingProblem(n - 2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void removeDulicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDulicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDulicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void printBinStrings(int n, int lastPlace, String str) {
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }


        // kaam
        // if(lastPlace == 0){
        // // sit 0 on chair n
        // printBinStrings(n - 1, 0, str.append("0"));
        // printBinStrings(n - 1, 1, str.append("1"));
        // } else{
        // printBinStrings(n - 1, 0, str.append("0"));
        // }

        printBinStrings(n - 1, 0, str+"0");
        
        if(lastPlace == 0){
            printBinStrings(n - 1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 2, 2, 3, 4, 5, 5 };
        int a = 2;
        int b = 5;
        String str = "appnnacollege";
        // removeDulicates(str, 0, new StringBuilder(""), new boolean[26]);
        printBinStrings(3, 0, "");
        // System.out.println(optimizedPower(a, b));
        // System.out.println(tilingProblem(10));
        // System.out.println(calcSum(n));
        // System.out.println(fib(n));
        // System.out.println(isSorted(arr, 0));
        // System.out.println(lastOccurence(arr, 2, 0));
        // System.out.println(power(2, 2));
    }
}
