import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main20 {
    public static void mian(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try {
            System.out.print("Введите первую дату и время (в формате yyyy-MM-dd HH:mm:ss): ");
            String firstInput = scanner.nextLine();
            LocalDateTime firstDateTime = LocalDateTime.parse(firstInput, formatter);

            System.out.print("Введите вторую дату и время (в формате yyyy-MM-dd HH:mm:ss): ");
            String secondInput = scanner.nextLine();
            LocalDateTime secondDateTime = LocalDateTime.parse(secondInput, formatter);

            if (firstDateTime.isBefore(secondDateTime)) {
                System.out.println("Первая дата и время раньше второй");
            } else if (firstDateTime.isAfter(secondDateTime)) {
                System.out.println("Первая дата и время позже второй");
            } else {
                System.out.println("Обе даты однаковы");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: неверный формат ввода. Пожалуйста, используйте формат yyyy-MM-dd HH:mm:ss.");
        }
    }
}