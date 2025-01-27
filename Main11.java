import java.io.*;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("text.txt");
            writer.write(text);
            writer.close();
            System.out.println("Текст сохранен в файл 'text.txt'.");
        } catch (IOException e) {
            System.out.println("Текст сохранен в файл.");
            e.printStackTrace();
        }

        try {
            File file = new File ("text.txt");
            Scanner fileScanner = new Scanner(file);
            int wordCount = 0;

            while (fileScanner.hasNext()) {
                fileScanner.next();
                wordCount++;
            }
            System.out.println("Количество слов в файле: " + wordCount);
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при открытии файла.");
            e.printStackTrace();
        }
    }
}