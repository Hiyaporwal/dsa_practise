public class searchin2DarrayII {
    public static boolean array(int arr [][] , int target){
        int rowcount = arr.length ; 
        int colcount = arr[0].length ; 

        int row = 0 ;
        int col = colcount-1 ; 
        while(row<rowcount && col>=0){
            if(arr[row][col]==target){
                return true ;
            }
            else if(arr[row][col]>target){
                col-- ;
            }
            else {
                 row ++ ;
            }
        }
        return false ;

    }
    public static void main(String args[]){
        int arr[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}} ;
        int target = 5 ;
        boolean x = array(arr , target) ;
        System.out.print(x);
    }

    
}
