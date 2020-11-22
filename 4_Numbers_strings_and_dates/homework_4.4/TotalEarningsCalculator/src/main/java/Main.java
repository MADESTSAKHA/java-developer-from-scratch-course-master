public class Main {
    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        int comma1 = text.indexOf(',');
        int comma2 = text.lastIndexOf(',');
                                                                           //Разделяем на строки.
        String sum1 = text.substring(0, comma1).trim();                    //Вася заработал 5000 рублей.
        String sum2 = text.substring(comma1 + 1, comma2).trim();           //Петя - 7563 рубля.
        String sum3 = text.substring(comma2 + 1).trim();                   //а Маша - 30000 рублей.

        int num1 = sum1.indexOf('5');                                      //Ищем цифру.
        int spaceIndex = sum1.lastIndexOf(' ');                         //Находим конец цифр
        int vasya = Integer.parseInt(sum1.substring(num1, spaceIndex));    //Текст в цифру.

        int num2 = sum2.indexOf('7');
        int spaceIndex2 = sum2.lastIndexOf(' ');
        int pedro = Integer.parseInt(sum2.substring(num2, spaceIndex2));

        int num3 = sum3.indexOf('3');
        int spaceIndex3 = sum3.lastIndexOf(' ');
        int masha = Integer.parseInt(sum3.substring(num3, spaceIndex3));

//        System.out.println("\n\tСумма заработка всех друзей: " + (vasya + pedro + masha) + " рублей.");
        System.out.println(vasya + pedro + masha);
    }
}