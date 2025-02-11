public class plus2 {
    public static void main(String[] args) {
        int[] array = {3, 6, 8, 9, 11, 12, 15};
        
        int sumOfEvenNumbers = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                sumOfEvenNumbers += number;
            }
        }

        System.out.println("Сумма четных чисел равна " + sumOfEvenNumbers);
    }
}