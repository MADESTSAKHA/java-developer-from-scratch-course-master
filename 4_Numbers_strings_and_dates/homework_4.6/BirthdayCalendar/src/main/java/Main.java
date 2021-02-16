import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));
    }

    public static String collectBirthdays(int year, int month, int day) {

        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue
        // Cделано вместе с @kovaldis из Telegram.
        LocalDate birthDays = LocalDate.of(year, month, day);

        String returnDate = "";
        int i = 0;
        while (!birthDays.isAfter(LocalDate.now())) {
            String dateFormat = birthDays.format(DateTimeFormatter.ofPattern(i + " - dd.MM.yyyy - EEE"));
            returnDate = returnDate + System.lineSeparator() + dateFormat;
            i++;
            birthDays = birthDays.plusYears(1);
        }
        return returnDate;
    }
}

//TODO optionNumber7 положительный результат в 1-4. "for".

//    LocalDate birthDays = LocalDate.of(year, month, day);// день рождения
//    LocalDate today = LocalDate.now();// сегодняшняя дата
//    String template = birthDays.format(DateTimeFormatter.ofPattern("- dd.MM.yyyy - EEE"));
//
//    String returnDate = "";
//
//    int i = 0;
//        for (; i <= 1; i++) {
//                if (birthDays.isBefore(today) || birthDays.equals(today)) { //ДР раньше или равно сегодня.
//                returnDate = i + " " + template;
//                birthDays = birthDays.plusYears(1);
//                }
//                }
//                return returnDate;

//TODO optionNumber6 положительный результат в 1-4. чуть короче.

//    LocalDate birthDays = LocalDate.of(year, month, day);// день рождения
//    LocalDate today = LocalDate.now();// сегодняшняя дата
//    String template = birthDays.format(DateTimeFormatter.ofPattern("- dd.MM.yyyy - EEE"));
//
//    String returnDate = "";
//    int i = 0;
//        while (birthDays.isBefore(today) || birthDays.equals(today)) { //ДР раньше или равно сегодня.
//                returnDate = i + " " + template;
//                birthDays = birthDays.plusYears(1);
//                i++;
//                }
//                return returnDate;

//TODO optionNumber5 просто выводит даты.

//    LocalDate birthDays = LocalDate.of(year, month, day);// день рождения
//    LocalDate today = LocalDate.now();// сегодняшняя дата
//    DateTimeFormatter template = DateTimeFormatter.ofPattern("- dd.MM.yyyy - EEE");
//    Period period = Period.between(birthDays, today);
//
//    int i = 0;
//        for (; birthDays.isBefore(today) || birthDays.equals(today); i++) {
//                System.out.println(i + " " + birthDays.format(template));
//                birthDays = birthDays.plusYears(1);
//                }
//                System.out.println("Мне " + period.getYears() + " годик(ов)");
//
//                return "";

//TODO optionNumber4 положительный результат в 1-4.

//    LocalDate birthDays = LocalDate.of(year, month, day);// день рождения
//    LocalDate today = LocalDate.now();// сегодняшняя дата
//    String template = birthDays.format(DateTimeFormatter.ofPattern("- dd.MM.yyyy - EEE"));
//
//    String text = "";
//    int i = 0;
//        while (birthDays.isBefore(today) || birthDays.equals(today)) {
//                System.out.println(i + " " + template);
//                i++;
//                birthDays = birthDays.plusYears(1);
//                }

//                return text;

//TODO optionNumber3 положительный результат в 5.

//    Calendar calendar = Calendar.getInstance();
//    DateFormat template = new SimpleDateFormat("0 - dd.MM.yyyy - EEE");
//
//
//        calendar.set(Calendar.DAY_OF_MONTH, day);
//                calendar.set(Calendar.MONTH, month);
//                calendar.add(Calendar.MONTH, -1); // Equalizer
//                calendar.set(Calendar.YEAR, year);
//
//                calendar.set(Calendar.YEAR, 2021);
//                String text = template.format(calendar.getTime());
//                calendar.set(Calendar.YEAR, 2020);
//                String text2 = template.format(calendar.getTime());
//                String text4 = text.replaceFirst("0", "1");
//
//                String text3 = text2 + "\n" + text4;
//
//                return text3;

//TODO optionNumber2 положительный результат в 3.

//    Calendar calendar = Calendar.getInstance();
//    DateFormat template = new SimpleDateFormat(" - dd.MM.yyyy - EEE");
//
//
//        calendar.set(Calendar.DAY_OF_MONTH, day);
//                calendar.set(Calendar.MONTH, month);
//                calendar.add(Calendar.MONTH, -1); // Equalizer
//                calendar.set(Calendar.YEAR, year);
//
//                String text = template.format(calendar.getTime());
//
//                for (int i = 0; i < 1; i++) {
//        System.out.print(i + text + System.lineSeparator());
//        }

//        return "";

//TODO optionNumber1 - положительный результат в 1,2 и 4.

//    Calendar calendar = Calendar.getInstance();
//    DateFormat template = new SimpleDateFormat("0 - dd.MM.yyyy - EEE");
//
//        calendar.set(Calendar.DAY_OF_MONTH, day);
//                calendar.set(Calendar.MONTH, month);
//                calendar.add(Calendar.MONTH, -1); // Equalizer
//                calendar.set(Calendar.YEAR, year);
//
//                String time = template.format(calendar.getTime());
//
//                return time;