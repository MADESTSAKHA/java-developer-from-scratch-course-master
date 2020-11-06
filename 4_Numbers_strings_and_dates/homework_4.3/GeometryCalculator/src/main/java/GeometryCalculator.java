public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        return Math.PI * Math.pow(radius, 2); // или так: return Math.PI * radius * radius;
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        return 4.0 / 3.0 * Math.PI * Math.pow(Math.abs(radius), 3); // или так: return 4.0 / 3.0 * Math.PI * Math.abs(radius * radius * radius);
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        if (isTrianglePossible(a, b, c)) {
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else
            System.out.println("Треугольник невозможен!");
        return -1;
    }
}

/**
 * Mart.pow(3, 2) = Число 3 в квадрате равно 9
 * Mart.pow(5, 2) = Число 5 в квадрате равно 25
 * <p>
 * Math.abs(-8) = 8, любое число с минусом "-" - делает положительным т.е: с плюсом "+".
 */