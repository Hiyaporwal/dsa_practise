// class A {
//     int a = 10 ;
// }
// class B extends A{
//     int a = 20 ;
//     void show() {
//         System.out.println(super.a) ;
//         System.out.println(a) ;
       
//     }
// }


// public class superr {
//     public static void main(String args[]) {
//         B obj = new B () ;
//         obj.show() ;
//     }
    
// }



// class A {
//     void show () {
//         System.out.println("hello viewers") ;
//     }
// }
// class B extends A {
//     void show () {
//         System.out.println("hello learner") ;
//         super.show() ;
//     }
// }
// class superr {
//     public static void main(String args[]) {
//         B obj = new B() ;
//         obj.show() ;
//     }
// }


class A {
    A() {
        System.out.println("hello viewers") ;
    }
}
class B extends A {
    B () {  
        System.out.println("hello learner") ;
    }
}
class superr{
    public static void main(String args[]) {
        B obj = new B () ;
    }
}

