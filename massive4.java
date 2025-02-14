public class massive4 {
    public static void main(String[] args) {
        int[] array = {23, 45, 67, 89, 34, 56, 78, 90, 100, 44};
        
        System.out.println("Тақ сандар:");
        for (int number : array) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}