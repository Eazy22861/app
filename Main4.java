import java.io.File;

public class Main4 {

    public static void main(String[] args) {
        File file = new File("path/to/file");

if (file.delete()) {  
	System.out.println(file.getName() + " deleted");   
} else {
	System.out.println(file.getName() + " not deleted");   
} 
    }
}