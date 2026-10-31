import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String args[]) {
        try {
            FileReader r = new FileReader("C:\\Users\\HP\\OneDrive\\Desktop\\LV.txt") ;
            try{
                int i ;
                while((i=r.read())!=-1){
                 System.out.print( (char)i) ;
                }

            }
            finally{
                r.close() ;
            }
        }
        catch(IOException i){
             System.out.println("exception handeled") ;
        }
    }
    
}
