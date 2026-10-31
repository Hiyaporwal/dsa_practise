import java.util.Scanner;

public class dowhilee {
    public static void main (String args[]) {
        int num ;
        Scanner s = new Scanner(System.in) ;
        
        num = s.nextInt() ;
        do{
            System.out.println(num+" ") ;
            ++num ;
        }
        while(num<=10) ;
        s.close() ;
    }
    
}
