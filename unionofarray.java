import java.util.*;
public class unionofarray {
    public static void array(int arr1[],int arr2[]){
        HashSet<Integer>set = new HashSet<>();
        for(int i : arr1){
            set.add(i);
        }
        for(int i : arr2){
            set.add(i);
        }
        System.out.print(set);


    }
    public static void main(String args[]){
        int arr1[] = {1,2,3,4};
        int arr2[]= {3,4,5,6};
        array(arr1,arr2);
    }
    
}
