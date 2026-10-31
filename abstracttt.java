 abstract class animal{
    void legs () {
        System.out.println("all animals have 4 legs") ;
    }
    abstract void sound() ;
    abstract void eat() ;

}
class Cat extends animal{
   
    @Override
    
    void sound() {
        System.out.println("meow meow") ;
    }
    void eat() {
        System.out.println("fish eating") ;
    }

}
class Cow extends animal {
    @Override
    void sound() {
        System.out.println("Oooo Ooo") ;
    }
    void eat() {
        System.out.println("grass eating") ;
    }
}
public class abstracttt {
    public static void main(String args[]) {
        Cat c = new Cat() ;
        Cow s = new Cow() ;

        c.sound() ; c.eat() ; c.legs();
        s.eat() ; s.eat() ; s.legs() ;

    }
    
}
