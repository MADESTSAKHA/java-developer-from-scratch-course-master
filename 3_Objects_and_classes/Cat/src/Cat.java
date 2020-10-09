public class Cat
{
    public static final int EYES_COUNT = 2;             //статичная константа количества глаз
    public static final double MIN_WEIGHT = 1000.0;     //статичная константа минимального веса
    public static final double MAX_WEIGHT = 9000.0;     //статичная константа максимального веса
    private double originWeight;
    private double weight;

    private double eatenCount;   //кладем сюда вес съеденной еды.
    private double deducedCount; //кладем сюда сколько покакал. 8о)
    private double meowCount;    //кладем сюда сколько мяукал. 8о)
    private static int catCount; //кладем сюда количество кошек.
    public CatColor catColor;    //Здесь цвет кошки.

    private double meowCat = Math.random() * 1500.0; //переменная мяу-мяу и на сколько мяукает.
    private double peeCat = Math.random() * 1500.0; //переменная какашек и на сколько грамм какает 8о)

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        catCount ++;            //  (+) кошка.
        originWeight = weight;  //Вес при создании.
        catColor = getRandom(); //Задается цвет кошки.
    }

    public boolean isAliveMain() // Жива ли кошка?!?!
    {
        return isAlive() && isAlive2();
    }

    public boolean isAlive() // Жива ли кошка?!?! определение по весу
    {
        return (getWeight() >= MIN_WEIGHT && getWeight() <= MAX_WEIGHT);
    }

    public boolean isAlive2() // Жива ли кошка?!?! по статусу который по весу 8о)
    {
        return getStatus().equals("Играет") || getStatus().equals("Спит");
    }

    public static CatColor getRandom() //Случайный цвет кошки.
    {
        return CatColor.values()[(int) (Math.random() * CatColor.values().length)];
    }

    public static int getEyesCount()      //метод вызов сколько осталось глаз кошек!
    {
        return catCount * EYES_COUNT;          // количество кошек * 2 глаза.
    }

    public static int getCount()      //метод вызов сколько осталось кошек!
    {
        return catCount;
    }

    public void meow()
    {
        if (isAliveMain())
        {
            weight = weight - meowCat;
            meowCount += meowCat;
            System.out.println("Meow");
        }
        if (!isAliveMain())
        {
            catCount --;
        }
    }

    public void pee()      //метод сходить туалет.
    {
        weight = weight - peeCat;
        deducedCount += peeCat;
        System.out.println("I pooped!!!");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        eatenCount += amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
        eatenCount += amount;
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
            return "Сдох(ла)";
        }
        else if(weight > MAX_WEIGHT) {
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