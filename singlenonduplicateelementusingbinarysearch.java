public class singlenonduplicateelementusingbinarysearch{
    public static int array(int arr[]){
        int n = arr.length ;
        int start = 0 ; 
        int end = n-1 ; 
        while(start<=end){
            int mid = start + (end-start)/2 ; 
            if(start==end){
                return arr[start];
            }

            int currentvalue = mid ; 
            int prevvalue = -1 ; 
            if(mid-1>=0){
                prevvalue = arr[mid-1];
            }
            int nextvalue = -1 ;
            if(mid+1<=n){
               nextvalue = arr[mid+1];
            }
            if(prevvalue!=currentvalue && nextvalue!=currentvalue){
                return currentvalue ;
                
            }
            if(currentvalue!=prevvalue && currentvalue==nextvalue){
                int startingindex = mid;
                if((startingindex & 1)==1){
                    // odd case 
                    end = mid - 1 ;
                    
                }
                else {
                    start = mid + 1 ;
                }
            }
            else if (currentvalue==prevvalue && currentvalue!=nextvalue){
                int endingindex = mid ; 
                if((endingindex &1)==1){
                    // endingindex is odd
                    start = mid + 1 ;
                }
                else {
                    end = mid -1 ;
                }
            }
            
        }
        return -1 ;
    }
    public static void main(String args[]){
        int arr[] = {10,10,20,20,30,30,40,50,50,60,60,70,70};
        int x = array(arr);
        System.out.print(x);
    }
}

