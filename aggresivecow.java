import java.util.* ;
public class aggresivecow {
    public static boolean isvalidAns(int nums[] , int k , int mindistance){
        int cowcount = 1 ;
        int lastpostion = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]-nums[lastpostion]>=mindistance){
                cowcount ++ ;
                lastpostion = i ;
                if(cowcount==k){
                    return true ;
                }
            }
        }
        return false ;

    }
    public static int  array(int nums[] , int k ){
        Arrays.sort(nums);
        int n = nums.length ;
        int start = 1 ; 
        int end =  nums[n-1] - nums[0];
        int ans = -1 ;
         while(start<=end){
            int mid = start +(end-start)/2 ;
            if(isvalidAns(nums,k,mid)){
                ans = mid ;
                start = mid+1 ; 

            }
            else {
                end = mid-1 ;
            }
         }
         return ans;

    }
    public static void main(String args[]){
        int nums[] = {1,2,4,8,9};
        int k = 4 ;
        int x = array(nums,k);
        System.out.print(x);
    }
    
}
