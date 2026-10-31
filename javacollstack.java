import java.util.Stack ;
public class javacollstack {
    public static void main(String args[]) {
        Stack<String> Name = new Stack<>() ; // LIFO
        Name.push("hiya") ;
        Name.push("jiya") ;
        Name.push("ritik") ;
        Name.push("raj") ;
        System.out.println(Name) ;
        Name.pop() ;
        System.out.println(Name) ;


    }
    
}
