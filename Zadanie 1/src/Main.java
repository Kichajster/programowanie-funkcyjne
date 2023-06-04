public class Main {
    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static int squareOfSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum * sum;
    }

    public static void main(String[] args) {
        int n = 100;
        int sumOfSquaresResult = sumOfSquares(n);
        int squareOfSumResult = squareOfSum(n);

        System.out.println("Suma kwadratów: " + sumOfSquaresResult);
        System.out.println("Kwadrat sumy: " + squareOfSumResult);

        int result = squareOfSumResult - sumOfSquaresResult;
        System.out.println("Różnica wynosi: " + result);
    }
}
