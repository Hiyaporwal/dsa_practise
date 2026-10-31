import java.util.Scanner ;
public class forr{
    public static void main(String args[]) {
        int num ;
        System.out.println("enter a number") ;
        Scanner s = new Scanner(System.in) ;
        num = s.nextInt() ;
        for(int i = 1 ; i<=10 ; i++){
            System.out.println(num + " x " + i + " = " + (num*i)) ;
        }
    }
    
}
