public class insertion {
    public static void array(int arr[]){
        int n = arr.length ;
        for(int i = 1 ; i<n ; i++){
            int cur = i ;
            int prev = i-1 ; 
            int curval = arr[cur];
            // shifting
            while(prev>=0 && curval<arr[prev]){ 
                arr[prev+1] = arr[prev];
                prev--;
                
            }
            
            arr[prev+1] = curval ;
        }
    }
    public static void main(String args[]){
        int arr[] = {6,4,3,8,1,-1};
        array(arr);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
}
