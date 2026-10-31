import java.util.Scanner ;

public class elseif {
    public static void main(String args[]) {
        int marks ;
        System.out.println("enter your marks") ;
        Scanner s = new Scanner(System.in) ;
        marks = s.nextInt() ;
        if(marks>=90) {
            System.out.println("you got s grade") ;
        }
        else if (marks>=80 && marks<90) {
            System.out.println("you got A+ grade") ;
        }
        else if (marks>=70 && marks<80) {
            System.out.println("you got A grade") ;
        }
        else if (marks>=60 && marks<70) {
            System.out.println("you got B grade") ;
        }
        else if(marks>=50 && marks<60) {
            System.out.println("you got C grade") ;
        }
        else {
            System.out.println("you are fail") ;
        }
    }
    
}
