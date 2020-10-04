
public class Cat
{
    public static final int EYES_COUNT = 2;     //статичная константа количества глаз
    public static final double MIN_WEIGHT = 1000.0;     //статичная константа минимального веса
    public static final double MAX_WEIGHT = 9000.0;     //статичная константа максимального веса
    private double originWeight;
    private double weight;

    private double eatenCount; //кладем сюда вес съеденной еды.
    private double deducedCount; //кладем сюда сколько покакал. 8о)
    private double meowCount; //кладем сюда сколько мяукал. 8о)
    private static int catCount; //кладем сюда количество кошек.
    private static int catEyesCount;        //переменная подсчета глаз

    private double meowCat = 100; //переменная мяу-мяу и на сколько мяукает.
    private double peeCat = 150; //переменная какашек и на сколько грамм какает 8о)

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        catEyesCount ++;        //  (+) глаза кошке.
        catCount ++;        //  (+) кошка.
        originWeight = weight;
    }

    public static int getEyesCatCount()      //метод вызов сколько осталось глаз кошек!
    {
        return catEyesCount * EYES_COUNT;          // количество кошек * 2 глаза.
    }

    public static int getCatCount()      //метод вызов сколько осталось кошек!
    {
        return catCount;
    }

    public void meow()
    {
        if (weight < MIN_WEIGHT) {             // Дополнительное ДЗ к Урок 3. Статические методы и переменные
            System.out.println("\t\nОбъект сдох, мертвые не мяукают!");
        }
        else if(weight > MAX_WEIGHT) {
            System.out.println("\t\nОбъект взорвался, мертвые не мяукают!");
        }
        else {
            weight = weight - meowCat;
            meowCount += meowCat;
            System.out.println("Meow");
        }
    }

    public void pee()      //метод сходить туалет.
    {
        if (weight < MIN_WEIGHT) {             // Дополнительное ДЗ к Урок 3. Статические методы и переменные
            System.out.println("\t\nОбъект сдох, покакать не получиться!");
        }
        else if(weight > MAX_WEIGHT) {
            System.out.println("\t\nОбъект взорвался, покакать не получиться!");
        }
        else {
            weight = weight - peeCat;
            deducedCount += peeCat;
            System.out.println("I pooped!!!");
        }
    }

    public void feed(Double amount)
    {
        if (weight < MIN_WEIGHT) {             // Дополнительное ДЗ к Урок 3. Статические методы и переменные
            System.out.println("\t\nОбъект сдох, покормить не получиться!");
        }
        else if(weight > MAX_WEIGHT) {
            System.out.println("\t\nОбъект взорвался, покормить не получиться!");
        }
        else {
            weight = weight + amount;
            eatenCount += amount;
        }
    }

    public void drink(Double amount)
    {
        if (weight < MIN_WEIGHT) {             // Дополнительное ДЗ к Урок 3. Статические методы и переменные
            System.out.println("\t\nОбъект сдох, попоить не получиться!");
        }
        else if(weight > MAX_WEIGHT) {
            System.out.println("\t\nОбъект взорвался, попоить не получиться!");
        }
        else {
            weight = weight + amount;
            eatenCount += amount;
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public Double eaten()       //метод съеденный вес еды.
    {
        return eatenCount;
    }

    public Double deduced()       //метод сколько покакал. 8о)
    {
        return deducedCount;
    }

    public Double meowmeow()       //метод сколько мяукал. 8о)
    {
        return meowCount;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            catCount --;             // (-) кошка
            catEyesCount --;        //  (-) глаза кошке.
            return "Сдохла";
        }
        else if(weight > MAX_WEIGHT) {
            catCount --;             // (-) кошка
            catEyesCount --;        //  (-) глаза кошке.
            return "Взорвался";
        }
        else if(weight > originWeight) {
            return "Спит";
        }
        else {
            return "Играет";
        }
    }
}