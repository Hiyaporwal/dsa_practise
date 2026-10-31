// lecture27 love babbaar
// find the avg of all the elements in the array
// public class array3{
//     public static  double array(int[] arr){
//         int sum = 0 ;
//         for (int i = 0 ; i<arr.length ; i++){
//             sum = sum+arr[i];
//         }
//         int size = arr.length;
//         double average = sum/size ;
//         return average ;
//     }
//     public static void main(String args[]){
//         int arr[] = {10,20,30,40};
//         System.out.print(array(arr));
//     }
// }





// multiply each elemnt of arrray by 10
// public class array3 {
//     public static void array(int arr[]){
//         for(int i = 0 ; i<arr.length;i++){
//             arr[i]= arr[i]*10 ;
//             System.out.println(arr[i]);
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {10,20,30,40};
//         array(arr);
//     }
// }





// search for an elemnt in array {linear search}
// public class array3 {
//     public static int array(int arr[], int x){
//         for(int i = 0 ; i<arr.length ; i++){
//             if(arr[i]==x){
//                 return i ;
//             }
//         }
//         return -1 ;
//     }
//     public static void main(String args[]){
//         int arr[] = {10,20,30,40,50,60};
//         int x = 70; 
//         int index = array(arr , x);
//         if(index!=-1){
//             System.out.println("we find element at index"+index);
//         }
//         else {
//             System.out.println("we didnt find element");
//         }
//     }
// }





// find the maximum element in an array
// public class array3 {
//     public static void array(int arr[]){
//         int max = arr[0];
//         for(int i = 0 ; i<arr.length ; i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
//     public static void main(String args[]){
//         int arr[] = {20,10,45,64,27,89,43,56} ;
//         array(arr);

//     }
// }




// return sum of +ve and -ve numbers

// public class array3 {
//     public static void array(int arr[]){
//         int negsum = 0 ;
//         int possum = 0 ;
//         for(int i = 0 ; i<arr.length ; i++){
//             if(arr[i]>0){
//                 possum = possum+arr[i] ;
            
//             }
//             else {
//                 negsum = negsum+arr[i] ;


//             }
//         }
//         System.out.println("sum of positive numbers"+possum);
//         System.out.println("sum of negative number" + negsum);
//     }
//     public static void main(String args[]){
//         int arr [] = {20, -10 , 30 , -50 , 60 , -70};
//         array(arr);
//     }
// }



// public class array3 {
//     public static void array(int arr[])
//     {
//         int zerocount = 0 ;
//         int onecount = 0 ;
//         for(int i = 0 ; i<arr.length ; i++){
//             if(arr[i]==0){
//                 zerocount ++ ;
//             }
//             else {
//                 onecount ++ ;
//             }

//         }
//         System.out.println("number of zeros"+zerocount) ;
//         System.out.println("number of one count"+onecount) ;
       

//     }
//      public static void main(String args[])
//         {
//             int arr[] = {1,0,0,1,1,0,1} ;
//             array(arr);
           
//         }
// }




// find first unsorted element in array
// public class array3 {
//     public static int array(int arr[]){
//         for(int i = 0 ; i<arr.length ; i++){
//             if(arr[i+1]<arr[i]){
//                 return arr[i+1];
//             }
//         }
//         return -1 ; 
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,6,4,7};
//         System.out.println(array(arr));

//     }
    
// }






// #swap alternate element in array
// import java.util.Arrays; 

// public class array3 {
//     // Your swapping logic is 100% correct!
//     public static void array(int arr[]){
//         for(int i = 0 ; i < arr.length ; i += 2){
//             if(i + 1 < arr.length){
//                 int temp = arr[i];
//                 arr[i] = arr[i+1];
//                 arr[i+1] = temp; 
//             }
//         }
//     }
    
//     public static void main(String args[]){
//         int arr[] = {1, 2, 3, 4, 5, 6};
        
//         // Fix 1: Use Arrays.toString() to print the original array elements
//         for(int i = 0 ; i<arr.length ; i++){
//             System.out.print(arr[i]);
//         }
        
//         // Fix 2: Call the method directly on your array variable 'arr'
//         array(arr);
//         System.out.println();
//         // Fix 3: Print the modified array
//         for(int i = 0 ;i<arr.length ;i++){
//             System.out.print(arr[i]) ;
//         }
//     }
// }





// print array intersection elemnt
// public class array3 
// {
//     public static void array(int arr1[] , int arr2[]){
//         for(int i = 0 ; i<arr1.length ; i++){
//             for(int j = 0 ; j<arr2.length ; j++){
//                 if(arr1[i]==arr2[j]){
//                     System.out.println(arr1[i]+" ");
//                     break ;

//                 }
//             }
           

//         }
//         System.out.println();
        
//     }
//     public static void main(String args[]){
//         int arr1[] = {1,2,3,4,5,6} ;
//         int arr2[] = {5,6,7,8,9,10} ;
//         array(arr1 , arr2) ;
//     }

// }





// print alternate extreme element of an array
// public class array3 {
//     public static void array(int arr[]){
//         int left = 0 ; 
//         int right = arr.length -1 ; 
//         while(left<=right){
//             System.out.println(arr[left]) ;
//             left ++ ; 
//             if(left<=right){
//                 System.out.println(arr[right]) ;
//                 right -- ;
//             }

//         }
        
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5,6} ;
//         array(arr) ;
//     }
// }


