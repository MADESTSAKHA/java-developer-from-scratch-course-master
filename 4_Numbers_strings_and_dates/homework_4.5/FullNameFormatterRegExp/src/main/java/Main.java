import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String text = input.replaceAll("[^а-яА-Я-]", " ");//Выбираем русс алфавит, ост меняем на space.
        String[] sentences = text.split("\\s+");                    //Разделяем текст на строки.

        if (sentences.length == 3) {                                      //Проверка на ФИО (Что нет лишнего).
            System.out.println("Фамилия: " + sentences[0]);
            System.out.println("Имя: " + sentences[1]);
            System.out.println("Отчество: " + sentences[2]);
        } else {
            System.out.println("Введенная строка не является ФИО");       //Все что не ФИО.
        }
    }
}