package core;

public class Car
{
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    public String getNumber()
    {
        return number;
    }
    public Integer getHeight()
    {
        return height;
    }
    public Double getWeight()       //такой же как и в Cat
    {
        return weight;
    }

    public String getHasVehicle()
    {
        return hasVehicle ? "Есть" : "Нет";
    }

    public String getIsSpecial()
    {
        return isSpecial ? "СПЕЦТРАНСПОРТ " : "";
    }

    public String toString()
    {
        return "\n=========================================\n" +
                getIsSpecial() + "Автомобиль с номером: " + getNumber() +
                "\n\tВысота: " + getHeight() + " мм\n\tМасса: " + getWeight() + " кг" + "\n\tПрицеп: " + getHasVehicle();
    }
}