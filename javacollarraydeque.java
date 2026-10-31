import java.util.ArrayDeque ;

public class javacollarraydeque {
    public static void main(String args[]) {
        ArrayDeque<String> Name = new ArrayDeque<>() ; //FIFO
        Name.push("hiya") ;
        Name.push("jiya") ;
        Name.push("ritik") ;
        Name.push("raj") ;
        System.out.println(Name) ;
        Name.pop() ;
        System.out.println(Name) ;

    }
    
}
