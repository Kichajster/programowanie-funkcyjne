import java.math.BigInteger;

public class Main {

    //Punkt A
    public static int fib(int n) {
        if (n <= 2) return 1;
        else return fib(n - 1) + fib(n - 2) + 1;
    }

    //Punkt B
    public static long fib2 (int n) {
        return fibIterHelper2(0, 1, n);
    }

    public static long fibIterHelper2(long a, long b, int j) {
        if (j == 0)
            return a;
        else
            return fibIterHelper2(b, a + b, j - 1);
    }

    //Punkt C
    public static BigInteger fibIterHelper3(BigInteger a, BigInteger b, int count) {
        if (count == 0) return a;
        else return fibIterHelper3(b, a.add(b), count - 1);
    }

    public static BigInteger fib3(int n) {
        return fibIterHelper3(BigInteger.ZERO, BigInteger.ONE, n);
    }

    public static void main(String[] args) {
        //Punkt A
        System.out.println("Wynik dla punktu A: " + fib(5));

        /* Dla n <= 2 wynik będzie równy 1, ponnieważ fib(0)+fib(-1) oraz fib(1)+fib(0) = 1
        Dla n > 2 wynik wynosi fib(n-1) + fib(n-2) + 1*/


        //Punkt B
        System.out.println("\nWynik dla punktu B: " + fib2(10));

        //Punkt C
        System.out.println("\nWynik dla punktu C (fib(10000)): " + fib3(10000));

    }
}
