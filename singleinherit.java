class student {
    int rollno , marks ;
    String name ;
    void input() {
        System.out.println("enter roll no") ;
    }
}

public class singleinherit extends student {
    void disp() {
        rollno = 1 ;
        name = "hiya" ;
        marks = 98 ;
        System.out.println("marks"+marks+"name"+name+"marks"+marks) ;
    }
    public static void main(String args[]) {
        singleinherit r = new singleinherit() ;
         r.input() ; r.disp() ;
    }
    
}
