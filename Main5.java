import java.io.File;
 
public class Main5 {
    public static void main(String[] args) {
         
        File file = new File("Z:/Информатика/Java.txt");
        if(file.exists()) {
        if(file.isFile()) {  
                    System.out.println("Файл бар!");         
                } else if(file.isDirectory()){
                    System.out.println("Бул каталог");
            } else {
                    System.out.println("Файл жок");   
            }
        }
    }
}