public class Main {
    public static void main(String[] args) {
        System.out.println("\nБуква и кодировка UTF-8\n");
        char bukva = 'a';
        for (int i = bukva; 'a' <= i && i <= 'z'; i++) {
            bukva = (char) i;
            System.out.print(bukva + " = " + (int) bukva + "\n");
        }

        System.out.println("\nБуква и кодировка UTF-8\n");
        char c2 = 'A';
        for (int i = c2; 'A' <= i && i <= 'Z'; i++) {
            char x = (char) i;
            System.out.print(x + " = " + (int) x + "\n");
        }

        System.out.println("\n\tРусский алфавит");
        System.out.println("Буква и кодировка UTF-8\n");
        char c3 = 'А';
        char c4 = 'а';
        for (int i = c3, i2 = c4; 'А' <= i && i <= 'Я' && 'а' <= i2 && i2 <= 'я'; i++, i2++) {
            char x = (char) i;
            char x2 = (char) i2;

            System.out.print(x + " = " + (int) x + " , " + x2 + " = " + (int) x2 + "\n");
        }
        System.out.println("\n------------------===========================------------------");
    }
}