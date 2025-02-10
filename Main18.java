import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Введите свое день рождение (yyyy-MM-dd): ");
        String birthDateInput = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateInput, formatter);

        LocalDate today = LocalDate.now();

        LocalDate nextBirthday = birthDate.withYear(today.getYear());

        if (nextBirthday.isBefore(today) || nextBirthday.equals(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        long daysUntilNextBirthday = ChronoUnit.DAYS.between(today, nextBirthday);

        System.out.println("До вашего следующего дня рождения осталось " + daysUntilNextBirthday + " дней.");
    }
}
