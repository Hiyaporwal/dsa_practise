
// public class thiss {
//     void show () {
//         System.out.println(this) ;
//     }
//     public static void main(String args[]) {
//         thiss obj = new thiss() ;
//         System.out.println(obj) ;
//         obj.show() ; 
//     }
    
// }


// class thiss {
//     int a ;
//     thiss(int a){
//         this.a = a ;
//     }
//     void show() {
//         System.out.println(a);

//     }
//     public static void main(String args[] ){
//         thiss obj = new thiss(100) ;
//         obj.show() ;
//     }
// }

class thiss {
    thiss(){
        System.out.println("hello learning") ;
    }
    thiss(int a) {
        this() ;
        System.out.println(a) ;
    }
    public static void main(String args[]) {
        thiss obj = new thiss(100) ;

    }

}
