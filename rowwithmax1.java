public class rowwithmax1 {
    public static int array(int arr[][]){
        int rowcount = arr.length ;
        int colcount = arr[0].length ;
        int maxrow = -1 ;
        int row = 0 ;
        int col = colcount-1 ;

        while(row<rowcount && col>=0){
            if(arr[row][col]==0){
                row ++ ;

            }
            else {
                maxrow = row ;
                col-- ;
            }
        }
        return maxrow ;
    }
    public static void main(String args[]){
        int arr[][] = {{0,0,0,1},{0,1,1,1},{0,0,1,1}} ;
        int x = array(arr) ;
        System.out.print(x);
    }
    
}
