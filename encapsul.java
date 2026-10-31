import java.util.Scanner ;
class bank{
    private double bal = 5000 ;
    private int  pwd ;

    public void deposite(double money) {
        System.out.println("Enter password") ;
        Scanner s =new Scanner(System.in) ;
        pwd = s.nextInt() ;
        if(pwd==123) {
            bal= bal + money ;
            System.out.println("Deposited Money" + money) ;
            System.out.println("Total Balance" + bal) ;
        }
        else {
            System.out.println("incorrect password") ;
        }
    }
  public void withdraw(double money) {
    System.out.println("enter password") ;
    Scanner s = new Scanner(System.in) ;
    pwd = s.nextInt() ;
    if(pwd==123) {
        bal = bal- money ;
        System.out.println("withdrawn money" +money) ;
        System.out.println("total balance" + bal) ;
    }
    else {
        System.out.println("incorrect password") ;
    }
  }  
  public void checkbal() {
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
    
// }
class encapsul {
    public static void main(String args[]) {
        bank b= new bank () ;
        int ch ;
        System.out.println("1 deposite") ;
        System.out.println("withdraw");
        System.out.println("check balance") ;

        System.out.println("enter your choice") ;

        Scanner s2 = new Scanner(System.in) ;
        ch = s2.nextInt() ;

        switch (ch) {
            case 1:
               
                b.deposite(1000);
                break;
            case 2:
                
                b.withdraw(5001);
                break;
            case 3:
                b.checkbal();
                break;
            default:
                System.out.println("Invalid choice");
        }
        s2.close();
    }  
}
