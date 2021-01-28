import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Кофе автомат");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Внесите деньги: ");
        int moneyAmount = scanner.nextInt();
        System.out.println("Вы внесли: " + moneyAmount + " руб.\n");

        String[] drinkName = {"Americano", "Cappucino", "Espresso", "Latte", "Mocha", "Glace", "Горячий шоколад", "Milk", "Water"};
        int[] drinkPrice = {100, 90, 80, 70, 60, 50, 40, 30, 10};

        System.out.println("\n\tВы можете купить:");

        for (int i = 0; i < drinkName.length; i++) {
            if (moneyAmount >= drinkPrice[i]) {
                System.out.print(drinkName[i] + " " + drinkPrice[i] + " руб.");
                if (moneyAmount - drinkPrice[i] > 0) {
                    System.out.println("\n\t\t\tСдача: " + (moneyAmount - drinkPrice[i]) + " руб.");
                }else {
                    System.out.println("\n");
                }
            }
        }

        System.out.println("   ---------==========----------");

        for (int i = 0; i < drinkName.length; i++) {
            if (moneyAmount < drinkPrice[i]) {
                System.out.println("Вам не хватает на покупку:\n\t" + drinkName[i] + " - "
                        + (drinkPrice[i] - moneyAmount) + " руб.");
            }
        }
    }
}