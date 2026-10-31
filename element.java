import java.util.*;
public class element{
    public static int[] array(int[]arr){
        int n = arr.length ;
        int pos = 0 ; 
        int neg = 1 ; 
        int[] target = new int[n];
        for(int i = 0 ; i<n ;i++)
            {
            if(arr[i]>0){
                target[pos] = arr[i];
                pos+=2 ;
            }
            else {
                target[neg] = arr[i];
                neg+=2 ;
            }
        }
        return target ;

    }
    public static void main(String args[]){
        int[] arr = {3,7,-2,-5,6,4,-3,2} ;
        int[] result = array(arr) ;
        for(int i = 0 ; i<result.length ; i++){
            System.out.print(result[i]+" ");
        }
    }
}