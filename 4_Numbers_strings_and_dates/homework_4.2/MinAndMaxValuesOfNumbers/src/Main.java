import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nМинимальные отрицательные и максимальные положительные значения всех типов чисел.");
        System.out.println("\nЧисло: Byte, минимальное: " + Byte.MIN_VALUE + " и максимальное: " + Byte.MAX_VALUE);
        System.out.println("Число: Short, минимальное: " + Short.MIN_VALUE + " и максимальное: " + Short.MAX_VALUE);
        System.out.println("Число: Char, беззнаковое целое число, которое представляет собой UTF-16 (буквы или цифры)" + " минимальное: " + (int) Character.MIN_VALUE + ", максимальное: " + (int) Character.MAX_VALUE);
        System.out.println("Число: Integer, минимальное: " + Integer.MIN_VALUE + " и максимальное: " + Integer.MAX_VALUE);
        System.out.println("Число: Long, минимальное: " + Long.MIN_VALUE + " и максимальное: " + Long.MAX_VALUE);
        float a = -Float.MIN_VALUE;
        float b = Float.MAX_VALUE;
        BigDecimal decimalA = new BigDecimal(a);
        BigDecimal decimalB = new BigDecimal(b);
        System.out.println("Число: Float, \n\tминимальное: " + -Float.MIN_VALUE + " точнее: " + decimalA + "\n\tмаксимальное: " + Float.MAX_VALUE + " точнее: " + decimalB);
        double c = -Double.MIN_VALUE;
        double d = Double.MAX_VALUE;
        BigDecimal decimalC = new BigDecimal(c);
        BigDecimal decimalD = new BigDecimal(d);
        System.out.println("Число: Double, \n\tминимальное: " + -Double.MIN_VALUE + " точнее: " + decimalC + "\n\tмаксимальное: " + Double.MAX_VALUE + " точнее: " + decimalD);
    }
}