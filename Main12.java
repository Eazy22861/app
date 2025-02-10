import java.time.LocalDate;
import java.time.ZoneId;

public class Main12 {
    public static void main(String[] args) {
        ZoneId timezone = ZoneId.of("Asia/Shanghai");    
        LocalDate today = LocalDate.now(timezone);
        System.out.println("Сейчас в Шангхае: " + today);
    }
}