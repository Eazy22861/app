import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Введите число: ");
        int number = input.nextInt();
        
        int originalNumber = number;
        
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " - палиндром.");
        } else {
            System.out.println(originalNumber + " - не палиндром.");
        }
        

        input.close();
    }
}