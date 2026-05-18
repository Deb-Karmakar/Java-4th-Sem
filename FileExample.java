import java.io.File;
import java.io.IOException;

class FileExample {
    public static void main(String[] args) {
        File file = new File("example.txt"); // Creates a file object
        
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
