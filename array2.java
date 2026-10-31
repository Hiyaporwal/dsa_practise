import java.util.Arrays;
import java.util.Scanner ;
public class array2 {
    public static void main(String args[]) {
        int arr[] = new int[6] ;
        System.out.println("enter array element") ;
        Scanner s = new Scanner(System.in) ;
        for(int i=0 ; i<6 ; i++){
            arr[i] = s.nextInt() ;

        }
        Arrays.sort(arr) ;
         System.out.print("\n Array element :") ;
        for(int b :arr){
            System.out.println(b) ;
        }
    }
}
