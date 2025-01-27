import java.io.File;

public class Main2 {

    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.exists()) {
            System.out.println("Файл бар!");
            System.out.println("Файл атауы: " +file.getName());
            System.out.println("Абсолютты жолы: " + file.getAbsolutePath());
            System.out.println("Сонгы озгертылкен кун: " + file.lastModified());
        } else {
            System.out.println("Файл жок.");
        }
    }
}
