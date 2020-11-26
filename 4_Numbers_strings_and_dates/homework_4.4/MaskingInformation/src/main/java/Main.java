public class Main {
    public static void main(String[] args) {
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений
        text = text.replaceAll("(\\(|\\[|\\{|\\<).*?(\\)|\\]|\\}|\\>)", "***");
        return text;
    }
}

//FIXME Я думал что нужно сделать так чтоб каждый символ заменялся на "*", но было легче! 8о)