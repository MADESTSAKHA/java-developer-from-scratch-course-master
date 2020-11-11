import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {

    private static final int CONTAINER_IN_TRUCK = 12;                   // Вместительный грузовик.
    private static final int BOX_IN_CONTAINER = 27;                     // Вместительный контейнер.

    private static int boxCount;                                        // Счетчик коробок.
    private static int containerCount;                                  // Счетчик контейнеров.
    private static int truckCount;                                      // Счетчик грузовиков.
    private static int boxs;                                            // Дополнительный счетчик коробок со сбросом на ноль, для выхода из цикла.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество ящиков: ");              // Рукоблудие.
        String boxes = scanner.nextLine();
        int box = Integer.parseInt(boxes);                              // Перевод строки в int.

//        System.out.println("\t\t\t\t Вы ввели: " + box);              // Проверка на точность!

        for (int i1 = 0; box > boxCount; i1++) {
            if (containerCount % CONTAINER_IN_TRUCK == 0) {             // Создание грузовика.
                truckCount++;
                System.out.println("Грузовик: " + truckCount);
            }

            if (boxCount % BOX_IN_CONTAINER == 0) {                     // Создание контейнера.
                containerCount++;
                System.out.println("\tКонтейнер: " + containerCount);
            }

            for (int c3 = 0; boxs < BOX_IN_CONTAINER; c3++) {           // Пока писал, понял что этот код можно сократить, потом понял что нельзя, потом подумал утро вечера мудренее и ушел спать!!!
                boxs++;
                boxCount++;
                if (box >= boxCount) {
                    System.out.println("\t\tЯщик: " + boxCount);
                }
            }
            boxs = 0;                                                   // Сброс дополнительного счетчика.
        }
        finishMassage();
    }

    /**
     * ----------------========================================================-------------------------
     */ // Полосочка.
    public static void finishMassage() {
        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + truckCount + " шт.");
        System.out.println("контейнеров - " + containerCount + " шт.");
        clear();
    }         // Финишное сообщение.

    public static void clear() {
        boxCount = 0;
        containerCount = 0;
        truckCount = 0;
        boxs = 0;
    }           // Сброс счетчиков.
}

// TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
// пример вывода при вводе 2
// для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */