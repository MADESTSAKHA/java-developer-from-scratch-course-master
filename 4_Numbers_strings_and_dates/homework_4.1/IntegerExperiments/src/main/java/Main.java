// FIXME,
//  Нужно использовать методы:
//  класса Integer: toString(), parseInt();
//  класса String: charAt(), length(), valueOf().

public class Main {

  public static void main(String[] args) {
    Container container = new Container();
    container.count += 7843;

    int sum = sumDigits(null);

    System.out.println("\n\tСумма цифр в числе: " + sum);
  }


  public static int sumDigits(Integer number)
  {
    if (number == null) return -1;
    String numbers = Integer.toString(number);
    int sum = 0;
    for(int i = 0; i < numbers.length(); i++)
    {
      sum = sum + Integer.parseInt(Character.toString(numbers.charAt(i)));
    }
    return sum;
  }
}

//TODO, 3===============================================================================================

/*
  public static int sumDigits(Integer number)
  {
    if (number == null) return -1;
    if (number == 0) return 0;
    return number % 10 + sumDigits(number / 10);
  }
}
*/

//TODO, 2===============================================================================================

/*
  public static int sumDigits(Integer number)
  {
    String numbers = Integer.toString(number);
    int sum = 0;
    for(int i = 0; i < numbers.length(); i++)
    {
      sum = sum + Integer.parseInt(Character.toString(numbers.charAt(i)));
    }
    return sum;
  }
}
*/

//TODO, 1===============================================================================================

/*
  public static int sumDigits(Integer number)
{
  int sum = 0;
  while (number > 0) {
    sum += number % 10;
    number = number / 10;
  }
  return sum;
}
}
*/

//TODO, ===============================================================================================

  /* Реализуйте метод sumDigits который возвращает сумму цифр числа, пример:
  передано 12345, метод должен вернуть 15
  если передано null, то должен вернуть -1

  Запустите тесты TestSumDigits для проверки корректности работы метода

  не меняйте название метода, его возвращаемое значение и модификаторы доступа (public).
  В противном случае тестовый метод не сможет проверить ваш код
   */