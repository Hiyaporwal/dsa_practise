public class unboundbinarysearch {
    public static int array(int arr[] , int target){
        int n = arr.length ; 
        int i = 1 ;
        if(n==0){
            return -1 ;
        }
        if(arr[0]== target){
            return 0 ;
        } 
        while(i<n && arr[i]<target){
            i = i*2 ;
        }
        int start = i/2 ; 
        int end = Math.min(i,n-1) ;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(arr[mid]==target){
                return mid ;
            }
            else if(arr[mid]<target){
                end = mid-1 ;
            }
            else {
                start = mid +1 ;
            }
        }
        return -1 ;

    }
    public static void main(String args[]){
        int arr[] = {3,5,7,9,10,90,100,130,140,160,170} ;
        int target = 9;
        int x = array(arr,target) ;
        System.out.print(x);
    }
}