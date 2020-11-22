public class Main {
    public static void main(String[] args) {
        System.out.println("\nБуква и кодировка UTF-8\n");
        char c = 'a';
        for (int i = c; 'a' <= i && i <= 'z'; i++) {
            char x = (char) i;
            int code = (int) x;
            System.out.print(x + " = " + code + "\n");
        }
        System.out.println("\nБуква и кодировка UTF-8\n");
        char c2 = 'A';
        for (int i = c2; 'A' <= i && i <= 'Z'; i++) {
            char x = (char) i;
            int code = (int) x;
            System.out.print(x + " = " + code + "\n");
        }
        System.out.println("\n------------------===========================------------------");
    }
}