// public class array {
//     public static void main (String args[]) { 
//         int arr[] = {23,56,78,45,32,97,65} ;
//         // System.out.println(arr[3]) ;
//         for(int i = 0 ; i< arr.length ; i++) {
//             System.out.println(arr[i]) ;
//         }
//     }
    
// }


// public class array{
//     public static void main(String args[]){
//         int arr[];
//         arr = new int[5];
//         int brr[] = {3,5,3,4};
//         System.out.print(brr[2]);
//     }
// }



// Accessing all element with for loop
// public class array{
//     public static void main(String args[]){
//         int arr[] = {23,45,12,45,76,28,89};
//         for(int i = 0 ; i<=arr.length ; i++){
//             System.out.println(i +"-"+ arr[i]);
//         }
        
//     }
// }



// Accessing all element with for each loop
// public class array{
//     public static void main(String args[]){
//         int arr[] = {12,45,23,54,23,78};
//         for(int var : arr){
//             System.out.println(var);
//         }
//     }
// }


// taking input in an array
// import java.util.Scanner;

// public class array {
//     public static void main(String args[]) {

//         int arr[] = new int[7];
//         Scanner sc = new Scanner(System.in);

//         // Input
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("provide array for index"+ i);

//             arr[i] = sc.nextInt();
//         }

//         // Output
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }

//         sc.close();
//     }
// }

// Finding multiplication of array
// import java.util.Scanner ;
// public class array{
//     public static void main(String args[]){
//         int arr[] = new int[7];
//         Scanner sc = new Scanner(System.in);
        
//         for(int i = 0 ; i<arr.length ; i++){
//             System.out.println("enter element of index"+i);
//             arr[i] = sc.nextInt() ;
//         }

//         int mul = 1 ;
//         for(int i = 0 ; i< arr.length ; i++ ){
//             mul = mul*arr[i];
           
//         }
//          System.out.println("mul"+mul) ;


        
//     }
// }



// finding maximum value in array
// public class array {
//     public static void main(String args[]){
//         int arr[] = {3,6,2,9,5,10};
//         int maxvalue = arr[0];   
//         for(int i = 0 ; i<arr.length ; i++){
//             if(arr[i]>maxvalue){
//                 maxvalue = arr[i];
//             }
            
//         }
//         System.out.println(maxvalue) ;
//     }
// }


// find minimum value in array

// public class array{
//     public static void main(String args[]){
//         int arr[]= {3,5,2,7,1,8};
//         int minvalue = arr[0];
//         for(int i = 0 ; i<arr.length; i++){
//             if(arr[i]<minvalue){
//                 minvalue = arr[i];
//             }
            
//         }
//         System.out.print(minvalue) ;

//     }
// }






// 2D arrays

// import java.util.Scanner ; 
// public class array{
//     public static void main(String args[]){
//         int arr[][] = new int[3][3];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter 9 element") ;

//         for(int i = 0 ; i<arr.length ; i++){
//             for(int j = 0 ; j<arr.length;j++){
                
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         for(int i= 0 ;i<arr.length;i++){
//             for(int j = 0 ;j<arr.length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }

//         System.out.print(arr[2].length);
        
        

    

//     }
// }

// Sum of two matrix
// import java.util.Scanner ; 
// public class array{
//     public static void main(String args[]){
//         int A[][] = new int[2][2];
//         int B[][] = new int[2][2];
//         int C[][] = new int[2][2];

//         Scanner sc = new Scanner(System.in) ;
//         System.out.println("element for first array");
//         for(int i = 0 ; i<A.length ; i++){
//             for(int j = 0 ; j<A[i].length ; j++){
//                 A[i][j] = sc.nextInt();
//             }

//         }
//         System.out.println("element for second array");
//         for(int i = 0 ; i<B.length ; i++){
//             for(int j = 0 ; j<B[i].length;j++){
//                 B[i][j]= sc.nextInt() ;
//             }
//         }
//         System.out.println("sum of two element") ;
//         for(int i = 0 ; i<C.length;i++){
//             for(int j = 0 ; j<C[i].length;j++){
//                 C[i][j] = A[i][j] + B[i][j] ;
//                 System.out.print(C[i][j]+" ");
//             }
//             System.out.println() ;
//         }
        
//     }
// }




// // finding maximum element in 2D array
// import java.util.Scanner ; 
// public class array{
//     public static void main(String args[]){
//         int arr[][] = new int[2][2] ;
//         Scanner sc = new Scanner(System.in) ;
//         for(int i = 0 ; i<arr.length ; i++){
//             for(int j = 0 ; j<arr.length ; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("maximum element is");
//         int maxvalue = arr[0][0] ;
//         for(int i = 0 ; i<arr.length ; i++){
//             for(int j = 0 ; j<arr.length ; j++)
//                 {
//                 if(arr[i][j]>maxvalue){
//                     maxvalue = arr[i][j] ;
//                 }
//             }
//         }
//         System.out.println(maxvalue) ;
//     }
// }



