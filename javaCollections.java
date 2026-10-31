import java.util.ArrayList ;

public class javaCollections {
    public static void main(String args[]) {
        ArrayList<String> Name = new ArrayList<String>() ;
       Name.add("Ankit")  ;
       Name.add("hiya") ;
       Name.add("jiya") ;
       Name.add("raj") ;

       System.out.println(Name) ;
       Name.add( 1 , "giva") ;
       System.out.println(Name);
       Name.remove(0) ;
       System.out.println(Name) ;
       Name.set(0 , "kiya") ;
       System.out.println(Name) ;
       System.out.println(Name.get(2)) ;
       Name.clear() ;
       System.out.println(Name) ;
    }
    
}
