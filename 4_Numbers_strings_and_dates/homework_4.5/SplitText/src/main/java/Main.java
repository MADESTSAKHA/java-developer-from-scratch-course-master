public class Main {
    public static void main(String[] args) {
    }

    public static String splitTextInToWords(String text) {
        //TODO реализуйте метод

        text = text.replaceAll("[^a-zA-Z’]", " ");  //Вывод только букв, остальное меняем на "space"8o).
        String[] sentences = text.split("\\s+");              //Разделяем текст на массив строк.
        StringBuilder builder = new StringBuilder();                //Добавление строк друг за другом.

        String words = text;

        if (text.length() != 0) {                                   //Проверка на пустую строчку.
            for (int i = 0; i < sentences.length; i++) {
                builder.append(sentences[i]);                       //Вывод слова.
                if (i < (sentences.length - 1)) {                   //Ограничитель переноса на новую строку.
                    builder.append("\n");                           //Перенос слова на новую строку.
                }
                words = builder.toString();                         //На всякий случай .toString().
            }
        } else {
            words = "";                                             //Вывод пустой строки.
        }
        return words;                                               //Вывод пустой или построчный.
    }
}

// FIXME Кажется в этом задание тест сломан?