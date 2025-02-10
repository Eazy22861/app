import java.util.Scanner;

public class plus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int N = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("Складывание чисел от 1 до N равно " + sum);
    }
}