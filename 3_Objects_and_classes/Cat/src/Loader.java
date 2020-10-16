// Homework done

import java.text.*;
import java.util.Date;

public class Loader
{
    public static void main(String[] args)
    {
        DateFormat format = new SimpleDateFormat("HH:mm:ss dd.MMM yyyy г.");
        Date date = new Date ();
        System.out.println("\n\tОбъекты для наблюдений: " + Cat.getCount());
        System.out.println("\t\n    ---------===============---------1");

                    //  Object #1 - мертвый

        Cat cat1 = new Cat();
        System.out.println("\nВес: " + cat1.getWeight() + " гр. цвет: " + cat1.catColor.getTranslation() + " статус: " + cat1.getStatus() + "\n");
        while (!cat1.getStatus().equals("Сдох(ла)"))       //Остановка по статусу.
        {
            cat1.meow();
            System.out.println(cat1.getWeight());
        }
        System.out.println(cat1.catName.getTranslation() + " представился(ась)!\nВремя смерти: " + format.format(date) + "\nВес: " + cat1.getWeight() + " гр. намяукала на: " + cat1.meowmeow());
        System.out.println("Цвет кошки: " + cat1.catColor.getTranslation());
        System.out.println("Имя кота: " + cat1.catName.getTranslation());
        System.out.println("\nСтатус: " + cat1.getStatus());
        System.out.println("\n\tОбъекты для наблюдений: " + Cat.getCount());
        System.out.println("\t\n    ---------===============---------2\n");

                    //  Object #2 - мертвый

        Cat cat2 = new Cat();
        System.out.println("Вес котика: " + cat2.getWeight() + " гр. \nЦель эксперимента: кормить порциями по 500 гр. до смерти (Злобный смех за кадром: УХАХАХА)\n");
        while(!cat2.getStatus().equals("Взорвался"))      //Остановка по статусу.
        {
            cat2.feed(500.0);
            System.out.println(cat2.getWeight());
        }
        System.out.println("\nGet out there, it is gonna blow!" + "\n\tСъел: " + cat2.eaten() + " гр.");
        System.out.println("Цвет кошки: " + cat2.catColor);
        System.out.println("Имя кота: " + cat2.catName.getTranslation());
        System.out.println("\nСтатус: " + cat2.getStatus());
        System.out.println("\n\tОбъекты для наблюдений: " + Cat.getCount());
        System.out.println("\t\n    ---------===============---------3\n");

                    //  Object #3 - мертвый

        Cat cat3 = new Cat();
        System.out.println("Вес кота: " + cat3.getWeight() + "\n");
        while(cat3.getWeight() <= 9000)        //Остановка по весу.
        {
            cat3.feed(1200.0);
            System.out.println("Вес кота: " + cat3.getWeight());
        }
        System.out.println("\t\nБыло съедено: " + cat3.eaten() + " гр.");
        System.out.println("Цвет кошки: " + cat3.catColor);
        System.out.println("Имя кота: " + cat3.catName.getTranslation());
        System.out.println("\nСтатус: " + cat3.getStatus());
        System.out.println("\n\tОбъекты для наблюдений: " + Cat.getCount());
        System.out.println("\t\n    ---------===============---------4\n");

                    //  Object #4 - мертвый

        Cat cat4 = new Cat();
        System.out.println("Вес кота: " + cat4.getWeight() + " гр.\n");
        while(1000 <= cat4.getWeight())
        {
            cat4.pee();      //метод сходить туалет.
            System.out.println("Вес кота: " + cat4.getWeight());
        }
        System.out.println("\t\nСдох от ротавирусной инфекции!");
        System.out.println("Выкакал: " + cat4.deduced() + " гр.");
        System.out.println("Цвет кошки: " + cat4.catColor);
        cat4.pee();         //проверка дополнительного ДЗ к Урок 3. Статические методы и переменные
        System.out.println("Вес кота: " + cat4.getWeight());
        System.out.println("Имя кота: " + cat4.catName.getTranslation());
        System.out.println("\nСтатус: " + cat4.getStatus());
        System.out.println("\n\tОбъекты для наблюдений: " + Cat.getCount());
        System.out.println("\t\n    ---------===============---------5\n");

                    //  Object #5 - живой - мертвый 50/50

        Cat cat5 = new Cat();
        System.out.println("Вес кота: " + cat5.getWeight());
        cat5.feed(150.0);
        System.out.println("Поел");
        System.out.println("Вес кота: " + cat5.getWeight());
        cat5.drink(3500.0);
        System.out.println("Попил");
        System.out.println("Вес кота: " + cat5.getWeight());
        cat5.pee();
        System.out.println("Вес кота: " + cat5.getWeight());
        cat5.pee();
        System.out.println("Вес кота: " + cat5.getWeight());
        cat5.meow();
        System.out.println("Вес кота: " + cat5.getWeight());
        cat5.meow();
        System.out.println("Вес кота: " + cat5.getWeight());
        System.out.println("\n\tCъел: " + cat5.eaten() + " гр. намяучил: " + cat5.meowmeow() + " покакал: " + cat5.deduced() + " гр.");
        System.out.println("Цвет кошки: " + cat5.catColor);
        System.out.println("Имя кота: " + cat5.catName.getTranslation());
        System.out.println("\nСтатус: " + cat5.getStatus());
        System.out.println("\n\tОбъекты для наблюдений: " + Cat.getCount());
        System.out.println("\t\n    ---------===============---------6\n");

                    //  Object #6 - живой

        Cat cat6 = new Cat();
        System.out.println("Кот появился на свет: " + format.format(date) + " с весом: " + cat6.getWeight() + " гр.");
        cat6.feed(1500.0);
        System.out.println("Поел на: " + cat6.eaten() + " гр. Ну и жрать! 8о) \t\nВес: " + cat6.getWeight() + "\t\nСтатус: " + cat6.getStatus());
        System.out.println("Цвет кошки: " + cat6.catColor);
        System.out.println("Имя кота: " + cat6.catName.getTranslation());
        System.out.println("\nСтатус: " + cat6.getStatus());
        System.out.println("\n\tОбъекты для наблюдений: " + Cat.getCount());
        System.out.println("\t\n    ---------===============---------7\n");

                    //  Object #7 - живой

        Cat cat7 = new Cat();
        System.out.println("\tСоздан кот");
        System.out.println("Цвет кошки: " + cat7.catColor);
        System.out.println("Имя кота: " + cat7.catName.getTranslation());
        System.out.println("\nСтатус: " + cat7.getStatus());
        System.out.println("\n\tОбъекты для наблюдений: " + Cat.getCount());
        System.out.println("\t\n    ---------===============---------8\n");

        //  Object #8 - живой

        Cat cat8 = new Cat();
        System.out.println("\tСоздан кот");
        while(1000 <= cat8.getWeight())       //Остановка по весу.
        {
            cat8.meow();
            System.out.println("Вес кота Спартака: " + cat8.getWeight());
        }
        System.out.println("Вес: " + cat8.getWeight());
        System.out.println("Цвет кошки: " + cat8.catColor);
        System.out.println("Цвет кошки c переводом на русский: " + cat8.catColor.getTranslation());
        System.out.println("Имя кота: " + cat8.catName.getTranslation());
        System.out.println("\nСтатус: " + cat8.getStatus());
        System.out.println("\n\tОбъекты для наблюдений: " + Cat.getCount());
        System.out.println("\t\n    ---------===============---------9\n");

        //  Object #9 - Мертвый

        Cat cat9 = new Cat();
        System.out.println("Появился мертвый кот, но он об этом еще не знает!\n");
        while(1000 <= cat9.getWeight())       //Остановка по весу.
        {
            cat9.pee();
            System.out.println("Вес кота: " + cat9.getWeight());
        }
        System.out.println("Цвет кошки c переводом на русский: " + cat9.catColor.getTranslation());
        System.out.println("Имя кота: " + cat9.catName.getTranslation());
        System.out.println("\nСтатус: " + cat9.getStatus());
        System.out.println("\n\tОбъекты для наблюдений: " + Cat.getCount());
        System.out.println("\t\n    ---------===============---------10\n");

        //                      Урок 5. Создание объектов и конструктор

        //  Object #10 - Заведомо мертвый кот!

        Cat cat10 = new Cat(5678.9); //Метод генерации новой кошки, где можно задать вес.
        System.out.println("Кот весело играл! Вес кота был: " + cat10.getWeight());
        while(1000 <= cat10.getWeight())       //Остановка по весу.
        {
            cat10.pee();
            System.out.println("Вес кота: " + cat10.getWeight());
        }
        System.out.println("Цвет кошки c переводом на русский: " + cat10.catColor + " - " + cat10.catColor.getTranslation());
        System.out.println("Имя кота: " + cat10.catName.getTranslation());
        System.out.println("\nСтатус: " + cat10.getStatus());
        System.out.println("\n\tОбъекты для наблюдений: " + Cat.getCount());
        System.out.println("\t\n    ---------===============---------11\n");

        //  Object #11 -  - живой

        Cat cat11 = getKitten();

        System.out.println("Вес кота: " + cat11.getWeight());
        System.out.println("Цвет кошки c переводом на русский: " + cat11.catColor + " - " + cat11.catColor.getTranslation());
        System.out.println("Имя кота: " + cat11.catName.getTranslation());
        System.out.println("\nСтатус: " + cat11.getStatus());
        System.out.println("\t\n    ---------===============---------");

        System.out.println("\n\tОбъектов для наблюдений было: " + (Cat.getCount() + Cat.catDeadCount()));
        System.out.println("\tОбъектов сдохло из за экспериментов: " + Cat.catDeadCount());
        System.out.println("\tОбъектов для наблюдений осталось: " + Cat.getCount());
        System.out.println("\tНа нас смотрят: " + Cat.getEyesCount() + " глаз(а).");       //количество глаз, оставшихся кошек!
    }

    private static Cat getKitten()
    {
        return new Cat(1100.0);
    }
}