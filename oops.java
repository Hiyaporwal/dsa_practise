public class oops {
    
        int age = 21 ;
        int weight = 56 ;
        String color = "light" ;

        void eat() {
            System.out.println("i am eating") ;
        }
        void sleep() {
            System.out.println("i am sleeping") ;
        }
       public static void main(String args[]) {
        oops obj = new oops() ;
        System.out.println(obj.age) ;
        System.out.println(obj.weight) ;
        System.out.println(obj.color) ;
        obj.eat() ;
        obj.sleep() ;
    }
    
}
