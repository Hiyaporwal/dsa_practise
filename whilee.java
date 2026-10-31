import java.util.Scanner ;
public class whilee {
    public static void main(String args[])  {
        int num ;
        System.out.println("enter number") ;
        Scanner s = new Scanner(System.in) ;
        num = s.nextInt() ;
        while(num>0){
            if(num%2==0) {
                System.out.println("number is even") ;
                break ; // this while breaks the loop and stop infinite while loop
            }
            else {
                System.out.println("number is odd") ;
                break ;
            }
        }
        System.out.println("while loop ended") ;

    }
    
}
