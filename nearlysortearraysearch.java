public class nearlysortearraysearch {
    public static int array(int arr[] ,int target){
        int n = arr.length ;
        int start = 0 ;
        int end = n-1 ; 
        while(start<=end){
            int mid = start + (end-start)/2 ; 
            if(arr[mid]==target){
                return mid ; 
            }
            if(arr[mid+1]==target && mid+1<n){
                return mid ;
            }
            if(arr[mid-1]==target && mid-1>=0){
                return mid-1 ;
            }
            if(arr[mid]<target){
                start = mid + 2 ;

            }
            else {
                end = mid -2 ;
            }
        }
        return -1 ;
    }
    public static void main(String args[]){
        int arr[] = {10, 3, 40, 20, 50, 80, 70} ;
        int target = 70 ;
        int ans = array(arr,target) ;
        System.out.print(ans);
    }
    
}
