import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        if (a > b) {
            System.out.println("Большее число: " + a);
        } else if (a < b) {
            System.out.println("Большее число: " + b);
        } else {
            System.out.println("Числа равны.");
        }

        scanner.close();
    }
}