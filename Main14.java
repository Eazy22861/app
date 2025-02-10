import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main14 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2019, 2, 22);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = date.format(formatter);

        System.out.println(formattedDate);
    }
}
