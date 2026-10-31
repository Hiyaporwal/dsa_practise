import java.util.Scanner;
class marks{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int marks = obj.nextInt();
        if(marks>=90){
            System.out.println("A Grade") ;
        }
        else if (marks>=70){
            System.out.println("B Grade");
        }
        else if (marks >=50){
            System.out.println("C Grade");
        }
        else if(marks>=35){
            System.out.println("D Grade") ;
        }
        else {
            System.out.println("fail");
        }
        
    
    }
}
