import java.io.File;

public class Main3 {

    public static void main(String[] args) {
        File file = new File("/home/user/documents/example.txt");

        String parent = file.getParent();
        System.out.println("Ата-аналык каталог: " + parent);
    }
}