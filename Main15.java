import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main15 {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();
        String dayOfWeek = currentDate.getDayOfWeek().toString();

        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("День: " + day);
        System.out.println("День недели: " + dayOfWeek);
    }
}