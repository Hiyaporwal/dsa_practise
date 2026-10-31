import java.util.Scanner ;
class first {
    public static void main (String args[]) {
        int pwd ;
        Scanner s = new Scanner(System.in) ;
        pwd = s.nextInt();
        if(pwd==3456) {
            System.out.println("You are logged in") ;
        }
        else {
            System.out.println("wrong password") ;
        }
    }
}