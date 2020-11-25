import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            for (int i = 0; i < input.length(); i++) {
                int spaceIndex3 = input.length() - input.replaceAll(" ", "").length(); //Поиск Space(ов)
                if (Character.isDigit(input.charAt(i)) || spaceIndex3 == 0 || spaceIndex3 == 3) {    //проверка на Space
                    System.out.println("Введенная строка не является ФИО");
                    break;
                }
                if (i % input.length() == 0) {
                    int spaceIndex = input.indexOf(' ');
                    int spaceIndex2 = input.lastIndexOf(' ');

                    String surname = input.substring(0, spaceIndex).trim();
                    String name = input.substring(spaceIndex, spaceIndex2).trim();
                    String middleName = input.substring(spaceIndex2 + 1).trim();

                    System.out.println("Фамилия: " + surname);
                    System.out.println("Имя: " + name);
                    System.out.println("Отчество: " + middleName);
                }
            }
        }
    }
}