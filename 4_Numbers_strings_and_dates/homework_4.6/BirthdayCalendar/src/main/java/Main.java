import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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

        Calendar calendar = Calendar.getInstance();
        DateFormat template = new SimpleDateFormat("0 - dd.MM.yyyy - EEE");

        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month);
        calendar.add(Calendar.MONTH, -1); // Equalizer
        calendar.set(Calendar.YEAR, year);

        String time = template.format(calendar.getTime());

        return time;
    }
}

//TODO optionNumber2 положительный результат в 5.

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