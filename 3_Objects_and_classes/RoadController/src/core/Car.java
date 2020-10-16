package core;

public class Car
{
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    public String getNumber() // Получить номер
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public Integer getHeight() // Получить высоту
    {
        return height;
    }

    public void setHeight(Integer height)
    {
        this.height = height;
    }

    public Double getWeight()       // Получить вес
    {
        return weight;
    }

    public void setWeight(Double weight)
    {
        this.weight = weight;
    }

    public String getHasVehicle()       // Получить\узнать есть ли прицеп
    {
        return hasVehicle ? "Есть" : "Нет";
    }

    public void setHasVehicle(Boolean hasVehicle)
    {
        this.hasVehicle = hasVehicle;
    }

    public String getIsSpecial()        // Получить\узнать спецтранспорт ли!
    {
        return isSpecial ? "СПЕЦТРАНСПОРТ " : "";
    }

    public void setIsSpecial(Boolean isSpecial)
    {
        this.isSpecial = isSpecial;
    }

    public String toString()
    {
        return "\n=========================================\n" +
                getIsSpecial() + "Автомобиль с номером: " + getNumber() +
                "\n\tВысота: " + getHeight() + " мм\n\tМасса: " + getWeight() + " кг" + "\n\tПрицеп: " + getHasVehicle();
    }
}