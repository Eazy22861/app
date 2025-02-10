import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую дату (yyyy-MM-dd): ");
        String firstDateInput = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);

        System.out.print("Введите вторую дату (yyyy-MM-dd): ");
        String secondDateInput = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

        int monthsBetween = (int) java.time.temporal.ChronoUnit.MONTHS.between(firstDate, secondDate);

        System.out.println("Разница в месяцах между этими датами: " + Math.abs(monthsBetween));
    }
}
