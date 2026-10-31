// import java.util.* ;
// public class array6 {

//     public List<Integer> findDisappearNumber(int[] nums) {

//         List<Integer> ans = new ArrayList<>();
//         int n = nums.length;

//         // Mark numbers that are present
//         for(int index = 0; index < n; index++){

//             int value = Math.abs(nums[index]);
//             int position = value - 1;

//             if(nums[position] > 0){
//                 nums[position] = -nums[position];
//             }
//         }

//         // Positive index = missing number
//         for(int i = 0; i < n; i++){

//             if(nums[i] > 0){
//                 ans.add(i + 1);
//             }
//         }

//         return ans;
//     }

//     public static void main(String []args){
//         int[] nums = {4,3,2,7,8,2,3,1} ;
//         List<Integer> result = new array6().findDisappearNumber(nums) ;
//         System.out.println("missing number:"+ result) ;
//     }
// }

import java.util.* ;
public class array6 {
    public static List<Integer> findDisapperarNumber(int [] nums){
        List<Integer> ans = new ArrayList<>() ;
        int n = nums.length ;
        for(int index = 0 ; index<n ; index++){
            int value = Math.abs(nums[index]) ;
            int postion = value -1 ;

            if(nums[postion]>0){
                nums[postion] = - nums[postion] ;
            }
        }
        for(int i = 0 ; i<n ; i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans ;
    }
    public static void main(String args[]){
        int[] nums = {4,3,2,7,8,2,3,1} ;
        List<Integer> result = new array6().findDisapperarNumber(nums) ;
        System.out.print("missing number"+ result) ;

    }
}