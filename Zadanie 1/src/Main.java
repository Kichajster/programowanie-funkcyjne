import java.util.stream.LongStream;

public class Main {
    public static long sumOfSquares(long n) {
        return LongStream.rangeClosed(1, n)
                .map(a -> a * a)
                .sum();
    }

    public static long squareOfSum(long n) {
        long sum = LongStream.rangeClosed(1, n)
                .sum();
        return sum * sum;
    }

    public static void main(String[] args) {
        System.out.println("Różnica wynosi: " + (squareOfSum(100) - sumOfSquares(100)));
    }
}
