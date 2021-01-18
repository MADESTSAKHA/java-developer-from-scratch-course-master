import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nКофе-машина");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        int moneyAmount = scanner.nextInt();
        System.out.println("\tВы ввели: " + moneyAmount + " руб.\n");

        String[] name = {"Cappuccino", "Espresso", "Milk", "Water"};
        int[] price = {100, 80, 40, 20};

        System.out.println("Вы можете купить: ");
        for (int i = 0; i < name.length; i++) {
            if (price[i] <= moneyAmount) {
                System.out.println("\t" + name[i] + " - за: " + price[i]
                        + " руб. \n\t\t\tСдача: " + (moneyAmount - price[i]) +  " руб.");
            }
        }
        System.out.println("            ----------==========----------");
        for (int i = 0; i < name.length; i++) {
            if (price[i] > moneyAmount) {
                System.out.println("Вам не хватает: " + (price[i] - moneyAmount) + " руб на: "
                        + name[i] + " - за: " + price[i] + " руб.");
            }
        }
    }
}