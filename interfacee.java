interface vehical {
    String Name = "TVS" ;
    int speed = 100 ;

    void start() ;
    void  stop() ;

    default void color() {
        System.out.println("red" ) ;
    }
    static void speed() {
        System.out.println("Tvs speed is 100 km/h") ;
    }


}

public class interfacee implements vehical 
{
   

        // @Override 
        public void start()
        {
            System.out.println("Start(): insert key & press start button" +Name) ;
        }
        // @Override
        public void stop() {
            System.out.println("Stop(): exit key") ;
        }
        public static void main(String args[]) {
             System.out.println(Name) ;
             System.out.println(speed) ;
            interfacee s = new interfacee() ;
            s.start() ; s.stop() ; s.color() ;

        }
    
}
