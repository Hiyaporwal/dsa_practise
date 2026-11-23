public class searchin2Darray1{
    public static int array(int arr[][] , int target){
        int rowcount = arr.length ;
        int colcount = arr[0].length ;

        int n = rowcount*colcount ; 

        int start = 0 ; 
        int end = n-1 ;
        while(start<=end){
            int mid = start + (end-start)/2 ; 
            int rowindex = mid/colcount ;
            int colindex = mid%colcount ;
            if(arr[rowindex][colindex]==target){
                return mid ;
            }
            else if (arr[rowindex][colindex]>target){
                end = mid-1 ;
            }
            else {
                start = mid + 1 ;
            }


        }
        return -1 ;
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}} ;
        int target = 5 ;
        int x = array(arr , target) ;
        System.out.print(x);
    }
}