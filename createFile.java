import java.io.File;

public class createFile {
    public static void main(String args[]) {
        File f = new File("C:\\Users\\HP\\OneDrive\\Desktop\\LC.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}