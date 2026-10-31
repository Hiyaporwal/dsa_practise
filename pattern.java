// pattern1

// ***
// ***
// ***

// public class pattern {
//     public static void main (String args[]){
//         int n = 3 ;                                          
//         for(int row = 1 ; row<= n ;  row++) {
//             for(int col = 1 ; col <= n ; col++){
//                 System.out.print("*") ;

//             }
//         System.out.println() ;
//         }

//     }
    
// }





// pattern 2

// *****
// *****
// *****
// *****


// public class pattern {
//     public static void main(String args[]){
//         int n = 4 ;
//         for(int row = 1 ; row<=n ; row++){
//             for(int col = 1 ; col<= n+1 ; col++){
//                 System.out.print("*") ;
//             }
//         System.out.println() ;    
            
//         }
        
//     }
// }




// pattern 3
// *
// **
// ***
// ****
// *****

// public class pattern{
//     public static void main(String args[]){
//         int n = 5 ;
//         for(int row = 1 ; row <= n ; row++){
//             for(int col = 1 ; col<=row ; col++){
//                 System.out.print("*") ;
//             }
//             System.out.println();
//         }
//     }
// }

 

// pattern 4

//    *****
//   *****
//  *****
// *****

// public class pattern{
//     public static void main(String args[]){
//         int n = 5 ;
//         for(int row = 1 ; row<=n ; row++){
//             for(int col = 1 ; col<=(n-row) ;col++) {
//                 System.out.print(" ") ;
//             }
//             for(int col = 1 ; col<=n;col++ ){
//                 System.out.print("*");
//             }
//             System.out.println() ;
            
//         }
//     }
// }




// pattern 5 
// ****
// ***
// **
// *


// public class pattern{
//     public static void main(String args[]){
//         int n = 5 ;
//         for(int row = 1 ; row<=n ; row++){
//             for(int col = n  ; col >=row ; col--){
//                 System.out.print("*");

//             } 
//             System.out.println();
//         }
//     }
// }


// pattern 6
//     *
//    ***
//   *****
//  *******
// *********

// public class pattern {
//     public static void main(String args[]){
//         int n = 5 ;
//         for(int row = 1 ; row <=n ; row++){
//             for(int col = 1 ; col <=(n-row) ; col++)
//             {
//                 System.out.print(" ");
//             }
//             for(int col = 1; col<= 2*row-1; col++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();

            
//         }
//     }
// }


// pattern 7
//     *
//    **
//   ***
//  ****
// *****

// public class pattern{
//     public static void main(String args[]){
//         int n = 5 ; 
//         for(int row = 1 ; row <= n ; row++){
//             for(int col = 1 ; col<= n-row ; col++){
//                 System.out.print(" ");
//             }
//             for(int col = 1 ; col<= row ; col++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }


// paatern 8
// *******
//  *****
//   ***
//    *



// public class pattern{
//     public static void main(String args[]){
//         int n = 5 ; 
//         for(int row = 1 ; row <= n ; row++){
//             for(int col = 1 ; col<= row-1 ; col++){
//                 System.out.print(" ");
//             }
//             for(int col = 1 ; col<= 2*n-2*row-1 ; col++){
//                 System.out.print("*");
//             }
           
//             System.out.println() ;
//         }

//     }
// }


// pattern 9
// ****
// *  *
// *  *
// ****

// public class pattern {
//     public static void main(String args[]){
//         int n = 4 ;
//         for(int row = 1 ; row <= n ; row ++){
//             for(int col = 1 ; col<= 4 ; col++){
//                 if(row ==1 || row == n ){
//                     System.out.print("*");
//                 }
//                 else{
//                     if(col==1 || col==4){
//                         System.out.print("*");
//                     }
//                     else{
//                         System.out.print(" ");
//                     }
//                 } 

//             }
//             System.out.println();
//         }
    
//     }
// }


