public class Main {
    public static double cubicRoot(double x, double y) {
        return (x / (y * y) + 2 * y) / 3;
    }

    public static double HeronMethodEpsilon(double x, double y, double epsilon) {
        while (Math.abs(y - cubicRoot(x, y)) >= epsilon) {
            y = cubicRoot(x, y);
        }
        return y;
    }

    public static double HeronMethodSteps(double x, double y, int steps) {
        for (int i = 0; i < steps; i++) {
            y = cubicRoot(x, y);
        }
        return y;
    }

    public static void main(String[] args) {

        System.out.println("Wynik pierwiastka sześciennego: " + cubicRoot(27, 3));

        System.out.println("Wynik metody Herona uzależnionej od Epsilonu: " + HeronMethodEpsilon(27,3,0.001));

        System.out.println("Wynik metody Herona uzależnionej od ilości kroków: " + HeronMethodSteps(27,3,10));
    }
}
