import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1(); // Задача 1
        task2(); // Задача 2
        task3(); // Задача 3
    }

    //Задача 1
    public static void task1() {
        int year = 2019;
        printYear(year);
    }

    public static void printYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    //Задача 2
    public static void task2() {
        int clientAndroid = 1;
        int clientDeviceYear = 2019;
        suggestApp(clientAndroid, clientDeviceYear);
    }

    public static void suggestApp(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean outdateDevice = deviceYear < currentYear;
        if (osType == 0 && outdateDevice) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (osType == 0 && !outdateDevice) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
        if (osType == 1 && outdateDevice) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (osType == 1 && !outdateDevice) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
    }

    //Задача 3
    public static void task3() {
        int deliveryDistance = 95;
        int deliveryTime = calculateDeliveryDays(deliveryDistance);
        if (deliveryTime > 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставка не осуществляется на расстояние свыше 100 км");
        }
    }

    public static int calculateDeliveryDays(int interval) {
        if (interval <= 20) {
            return 1;
        } else if (interval <= 60) {
            return 2;
        } else if (interval <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}