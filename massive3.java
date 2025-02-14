import java.util.Arrays;

public class massive3 {
    public static void main(String[] args) {
        int[] array = {23, 45, 67, 89, 34, 56, 78, 90, 100, 44};
        
        int minElement = array[0];
        int maxElement = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            } else if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        
        System.out.println("Бастапқы массив: " + Arrays.toString(array));
        System.out.println("Ең үлкен элемент: " + maxElement);
        System.out.println("Ең кіші элемент: " + minElement);
    }
}