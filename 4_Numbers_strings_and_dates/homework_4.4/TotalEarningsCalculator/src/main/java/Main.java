public class Main {
    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        int comma1 = text.indexOf(',');                                    //Разделяем на строки.
        int comma2 = text.lastIndexOf(',');                             //Разделяем на строки.
        String sum1 = text.substring(0, comma1).trim();                    //Вася заработал 5000 рублей.
        String sum2 = text.substring(comma1 + 1, comma2).trim();           //Петя - 7563 рубля.
        String sum3 = text.substring(comma2 + 1).trim();                   //а Маша - 30000 рублей.

        int vas = 0;
        for (; vas < sum1.length(); vas++) {                               //Перебор букв(символов).
            if (Character.isDigit(sum1.charAt(vas))) {                     //Ищем цифру.
                break;
            }
        }
        int num1 = sum1.indexOf(sum1.charAt(vas));                         //Начало цифры в тексте.
        int spaceIndex = sum1.lastIndexOf(' ');                         //Находим конец цифр.
        int vasya = Integer.parseInt(sum1.substring(num1, spaceIndex));    //Текст в цифру.

        int ped = 0;
        for (; ped < sum2.length(); ped++) {
            if (Character.isDigit(sum2.charAt(ped))) {
                break;
            }
        }
        int num2 = sum2.indexOf(sum2.charAt(ped));
        int spaceIndex2 = sum2.lastIndexOf(' ');
        int pedro = Integer.parseInt(sum2.substring(num2, spaceIndex2));

        int mas = 0;
        for (; mas < sum3.length(); mas++) {
            if (Character.isDigit(sum3.charAt(mas))) {
                break;
            }
        }
        int num3 = sum3.indexOf(sum3.charAt(mas));
        int spaceIndex3 = sum3.lastIndexOf(' ');
        int masha = Integer.parseInt(sum3.substring(num3, spaceIndex3));

        System.out.println(vasya + pedro + masha);
//        System.out.println("\nСумма заработка всех друзей: " + (vasya + pedro + masha) + " рублей.");
    }
}