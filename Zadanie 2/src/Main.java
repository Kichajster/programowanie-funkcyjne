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
        //wartość pierwiastka
        double x = 8.0;
        //najbliższa znana wartość
        double y = 2.0;

        double cubicRootResult = cubicRoot(x, y);
        System.out.println("Wynik pierwiastka sześciennego: " + cubicRootResult);

        double epsilon = 0.0001;
        double HeronMethodEpsilonResult = HeronMethodEpsilon(x, y, epsilon);
        System.out.println("Wynik metody Herona uzależnionej od Epsilonu: " + HeronMethodEpsilonResult);

        int steps = 10;
        double HeronMethodStepsResult = HeronMethodSteps(x, y, steps);
        System.out.println("Wynik metody Herona uzależnionej od ilości kroków: " + HeronMethodStepsResult);
    }
}
