// import java.util.*;
// public class array7{
//     public static List<Integer> rowSums(int[][]arr){
//         //Implementation logic
//         List<Integer> result = new ArrayList<>();
//         int m = arr.length ;
//         int n = arr[0].length;
//         //traversal
//         for(int row = 0 ; row<m ; row++){
//             int sum = 0 ; 
//             for(int col = 0 ; col<n ; col++){
//                 int value = arr[row][col];
//                 sum = sum + value ;
//             }
//             result.add(sum);
//         }
//         return result;
//     }
//     public static void main(String args[]){
//         int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        
//         List<Integer> sums = rowSums(arr);
//         System.out.println(sums);
//     }
// }



// // wave print a matrix
// import java.util.* ;
// public class array7 {
//     public static void array(int [][]arr)
//     {
        
//         int n = arr.length ; 
//         int m = arr[0].length ;
//         for(int col = 0 ; col< m ; col++)
//         {
//             if(col%2==0){
//                 for(int row = 0 ; row<n ;row++){
//                     System.out.println(arr[row][col]);
//                 }
//             }
//             else {
//                 for(int row = n-1 ; row>0 ; row--){
//                     System.out.println(arr[row][col]);
//                 }
//             }
//         }
        
//     }
//     public static void main(String args[]){
//         int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//         array(arr);
        
       
//     }
// } 



public class array7{
    public static int[][] array(int matrix[][]){
        int n = matrix.length ;
        int m = matrix[0].length ;
        int transpose [][]= new int[n][m];
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j<m ; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose ; 

        
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6}};
      
        int transpose[][] = array(matrix);

        int n = transpose.length ;
        int m = transpose[0].length ;
       
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                System.out.print(transpose[i][j]);
            }
        }
    }
}