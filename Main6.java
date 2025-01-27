import java.io.File;
 
public class Main6 {
    public static void main(String[] args) {
         
        // определяем объект для каталога
        File dir = new File("C://SomeDir");
        // если объект представляет файл
        if(dir.isFile())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : dir.listFiles()){
              
                if(item.isFile()){
                      
                    System.out.println(item.getName() + "  \t folder");
                
                } else{
                      
                     System.out.println(item.getName() + "\t file");   
                }
            }
        }
    }
}