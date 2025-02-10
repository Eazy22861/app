import java.time.LocalDate;

public class Main16 {
    public static void main(String[] args) {

        LocalDate initialDate = LocalDate.of(2019, 2, 28);

        LocalDate datePlusOneYear = initialDate.plusYears(1);

        LocalDate dateMinusThirtyYears = initialDate.minusYears(30);

        System.out.println("Первоначальная дата: " + initialDate);
        System.out.println("Дата через год: " + datePlusOneYear);
        System.out.println("Дата за 30 лет до этой: " + dateMinusThirtyYears);
    }
}