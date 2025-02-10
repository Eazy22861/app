import java.time.LocalDate;

public class Main13 {
    public static void main(String[] args) {
        LocalDate hundredthDay = LocalDate.ofYearDay(2019, 100);
        System.out.println("100-шы кун = " + hundredthDay);
    }
}