// paatern 10
// *
// **
// * *
// *  *
// *****
// public class pattern{
//     public static void main( String args[]){
//         int n = 5 ;
//         for(int row = 1 ; row<=n; row++){
//             for(int col = 1 ; col <= row; col++){
//                 if(row == 1 || row == 2 ||row == 5){
//                     System.out.print("*");
//                 }
//                 else if (row == 3){
//                     if(col==2){
//                         System.out.print(" ");
//                     }
//                     else {
//                         System.out.print("*");
//                     }
//                 }
//                 else if(row == 4){
//                     if(col==2 || col==3){
//                         System.out.print(" ");
//                     }
//                     else {
//                         System.out.print("*");
//                     }
//                 }
//                 }
//             System.out.println();

//             }
//         }
//     }


// pattern 11
//     *
//    * *
//   *   *
//  *     *
// *********
// public class pattern{
//     public static void main(String args[]){
//         int n = 5 ; 
//         for(int row = 1 ; row <=n ; row++){
//             for(int col = 1 ; col<= n-row ; col++){
//                 System.out.print(" ");
//             }
//             for(int col = 1 ; col<=2*row-1 ; col++){
//                 if(row==n || col==1 || col==2*row-1){
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
            
//         }
      
//     }
// }



// pattern 12
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *


// public class pattern {
//     public static void main(String args[]){
//         int n = 4 ; 
//         for(int row = 1 ; row<=n ; row++){
//             for(int col = 1 ; col<=n-row ; col++){
//                 System.out.print(" ");
//             }
//             for(int col = 1 ; col<= 2*row-1 ; col++){
//                 System.out.print("*");
//             }
//             System.out.println() ;
//         }
//         for(int row = 2 ; row<=n ; row++){
//             for(int col = 1 ; col<= row-1 ; col++){
//                 System.out.print(" ");
//             }
//             for(int col = 1 ; col<=2*n-2*row+1 ; col++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// pattern 13
//    *
//   * *
//  *   *
// *     *
//  *   *
//   * *
//    *

// public class pattern{
//     public static void main(String args[])
//     {
//     int n= 4 ;
//     for(int row = 1 ; row<=n ; row++){
//         for(int col = 1 ; col<= n-row ; col++){
//             System.out.print(" ");
//         }
//         for(int col = 1 ; col<=2*row-1 ; col++){
//             if(col==1 || col== 2*row-1){
//                 System.out.print("*");
//             }
//             else {
//                 System.out.print(" ");
//             }
//         }
//         System.out.println() ;
//     }
//     for(int row = 2 ; row<= n ; row++){
//         for(int col = 1 ; col<=row-1 ; col++){
//             System.out.print(" ");
//         }
//         for(int col = 1 ; col<= 2*n - 2*row+1 ; col++){
//             if(col == 1 || col==2*n - 2*row+1){
//                 System.out.print("*");
//             }
//             else {
//                 System.out.print(" ");
//             }
           
//         }
//         System.out.println(); 
//     }    
//     }
// }



// pattern 14

// *      *
// **    **
// ***  ***
// ********
// ***  ***
// **    **
// *      *
// public class pattern{
//     public static void main(String args[]){
//         int n = 4 ; 
//         for(int row = 1 ; row<= n ; row++){
//             for(int col = 1 ; col<=row ;col++ ){
//                 System.out.print("*");
//             }
//             for(int col = 1 ; col<=2*(n-row); col++){
//                 System.out.print(" ");
//             }
//             for(int col = 1 ; col<= row ; col++ ){
//                 System.out.print("*");
//             }
//             System.out.println() ;
//         }
//         for(int row = n-1 ;row>=1 ; row--){
//             for(int col = 1 ; col<=row ; col++ ){
//                 System.out.print("*");
//             }
//             for(int col= 1 ; col<=2*(n-row) ; col++){
//                 System.out.print(" ");
//             }
//             for(int col = 1 ; col<=row ; col++){
//                 System.out.print("*");
//             }
//             System.out.println() ;
//         }
        
//         }
//     }

// pattern 15 
// 1
// 12
// 123
// 1234
// 12345

// public class pattern{
//     public static void main(String args[]){
//     int n= 5 ;
//      for(int row = 1 ; row <= n ; row++){
//         for(int col = 1 ; col<= row ; col++){
//             System.out.print(col);
//         }
//         System.out.println();
//      }   
//     }
// }

