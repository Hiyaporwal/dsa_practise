 import java.util.Scanner ;
 abstract class bank {
    public String Name = "mybank" ;
    public String IFSC = "mybank123" ;
    
    public void bankdetail() {
        System.out.println("bank name" + Name + "IFSC code" + IFSC) ;
    }
    abstract void deposite() ;
    abstract void withdraw() ;
    abstract void checkbal() ;

}
class bankService extends bank {
    private double bal = 5000 ;
    private int pwd ;
    public double money ;

    public void deposite () {
        System.out.println("enter password") ;
         Scanner s = new Scanner(System.in) ;
        pwd = s.nextInt() ;
        if(pwd==123) {
            System.out.println("enter deposite amount") ;
            money = s.nextDouble() ;
            bal = bal+money ;
            System.out.println("deposite money" + money) ;
            System.out.println("total balance" + bal) ;
        }
        else {
            System.out.println("incorrect password") ;
        }
    }
    public void withdraw () {
        System.out.println("enter withdraw amount") ;
        Scanner s = new Scanner(System.in) ;
        pwd = s.nextInt() ;
        if(pwd==123){
             money = s.nextDouble() ;
        bal = bal- money ;
        System.out.println("withdraw money" + money) ;
        System.out.println("total balance" + bal) ;

        }
        else {
            System.out.println("incorrect password") ;
        }
       
    }
    public void checkbal () {
        System.out.println("enter password") ;
        Scanner s = new Scanner(System.in) ;
        pwd = s.nextInt() ;
        if(pwd==123) {
            System.out.println("total balance" + bal) ;
        }
        else {
            System.out.println("incorrect password") ;
        }
    }
}
public class abstractt {
    public static void main(String args[]) {
        bankService b = new bankService() ;
        b.bankdetail() ;
        int ch ;
        Scanner s2 = new Scanner(System.in) ;
        ch = s2.nextInt() ;
        System.out.println("1 deposite") ;
        System.out.println("2 withdraw") ;
        System.out.println("3 checkbalance") ;

        switch(ch) {
            case 1 : b.deposite() ;
            break ;
            case 2 : b.withdraw();
            break ;
            case 3 : b.checkbal() ; 
            break ;
            default : System.out.println("invalid choice") ;

        }

        
    }
    
}
