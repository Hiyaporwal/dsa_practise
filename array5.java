// public class array5{
//     public static int[] array(int arr[]){
//         int n = arr.length ;
//         int i = 0 ;
//         int j = n-1 ; 
//         while(i<j){
//             if(arr[i]==1 && arr[j]==0){
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp ;
                
//             }
//             if(arr[i]==0){
//                 i++;
//             }
//             if(arr[j]==1){
//                 j--;
//             }
//         }
//         return arr ;
//     }

//     public static void main(String args[]){
//         int arr[] = {1,0,1,0,1,0};
//         array(arr);
//         for(int i = 0 ; i<arr.length ; i++){
//             System.out.print(arr[i]);
//         }
//     }

// }


// find the missing number
// public class array5 {
//     public static void array(int arr[] , int range[]){
        
//         int xorSum  = 0;
//         //xor with array
//         for(int i : arr){
//             xorSum = xorSum ^ i ;
//         }
//         for(int j: range){
//             xorSum = xorSum ^ j;
//         }
//         System.out.print(xorSum);
        
       
//     }
//     public static void main(String args[]){
//         int range[] = {0,1,2,3,4,5};
//         int arr[] = {0,3,4,2,1};
//         array(arr , range) ;

//     }
// }






// find the unique elelemnt in array
// public class array5{
//     public static int array(int arr[]){
//         int XORSum = 0 ;
//         for(int i :arr){
//             XORSum = XORSum ^ i ;
//         }
//         return XORSum ;

//     }
//     public static void main(String args[]){
//         int arr[]  = {1,2,3,4,1,2,3};
//         int unique = array(arr);
//         System.out.print(unique);

//     }
// }



// # two sum

// target = 10 ; 


// public class array5 {
//     public static int[] array(int arr[] , int target){
//         int n = arr.length ; 
//         for(int i = 0 ; i<n-2 ; i++){
//             for(int j = i+1 ; j<n-1 ; j++){
//                 for(int k = j+1 ; k<n ; k++ ){
//                     if(arr[i]+arr[j]+arr[k]==target){
//                         int ans[] = {i,j,k} ;
//                         return ans ;
//                     }

//                 }
//             }
//         }
//         int ans[] = {};
//         return ans ;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};
//         int target = 9 ;
//         int ans[] = array(arr,target);

//         if(ans.length==0){
//             System.out.print("pair not found");
//         }
//         else {
//             System.out.print("pair found"+arr[0]+" "+arr[1]+" "+arr[2]);
//         }
    
//     }
// }




// Find the first repeating element
// public class array5 {
//     public static int array(int arr []){
//         int n = arr.length ;
//         for(int i = 0 ; i<n-1 ; i++){
//             for(int j = i+1 ; j<n ; j++){
//                 if(arr[i] == arr[j]){
//                     return arr[i] ;
//                 }
//             }
//         }
//         return -1 ;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4};
//         int index = array(arr);
//         if(index!=-1){
//             System.out.print("we find first duplicate "+ index);
//         } else {
//             System.out.print("no duplicate find");
//         }
        
//     }
// }

// import java.util.HashMap;

// public class array5 {
//     public static int array(int arr[]){
//         HashMap<Integer,Integer> freq = new HashMap<>();
//         //freq store
//         for(int num :arr){
//             freq.put(num , freq.getOrDefault(num, 0)+1);
//         }
//         for(int i :arr){
//             if(freq.get(i)>1){
//                 return i ;
//             }
//         }
//         return -1 ;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,1};
//         int index = array(arr);
//         if(index!=-1){
//             System.out.print("first repeating elelemt"+ index);
//         }
//         else {
//             System.out.print("we didint find element") ;
//         }
//     }
// }




//find the pivot index
// class array5 {
//     public int pivotIndex(int[] nums) {

//         int n = nums.length;

//         // Fill left sum array
//         int[] leftSum = new int[n];
//         leftSum[0] = nums[0];

//         for(int i = 1; i < n; i++) {
//             leftSum[i] = leftSum[i - 1] + nums[i];
//         }

//         // Fill right sum array
//         int[] rightSum = new int[n];
//         rightSum[n - 1] = nums[n - 1];

//         for(int i = n - 2; i >= 0; i--) {
//             rightSum[i] = rightSum[i + 1] + nums[i];
//         }

//         // Check equality
//         for(int i = 0; i < n; i++) {

//             if(leftSum[i] == rightSum[i]) {
//                 return i;
//             }
//         }

//         return -1;
//     }
// }


// import java.util.Arrays;

// public class array5 {
//     public static int array(int arr[]){
//         int n = arr.length ;
//         int i = 0 ;
//         for(int j = 1 ; j<n ; j++){
//             if(arr[i]!=arr[j]){
//                 arr[i+1] = arr[j] ;
//                 i++;

//             }
//         }
//         return i+1 ;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,1,2,2,3,3,4};
//         int n = array(arr);
//         for(int i = 0 ; i<n ; i++){
//             System.out.print(arr[i]);
//         }
//     }
    
// }
