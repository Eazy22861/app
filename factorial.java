import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = input.nextInt();

        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Факториал числа " + number + " равен " + factorial);
    }
}