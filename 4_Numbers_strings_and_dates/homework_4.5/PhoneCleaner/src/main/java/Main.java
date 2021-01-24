import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String text = input.replaceAll("[^0-9]", "");//Выбираем русс алфавит, ост меняем на space.

    }
}

/*    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    String text = input.replaceAll("[^0-9]", "");//Выбираем русс алфавит, ост меняем на space.

        if (text.charAt(0) == '7' || text.charAt(0) == '8') {
                if (text.length() < 10 || text.length() > 11) {
        System.out.println("Неверный формат номера");
        } else {
        if (text.length() == 11 && text.charAt(0) == '8') {
        System.out.println(text.replace(text.charAt(0), '7'));
        } else {
        System.out.println(text);
        }
        }
        } else {
        if (text.length() == 10 && text.charAt(0) != '7' && text.charAt(0) != '8') {
        System.out.println("7" + text);
        } else {
        System.out.println("Неверный формат номера");
        }
        }*/

//        System.out.println("Неверный формат номера");
//        System.out.println(text);
