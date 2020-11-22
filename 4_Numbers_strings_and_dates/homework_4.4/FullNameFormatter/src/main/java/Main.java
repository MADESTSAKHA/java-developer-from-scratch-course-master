import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Введите ФИО: ");
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      System.out.println("Введенная строка не является ФИО");
      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
    }
  }
}