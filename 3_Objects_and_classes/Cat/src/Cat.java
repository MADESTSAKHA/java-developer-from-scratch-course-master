// Homework done

public class Cat implements Cloneable
{
    private static final int EYES_COUNT = 2;             //статичная константа количества глаз
    private static final double MIN_WEIGHT = 1000.0;     //статичная константа минимального веса
    private static final double MAX_WEIGHT = 9000.0;     //статичная константа максимального веса
    private double originWeight;
    private double weight;

    private double eatenCount;   //кладем сюда вес съеденной еды.
    private double deducedCount; //кладем сюда сколько покакал. 8о)
    private double meowCount;    //кладем сюда сколько мяукал. 8о)
    private static int catCount; //кладем сюда количество кошек.
    private static int catDeadCount; ////кладем сюда количество сдохших кошек.
    private CatColor catColor;    //Здесь цвет кошки.
    private CatName catName;      //Здесь имена кошек.

    private final double meowCat = Math.random() * 1500.0; //переменная мяу-мяу и на сколько мяукает.
    private final double peeCat = Math.random() * 1500.0; //переменная какашек и на сколько грамм какает 8о)

    public CatColor getCatColor() { //Урок 6. Инкапсуляция, геттеры и сеттеры
        return catColor;
    }

    public void setCatColor(CatColor catColor) {
        this.catColor = catColor;
    }

    public CatName getCatName() {   //Урок 6. Инкапсуляция, геттеры и сеттеры
        return catName;
    }

    public void setCatName(CatName catName) {
        this.catName = catName;
    }

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        catCount ++;            //  (+) кошка.
        originWeight = weight;  //Вес при создании.
        catColor = getRandom(); //Задается цвет кошки.
        catName = getRandom2(); //Задается имя кошки.
    }

    public Cat(Double weight) //Конструктор, чтобы массу кошки можно было задавать.
    {
        this();
        this.weight = weight;
    }

    public Cat(Cat cat)     // Урок 7. Копирование объектов
    {
        this.originWeight = cat.originWeight;
        this.weight = cat.weight;
        this.catColor = cat.catColor;
        this.catName = cat.catName;
    }

    public Cat copyCat()        //Урок 7. Копирование объектов
    {
        return new Cat(this);
    }

    public Cat clone() throws CloneNotSupportedException {  // Случайно узнал про клон.
        catCount++;
        return (Cat) super.clone();
    }

    public static Cat getKitten() // Урок 6. Инкапсуляция, геттеры и сеттеры
    {
        return new Cat(1100.0);
    }

    private boolean isAlive() // Жива ли кошка?!?! определение по весу
    {
        return (getWeight() >= MIN_WEIGHT && getWeight() <= MAX_WEIGHT);
    }

    private void isDead() // Однозначно мертва, то счетчик catCount в минус!
    {
        if (getWeight() < MIN_WEIGHT || getWeight() > MAX_WEIGHT)
        {
            catCount--;
            catDeadCount ++;
        }
    }

    public static int catDeadCount() //метод вызов сколько скончалось.
    {
        return catDeadCount;
    }

    public static CatColor getRandom() //Случайный цвет кошки.
    {
        return CatColor.values()[(int) (Math.random() * CatColor.values().length)];
    }

    public static CatName getRandom2() //Случайный цвет кошки.
    {
        return CatName.values()[(int) (Math.random() * CatColor.values().length)];
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
        if (isAlive())
        {
            weight = weight - meowCat;
            meowCount += meowCat;
            System.out.println("Meow");
            isDead();
        }
    }

    public void pee()      //метод сходить туалет.
    {
        if (isAlive())
        {
            weight = weight - peeCat;
            deducedCount += peeCat;
            System.out.println("I pooped!!!");
            isDead();
        }
    }

    public void feed(Double amount)
    {
        if (isAlive())
        {
            weight = weight + amount;
            eatenCount += amount;
            isDead();
        }
    }

    public void drink(Double amount)
    {
        if (isAlive())
        {
            weight = weight + amount;
            eatenCount += amount;
            isDead();
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
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