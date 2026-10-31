class B extends Thread 
{
    @Override
    public void run() 
    {

        try
        {for(int i = 1 ; i<=5 ; i++ )
        {
            System.out.println("hiya") ;
            Thread.sleep(1000) ;
        }
    }

        catch(InterruptedException i){

        }
        

}
    }

class A {
    public static void main(String args[]) throws InterruptedException {
        B t = new B() ;
        t.start() ;
        for(int i = 1 ; i<+5 ;i++){
            System.out.println("Raj");
            Thread.sleep(1000) ;
        }
    }
}