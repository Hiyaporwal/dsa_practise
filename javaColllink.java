import java.util.LinkedList ;

public class javaColllink {
    public static void main(String args[]) {
        LinkedList<String> Name = new LinkedList<String>() ;
        Name.add("hiya") ;
        Name.add("jiya") ;
        Name.add("kiya") ;
        Name.add("ankit") ;
        System.out.println(Name) ;
        Name.addFirst("rohit");
        System.out.println(Name) ;
        Name.add("amir") ;
        System.out.println(Name) ;
        Name.add(2, "ritik") ;
        System.out.println(Name) ;
        Name.remove() ;
        System.out.println(Name) ;
        Name.removeLast() ;
        System.out.println(Name) ;

        for(String str :Name){
            System.out.print(str + " ") ;
        }

    }
    
}