// pattern 16

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
// public class pattern{
//     public static void main(String args[]){
//         int count = 1;
//         int n= 5 ;
//         for(int row = 1 ; row<=n ; row ++){
//             for(int col = 1 ; col<=row ;col++ ){
//                 System.out.print(count+" ");
//                 count++ ;
//             }
//             System.out.println();
//         }
    
//     }
// }




// pattern 17
// A 
// A B 
// A B C 
// A B C D 
// A B C D E 

// public class pattern{
//     public static void main(String args[]){
//         int n = 5 ; 
//         for(int row = 1 ; row<=n ; row++){
//             for(int col = 1 ; col<=row ; col++){
//                 if(col == 1){
//                     System.out.print("A ");
//                 }
//                 else if(col==2){
//                     System.out.print("B ");
//                 }
//                 else if(col==3){
//                     System.out.print("C ");
//                 }
//                 else if(col==4){
//                     System.out.print("D ");
//                 }
//                 else if(col==5){
//                     System.out.print("E ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }




// pattern 18
// E 
// E D 
// E D C 
// E D C B 
// E D C B A 

// public class pattern {
//     public static void main(String args[]){
//         int n = 5 ; 
//         for(int row = 1 ; row<=n ; row++){
//             for(int col = 1 ; col<= row; col++){
//                 if(col==1){
//                     System.out.print("E ");
//                 }
//                 else if(col==2){
//                     System.out.print("D ");
//                 }
//                 else if(col==3){
//                     System.out.print("C ");
//                 }
//                 else if(col == 4){
//                     System.out.print("B ") ;
//                 }
//                 else if(col == 5){
//                     System.out.print("A ");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }




// pattern19

//    1
//   121
//  12321
// 1234321
// public class pattern {
//     public static void main(String args[]){
//         int n = 4 ; 
//         for(int row = 1 ; row<=n;  row++ ){
//             for(int col = 1 ; col<=n-row;col++){
//                 System.out.print(" " );
//             }
//             for(int col = 1; col<=row ; col++){
//                 System.out.print(col);
//             }
//             int rowvalue = row ; 
//             int decrowvalue = row-1 ;
//             for(int col= 1 ; col<=row-1 ; col++){
//                 System.out.print(decrowvalue);
//                 decrowvalue--;
//             }
//             System.out.println();
//         }

//     }
// }


// pattern20

//    1
//   222
//  33333
// 4444444

// public class pattern {
//     public static void main(String args[]){
//         int n = 4 ; 
//         for(int row = 1 ; row<=n ; row++){
//             for(int col = 1 ; col<=n-row;col++){
//                 System.out.print(" ");
//             }
//             for(int col = 1 ; col<=row; col++){
//                 System.out.print(row);
//             }
//             for(int col=1 ; col<=row-1;col++){
//                 System.out.print(row);
//             }
//             System.out.println();
//         }
//     }
// }



// pattern 21
//    A
//   ABA
//  ABCBA
// ABCDCBA


// public class pattern{
//     public static void main(String args[]){
//         int n = 4 ; 
//         for(int row = 1 ; row<=n ; row++){
//             for(int col = 1 ; col<=n-row ; col++){
//                 System.out.print(" ");
//             }
//             for(int col = 1 ; col<=row ; col++){
//                 int a = col ;
//                 int b = 'A' - 1 ; 
//                 int ans = a+b ;
//                 char finalAns = (char)ans ; 
//                 System.out.print(finalAns);
                
//             }
//             char toPrint = (char)(row+'A'-2);
//             for(int col = 1 ; col<=row-1 ; col++){
//                 System.out.print(toPrint);
//                 toPrint--;
//             }
    
//             System.out.println() ;
//         }
//     }
// }



// class pattern {
//     public static void main(String[] args) {
//         System.out.println("Start small. Ship something.");
//         int n = 2; 
//         for(int row = n; row>=1; row--){
//             for(int col = 1 ; col<=row; col++){
//                 System.out.print(col);
//             }
//             System.out.println();
//         }
//     }
// }

