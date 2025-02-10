import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        try {
            System.out.print("Введите дату и время начала события (в формате dd.MM.yyyy HH:mm): ");
            String startInput = scanner.nextLine();
            LocalDateTime startDateTime = LocalDateTime.parse(startInput, formatter);

            System.out.print("Введите дату и время окончания события (в формате dd.MM.yyyy HH:mm): ");
            String endInput = scanner.nextLine();
            LocalDateTime endDateTime = LocalDateTime.parse(endInput, formatter);

            if (endDateTime.isBefore(startDateTime)) {
                System.out.println("Ошибка: время окончания события не может быть раньше врмени начала.");
                return;
            }

            Duration duration = Duration.between(startDateTime, endDateTime);
            long hours = duration.toHours();
            long minutes = duration.toMinutes() % 60;

            System.out.printf("Продолжительность события: %d часов и %d минут.\n", hours, minutes);
        } catch (Exception e) {
            System.out.println("Ошибка: неверный формат ввода. Пожалуйста, используйте формат dd.MM.yyyy HH:mm.");
        }
    }
}