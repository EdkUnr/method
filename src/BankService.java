import java.time.LocalDate;

public class BankService {

    public static void main(String[] args) {
        // 1. Проверка високосного года
        checkLeapYear(2021);

        // 2. Предложение установки приложения
        suggestApp(0, 2014); // iOS, 2014 год
        suggestApp(1, 2016); // Android, 2016 год

        // 3. Расчёт срока доставки
        int deliveryDistance = 95; // Пример дистанции
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка на такое расстояние не осуществляется");
        }
    }

    public static void checkLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год — високосный год.");
        } else {
            System.out.println(year + " год — невисокосный год.");
        }
    }

    public static void suggestApp(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName = (osType == 0) ? "iOS" : "Android";

        if (deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else {
            System.out.println("Установите приложение для " + osName + " по ссылке");
        }
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return 0; // Доставка не осуществляется
        }
    }
}
