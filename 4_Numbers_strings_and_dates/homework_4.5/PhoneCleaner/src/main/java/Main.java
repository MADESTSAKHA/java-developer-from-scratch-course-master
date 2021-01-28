import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            //TODO:напишите ваш код тут, результат вывести в консоль.
            String text = input.replaceAll("[^0-9]", "");
            //We select only numbers, change the rest to a space.
            System.out.println(text);
        }
    }
}

/*
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String text = input.replaceAll("[^0-9]", "");
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
        }
    }
}
*/