class shape {
    void show() {
        System.out.println("cant say shape") ;
    }
}
class square extends shape {
    
    @Override
    void show() {
        super.show() ;
        System.out.println("Square shape") ;
    }
}


public class demo {
    public static void main(String args[]){
        square s = new square() ;
        s.show() ;
    }
    
}
