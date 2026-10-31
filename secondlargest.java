import java.util.* ;
public class secondlargest{
    public static int slargest(int arr[]){
        int n = arr.length ;
        int largest = arr[0];
        int slargest = -1 ;
        for(int i = 1 ; i<n; i++){
            if(arr[i]>largest){
                slargest = largest ;
                largest = arr[i] ; 

            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest = arr[i];
            }
           
        }
        return slargest ;

        

    }
    public  static int ssmalest(int arr[]){
        int n = arr.length ;
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE ;
        for(int i = 1 ; i<n ; i++){
            if(arr[i]<smallest){
                ssmallest = smallest ;
                smallest = arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<ssmallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest ;

    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int slargest = slargest(arr);
        System.out.println("second largest"+ slargest) ;
        int ssmallest = ssmalest(arr);
        System.out.print("second smallest"+ ssmallest) ;
    }
}