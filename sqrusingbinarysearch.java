public class sqrusingbinarysearch {
    public static int sqrt(int x){
        int start = 0 ; 
        int end = x ;
        int ans = -1 ;
        if(x==0){
            return 0 ; 
        }
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(mid==x/mid)
                {
                return mid ;
        
            }
            else if(mid > x/mid){
                end = mid-1;
    

            }
            else {
                ans = mid ; 
                start = mid+1 ;
            }
        }
        return ans ;
    }
    public static void main(String args[]){
        int x = 56 ; 
        System.out.println(sqrt(x));    
    }
}