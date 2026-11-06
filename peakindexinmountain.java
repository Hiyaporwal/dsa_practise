public class peakindexinmountain {
    public static int array(int arr[]){
        int n = arr.length ;
        int start = 0 ; 
        int end = n-1 ; 
        int ans = -1 ; 
        while(start<=end){
            int mid = start +(end-start)/2 ; 
            if(mid== n-1 || arr[mid]>arr[mid+1]){
                ans = mid ; 
                end = mid-1 ;
            }
            else {
                start = mid+1 ;
            }
        }
        return ans ;
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,35,25};
        System.out.println(array(arr));
    }
    
}
