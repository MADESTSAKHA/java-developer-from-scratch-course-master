public class Main {
    public static void main(String[] args) {
    }

    public static int calculateSalarySum(String text) {
        text = text.replaceAll("[^0-9,\\,]", ""); //Выборка цифр и (запятых). Замена всего на "пустоту".
        String[] sentences = text.split("\\,");             //Разделение строки по (запятой).

        if (text.equals("")) {                                    //Проверка на пустоту.
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < sentences.length; i++) {
            sum += Integer.parseInt(sentences[i]);                 //Сложение цифр.
        }
        return sum;                                                //Вывод суммы сложения.
    }
}