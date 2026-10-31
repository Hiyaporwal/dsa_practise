// reverse the array
// public class array4 {
//     public static void array(int arr[]){
//         int i = 0 ;
//         int j = arr.length - 1 ;
//         while(i<=j){
//             int temp = arr[i] ;
//             arr[i] = arr[j] ;
//             arr[j] = temp ; 
//             i++ ;
//             j-- ;
//         }
//         for(int k :arr){
//             System.out.println(k);
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {10,20,30,40,50,60};
//         array(arr);
//     }
    
// }




// shift the lement by 1 postion
// public class array4{
//     public static void array(int arr[]){
//         int n = arr.length ;
//         int temp = arr[n-1];
//         for(int i = n-1; i>0 ;i--){
//             arr[i]=arr[i-1];
//             i--;
//         }
//         arr[0] = temp ;
        
//     }
//     public static void main(String args[]){
//         int arr[] = {10,20,30,40,50,60};
//         array(arr);
//         for(int i = 0 ; i<arr.length ; i++){
//             System.out.println(arr[i]);
//         }
//     }
    
// }




// reverse the element by kth postion

// public class array4 {
//     public static void reverse(int arr[],int start , int end){
    
//         while(start<end){
//             int temp = arr[start];
//             arr[start]=arr[end];
//             arr[end]=temp ;
//             start++;
//             end--;
//         }

//     }
//     public static void rotate(int arr[], int k){
//         int n = arr.length;
//         k = k%n;
//         reverse(arr,0,n-1);
//         reverse(arr,0,k-1);
//         reverse(arr,k,n-1);

//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};
//         int k = 3 ;
//         rotate(arr,k);
//         for(int i = 0 ; i<arr.length ; i++){
//             System.out.println(arr[i]);
//         }

//     }
// }



// print extreme alternate number
// public class array4 {
//     public static void array(int arr[]){
//         int n = arr.length ;
//         int i = 0 ;
//         int j = n-1 ;
//         while(i<=j){
//             if(i==j){
//                 System.out.println(arr[i]);
//             }
//             else {
//                 System.out.println(arr[i]);
//                 i++ ;
//                 System.out.println(arr[j]) ;
//                 j-- ;
//             }
//         }


//     }

//     public static void main(String args[]){
//         int arr[]={1,2,3,4,5,6};
//         array(arr) ;
//     }
// }



// find the mode of array
// import java.util.HashMap;

// public class array4{
//     public static int getmode(int arr[]){
//         HashMap<Integer , Integer>freq=new HashMap<>();

//         for(int num:arr){
//             freq.put(num,freq.getOrDefault(num , 0)+1);
//         }
//         int maxfreq = -1 ;
//         int maxfreqwalikey = -1 ;
//         for(int key:freq.keySet()){
//             int currentkey = key;
//             int currentkifrequency = freq.get(key);
//             if(currentkifrequency>maxfreq){
//                 maxfreq = currentkifrequency ;
//                 maxfreqwalikey = currentkey ;

//             }

//         }
//         return maxfreqwalikey;
        

//     }
//     public static void main(String args[]){
//         int arr[]={1,2,2,3,3,4,5,5,1,3};
//         int ans =getmode(arr);
//         System.out.println(ans);
        
//     }
// }





// import java.util.HashMap ;
// public class array4 {
//     public static int[] array(int arr[]){
//         HashMap<Integer , Integer> freq = new HashMap<>();
//         for(int num:arr){
//             freq.put(num , freq.getOrDefault(num,0)+1);
//         }
//         int maxfreq = Integer.MIN_VALUE ;
//         int maxfreqwalikey = -1 ;
//         for(int key :freq.keySet()){
//             int currentkey = key ;
//             int currentkifreq = freq.get(key);
//             if(currentkifreq>maxfreq){
//                 maxfreq = currentkifreq;
//                 maxfreqwalikey = currentkey ;
//             }
//         }
//         int minfreq = Integer.MAX_VALUE ;
//         int minfreqwalikey = -1 ;
//         for(int key :freq.keySet() ){
//             int currentkey = key ;
//             int currentkifreq = freq.get(key);
//             if(currentkifreq<minfreq){
//                 minfreq=currentkifreq;
//                 minfreqwalikey = currentkey;
//             }
//         }
//         int ans[]={maxfreqwalikey,minfreqwalikey};
//         return ans ;

//     }
//     public static void main(String args[]){
//         int arr[]= {1,2,3,1,1,2,3,1,2,3,3,1,2,1};
//         int ans[]=array(arr);
//         System.out.println("maxfreqnumber"+ans[0]);
//         System.out.println("minwfrewalanum"+ans[1]);
//     }
// }




