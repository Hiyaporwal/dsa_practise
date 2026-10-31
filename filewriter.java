import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String args[]) {
        try{
            FileWriter f = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\LV.txt") ;
            try {
                f.write("java programing is best");
            }
            finally{
                f.close() ;
            }
            System.out.println("successfully wrote data in file") ;

        }
        catch(IOException i){
            System.out.println(i) ;

        }
    }
    
}
