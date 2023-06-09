import java.math.BigInteger;
public class Main {

    //Punkt A
    public static int fib(int n) {
        if (n < 2)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    //Punkt B
    public static int fibIter(int j) {
        int a = 0;
        int b = 1;
        while (j != 0) {
            int temp = a;
            a = b;
            b = temp + b;
            j--;
        }
        return a;
    }

    public static int fib2(int j) {
        return fibIter(j);
    }

    //Punkt C
    public static BigInteger fibIter3(BigInteger a, BigInteger b, int count) {
        if (count == 0)
            return a;
        else
            return fibIter3(b, a.add(b), count - 1);
    }

    public static BigInteger fib3(int n) {
        return fibIter3(BigInteger.ZERO, BigInteger.ONE, n);
    }

    public static void main(String[] args) {
        //Punkt A
        int result = fib(5);
        System.out.println("Wynik dla punktu A: " + result);

        /* Dla n <= 2 wynik będzie równy 1, ponnieważ fib(0)+fib(-1) oraz fib(1)+fib(0) = 1
        Dla n > 2 wynik wynosi fib(n-1) + fib(n-2)
        Przykład: n = 7; fib(7-1) = 6, fib(6) = 8; fib(7-2) = 5, fib(5) = 5
        fib(6)+fib(5) = 8+5 = 13*/

        //Punkt B
        int result2 = fib2(10);
        System.out.println("\nWynik dla punktu B: " + result2);

        //Punkt C
        System.out.println("\nWynik dla punktu C (fib(10000)): " + fib3(10000));

        BigInteger fib100 = new BigInteger("354224848179261915075");
        System.out.println("Czy fib(100) zostało poprawnie obliczone? " + fib3(100).equals(fib100));

    }
}
