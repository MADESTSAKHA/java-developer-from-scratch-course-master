// https://metanit.com/java/tutorial/7.4.php
// https://urvanov.ru/2016/06/08/java-8-регулярные-выражения/
// https://www.youtube.com/watch?v=_pLpx6btq6U&ab_channel=WebDevснуля.КаналАлексаЛущенко
// https://www.youtube.com/watch?v=uwBAqC1PRDM&ab_channel=dmdev
// https://regex101.com/
// Можно использовать регулярные выражения в "INTELLIJ IDEA" - "Ctrl + F" далее "Alt + X".
//                                     Для замены найденного - "Ctrl + R"
//                                          Или "Ctrl + Shift + R"

//FIXME Давайте напишем регулярку, которая будет учитывать все ваши проверки (ну или сколько сможете),
// а именно длину, начальный символ, знаки и тд. Предлагаю это в качестве тренировки по регулярным выражениям)

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

//  Pattern p = Pattern.compile("^\\d{10,11}$");
//                                                Шаблон поиска, только первые 10-11 цифр, ост "Неверный формат номера"
//  Pattern p = Pattern.compile("^[7]");
//                                                Шаблон поиска, только первой цифры 7 в тексте.
//  Pattern p = Pattern.compile("^\d{1,9}$|^\d{12,20}$");
//                                                Шаблон поиска, только до 9 и от 12 цифр в номере.
//  Pattern p = Pattern.compile("^[^78]\d{10,11}");
//                                                Шаблон поиска, только НЕ цифры 7 и 8 в тексте.
// ^\\d{1,9}$|^\\d{12,20}$|^[^78]\\d{10,11}"      Тут ежу понятно! (Лентяйство взяло верх!)
// ^8\d{10}$                                      Шаблон поиска, первая 8 из 11 цифр.
// ^\d{10}$                                       Шаблон поиска, ищем 10 цифр.

public class Main {
    public static void main(String[] args) {
//  TODO Тест №7 - Попытка сократить код.
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            } else {
                //TODO:напишите ваш код тут, результат вывести в консоль.
                String extractedDigits = input.replaceAll("\\D", ""); //Удаление всего кроме цифр.

                Pattern pattern = Pattern.compile(extractedDigits.replaceAll("^\\d{1,9}$|^\\d{12,20}$|^[^78]" + //+ <-- тут какая-то линия, что то подсказывает что нельзя выходить за нее!
                        "\\d{10,11}","Неверный формат номера"));               //Шаблон поиска
                Pattern pattern2 = Pattern.compile("^8\\d{10}$");               //Шаблон поиска2

                Matcher matcher = pattern.matcher(extractedDigits);                   //Где искать.
                Matcher matcher2 = pattern2.matcher(extractedDigits);                   //Где искать.

                if (matcher.find()) {
                    if (matcher2.find()) {
                        System.out.println(extractedDigits.replaceAll("^[8]", "7"));
                    } else {
                        System.out.println(extractedDigits.replaceAll("^\\d{10}$",
                                "7" + extractedDigits));
                    }
                } else {
                    System.out.println("Неверный формат номера");
                }
            }
        }
    }
}

/*
//  TODO Тест №6 - работает.
    Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            } else {
                //TODO:напишите ваш код тут, результат вывести в консоль.
                String extractedDigits = input.replaceAll("\\D", ""); //Удаление всего кроме цифр.
                String replaceDigits = extractedDigits.replaceAll("^\\d{1,9}$|^\\d{12,20}$|^[^78]\\d{10,11}",
                        "Неверный формат номера");
                String replaceDigits2 = extractedDigits.replaceAll("^\\d{10}$", "7" + extractedDigits);
                String replaceDigits3 = "^8\\d{10}$";

                Pattern p = Pattern.compile(replaceDigits);               //Шаблон поиска
                Pattern p2 = Pattern.compile(replaceDigits3);               //Шаблон поиска2

                Matcher m = p.matcher(extractedDigits);                   //Где искать.
                Matcher m2 = p2.matcher(extractedDigits);                   //Где искать.

                if (m.find()) {
                    if (m2.find()) {
                        System.out.println(extractedDigits.replaceAll("^[8]", "7"));
                    } else {
                        System.out.println(replaceDigits2);
                    }
                } else {
                    System.out.println("Неверный формат номера");
                }
            }
        }
    }
}
*/

/*
//  TODO Тест №5
    Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            } else {
                //TODO:напишите ваш код тут, результат вывести в консоль.
                String extractedDigits = input.replaceAll("\\D", "");
                String replaceDigits = extractedDigits.replaceAll("^\\d{1,9}$|^\\d{12,20}$|^[^78]\\d{10,11}",
                        "Неверный формат номера");
                String replaceDigits2 = extractedDigits.replaceAll("^\\d{10}$",
                        "7" + extractedDigits);

                Pattern p = Pattern.compile(replaceDigits);               //Шаблон поиска
                Matcher m = p.matcher(extractedDigits);                   //Где искать.
                if (m.find()) {
                    System.out.println(replaceDigits2);
                } else {
                    System.out.println("Неверный формат номера");
                }
            }
        }
    }
}
*/

/*
//  TODO Тест №4
    Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            } else {
                //TODO:напишите ваш код тут, результат вывести в консоль.
                String extractedDigits = input.replaceAll("\\D", "");
                Pattern p = Pattern.compile("^\\d{10,11}$"); //Шаблон поиска
                Matcher m = p.matcher(extractedDigits);                   //Где искать.
                if (m.find()) {
                    System.out.println(extractedDigits);
                } else {
                    System.out.println("Неверный формат номера");
                }
            }
        }
    }
}
*/

/*
//  TODO Тест №3
    Scanner scanner = new Scanner(System.in);

    while (true) {
        String input = scanner.nextLine();
        if (input.equals("0")) {
            break;
        } else {
            //TODO:напишите ваш код тут, результат вывести в консоль.
            String extractedDigits = input.replaceAll("\\D", "");
            Pattern p = Pattern.compile("^[7]");   //Шаблон поиска, только первой цифры 7 в тексте
            Matcher m = p.matcher(extractedDigits);                   //Где искать.
            if (m.find()) {
                System.out.println(extractedDigits);
            } else {
                System.out.println("Неверный формат номера");
            }
        }
    }
*/

/*
//  TODO Тест №2
    Pattern p = Pattern.compile("\\d");     //Шаблон поиска, только цифры
    Matcher m = p.matcher(input);           //Где искать.
            while (m.find()) {
                    System.out.print(m.group());        //Вывод найденного!
                    }
*/

/*
//  TODO Тест №1
    String extractedDigits = input.replaceAll("\\D", ""); // можно: ("[^0-9]", "")
    //We select only numbers, change the rest to a space.
    System.out.println(extractedDigits);
*/

/*
//  TODO Вариант №1 - работает!
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
*/