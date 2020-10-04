import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Loader
{
    public static void main(String[] args)
    {
        DateFormat format = new SimpleDateFormat("HH:mm:ss dd.MMMyyyy г.");
        Date date = new Date ();

                    //  Object #1

        Cat murka = new Cat();
        System.out.println("\nВес Мурки: " + murka.getWeight() + " гр. статус: " + murka.getStatus() + "\n");
        while (!murka.getStatus().equals("Сдохла"))       //Остановка по статусу.
        {
            murka.meow();
            System.out.println(murka.getWeight());
        }
        System.out.println("\t\nМурка представилась!\nВремя смерти: " + format.format(date) + "\nВес Мурки: " + murka.getWeight() + " гр. намяукала на: " + murka.meowmeow() + ", статус: " + murka.getStatus());

        System.out.println("\t\n    ---------===============---------\n");

                    //  Object #2

        Cat niceniga = new Cat();
        System.out.println("Вес котика НайсНига: " + niceniga.getWeight() + " гр. \nЦель эксперимента: кормить порциями по 500 гр. до смерти (Злобный смех за кадром: УХАХАХА)\n");
        while(niceniga.getWeight() <= 9000)      //Остановка по весу.
        {
            niceniga.feed(500.0);
            System.out.println(niceniga.getWeight());
        }
        System.out.println("\nGet out there, it is gonna blow!" + "\n\tСъел: " + niceniga.eaten() + " гр. Статус: " + niceniga.getStatus());

        System.out.println("\t\n    ---------===============---------\n");

                    //  Object #3

        Cat kuzya = new Cat();       //Возврат веса.
        System.out.println("Вес кота Кузи: " + kuzya.getWeight() + "\n");
        while(kuzya.getWeight() <= 9000)
        {
            kuzya.feed(1200.0);
            System.out.println("Вес кота Кузи: " + kuzya.getWeight());
        }
        System.out.println("\t\nБыло съедено: " + kuzya.eaten() + " гр. Статус: " + kuzya.getStatus());

        System.out.println("\t\n    ---------===============---------\n");

                    //  Object #4

        Cat vasia = new Cat();
        System.out.println("Вес кота Василия: " + vasia.getWeight() + " гр.\n");
        while(1000 <= vasia.getWeight())       //Остановка по весу.
        {
            vasia.pee();      //метод сходить туалет.
            System.out.println("Вес кота Василия: " + vasia.getWeight());
        }
        System.out.println("\t\nСдох от ротавирусной инфекции!");
        System.out.println("Выкакал: " + vasia.deduced() + " гр.");

        vasia.pee();         //проверка дополнительного ДЗ к Урок 3. Статические методы и переменные

        System.out.println("\t\n    ---------===============---------\n");

                    //  Object #5

        Cat barsik = new Cat();
        System.out.println("Вес кота Барсика: " + barsik.getWeight());
        barsik.feed(150.0);
        System.out.println("Поел");
        System.out.println("Вес кота Барсика: " + barsik.getWeight());
        barsik.drink(3500.0);
        System.out.println("Попил");
        System.out.println("Вес кота Барсика: " + barsik.getWeight());
        barsik.pee();
        System.out.println("Вес кота Барсика: " + barsik.getWeight());
        barsik.pee();
        System.out.println("Вес кота Барсика: " + barsik.getWeight());
        barsik.meow();
        System.out.println("Вес кота Барсика: " + barsik.getWeight());
        barsik.meow();
        System.out.println("Вес кота Барсика: " + barsik.getWeight());
        System.out.println("\nСтатус: " + barsik.getStatus() + "\n\tБарсик съел: " + barsik.eaten() + " гр. намяучил: " + barsik.meowmeow() + " покакал: " + barsik.deduced() + " гр.");
        System.out.println("\t\n    ---------===============---------\n");

                    //  Object #6

        Cat kris = new Cat();
        System.out.println("Кот Крис, появился на свет: " + format.format(date) + " с весом: " + kris.getWeight() + " гр. Статус: " + kris.getStatus());
        kris.feed(1500.0);
        System.out.println("Поел на: " + kris.eaten() + " гр. Ну и жрать! 8о) \t\nВес: " + kris.getWeight() + "\t\nСтатус: " + kris.getStatus());

                    //  Object #7

        Cat monster = new Cat();

                    //  Object #8

        Cat spartak = new Cat();

        System.out.println("\n\tОбъектов для наблюдений осталось: " + Cat.getCatCount());
        System.out.println("\n\tНа нас смотрят: " + Cat.getEyesCatCount() + " глаз(а).");       //количество глаз, оставшихся кошек!
    }
}