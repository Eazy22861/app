import java.io.File;
public class Main {

    public static void main(String[] args) {
        // Файлдын атын енгызу
        File file = new File("example.txt");

        // Абсолютты жолды шыгару
        System.out.println("Абсолютты жол: " + file.getAbsolutePath());
    }
}