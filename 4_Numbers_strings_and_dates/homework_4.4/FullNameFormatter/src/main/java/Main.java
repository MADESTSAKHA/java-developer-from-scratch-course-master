/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            //TODO:напишите ваш код тут, результат вывести в консоль.
            //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
        }
    }
}*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while (true) {
        String input = scanner.nextLine();

        int spaceIndex = input.indexOf(' ');
        int spaceIndex2 = input.lastIndexOf(' ');

        String surname = input.substring(0, spaceIndex).trim();
        String name = input.substring(spaceIndex, spaceIndex2).trim();
        String middleName = input.substring(spaceIndex2 + 1).trim();

        if (input.equals("0")) {
            System.out.println("Введенная строка не является ФИО");
        }

        //TODO:напишите ваш код тут, результат вывести в консоль.
        //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + middleName);
    }
}