import java.text.*;
import java.util.Date;

public class Loader
{
    public static void main(String[] args)
    {
        DateFormat format = new SimpleDateFormat("HH:mm:ss dd.MMMyyyy г.");
        Date date = new Date ();

                    //  Object #1 - мертвый

        Cat murka = new Cat();
        System.out.println("\nВес Мурки: " + murka.getWeight() + " гр. цвет: " + murka.catColor.getTranslation() + " статус: " + murka.getStatus() + "\n");
        while (!murka.getStatus().equals("Сдох(ла)"))       //Остановка по статусу.
        {
            murka.meow();
            System.out.println(murka.getWeight());
        }
        System.out.println("\t\nМурка представилась!\nВремя смерти: " + format.format(date) + "\nВес Мурки: " + murka.getWeight() + " гр. намяукала на: " + murka.meowmeow() + ", статус: " + murka.getStatus());
        System.out.println("Цвет кошки: " + murka.catColor.getTranslation());
        System.out.println("\t\n    ---------===============---------\n");

                    //  Object #2 - мертвый

        Cat niceniga = new Cat();
        System.out.println("Вес котика НайсНига: " + niceniga.getWeight() + " гр. \nЦель эксперимента: кормить порциями по 500 гр. до смерти (Злобный смех за кадром: УХАХАХА)\n");
        while (!niceniga.getStatus().equals("Взорвался"))      //Остановка по статусу.
        {
            niceniga.feed(500.0);
            System.out.println(niceniga.getWeight());
        }
        System.out.println("\nGet out there, it is gonna blow!" + "\n\tСъел: " + niceniga.eaten() + " гр. Статус: " + niceniga.getStatus());
        System.out.println("Цвет кошки: " + niceniga.catColor);
        System.out.println("\t\n    ---------===============---------\n");

                    //  Object #3 - мертвый

        Cat kuzya = new Cat();
        System.out.println("Вес кота Кузи: " + kuzya.getWeight() + "\n");
        while(kuzya.getWeight() <= 9000)        //Остановка по весу.
        {
            kuzya.feed(1200.0);
            System.out.println("Вес кота Кузи: " + kuzya.getWeight());
        }
        System.out.println("\t\nБыло съедено: " + kuzya.eaten() + " гр. Статус: " + kuzya.getStatus());
        System.out.println("Цвет кошки: " + kuzya.catColor);
        System.out.println("\t\n    ---------===============---------\n");

                    //  Object #4 - мертвый

        Cat vasia = new Cat();
        System.out.println("Вес кота Василия: " + vasia.getWeight() + " гр.\n");
        while(1000 <= vasia.getWeight())
        {
            vasia.pee();      //метод сходить туалет.
            System.out.println("Вес кота Василия: " + vasia.getWeight());
        }
        System.out.println("\t\nСдох от ротавирусной инфекции!");
        System.out.println("Выкакал: " + vasia.deduced() + " гр.");
        System.out.println("Цвет кошки: " + vasia.catColor);
        vasia.pee();         //проверка дополнительного ДЗ к Урок 3. Статические методы и переменные
        System.out.println("Вес кота Василия: " + vasia.getWeight());
        System.out.println("\t\n    ---------===============---------\n");

                    //  Object #5 - живой - мертвый 50/50

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
        System.out.println("Цвет кошки: " + barsik.catColor);
        System.out.println("\t\n    ---------===============---------\n");

                    //  Object #6 - живой

        Cat kris = new Cat();
        System.out.println("Кот Крис, появился на свет: " + format.format(date) + " с весом: " + kris.getWeight() + " гр. Статус: " + kris.getStatus());
        kris.feed(1500.0);
        System.out.println("Поел на: " + kris.eaten() + " гр. Ну и жрать! 8о) \t\nВес: " + kris.getWeight() + "\t\nСтатус: " + kris.getStatus());
        System.out.println("Цвет кошки: " + kris.catColor);
        System.out.println("\t\n    ---------===============---------\n");

                    //  Object #7 - живой

        Cat monster = new Cat();
        System.out.println("\tСоздан кот Монстер");
        System.out.println("Цвет кошки: " + monster.catColor);
        System.out.println("\t\n    ---------===============---------\n");

        //  Object #8 - живой

        Cat spartak = new Cat();
        System.out.println("\tСоздан кот Спартак");
        while(1000 <= spartak.getWeight())       //Остановка по весу.
        {
            spartak.meow();
            System.out.println("Вес кота Спартака: " + spartak.getWeight());
        }
        System.out.println("\nСтатус: " + spartak.getStatus() + " Вес: " + spartak.getWeight());
        System.out.println("Цвет кошки: " + spartak.catColor);
        System.out.println("Цвет кошки c переводом на русский: " + spartak.catColor.getTranslation());
        System.out.println("\t\n    ---------===============---------\n");

        System.out.println("\tОбъектов для наблюдений осталось: " + Cat.getCount());
        System.out.println("\n\tНа нас смотрят: " + Cat.getEyesCount() + " глаз(а).");       //количество глаз, оставшихся кошек!
    }
}