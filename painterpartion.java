public class painterpartion {
    public static boolean isvalidsolution(int boards[] , int k ,int maxlength ){
// mid -> maximum length of boar , a painter can paint above it not allowed
        int paintercount = 1 ;
        int paintedlength = 0 ;
        for(int i = 0 ; i<boards.length ; i++){
            if(paintedlength + boards[i]<= maxlength){
                paintedlength = paintedlength + boards[i];
                
            }
            else {
                // painted length + boards[i]>maxlenght
                paintercount ++ ;
                paintedlength = 0 ;
                if(paintercount>k || boards[i]>maxlength){
                    return false ;
                }
                else {
                    paintedlength = paintedlength + boards[i] ;
                }
                
                
            }
            
            
        }
        return true ;   
    }
    public static int mintime(int boards[] , int k){
        int sum = 0 ; 
        for(int i = 0 ; i<boards.length ; i++){
            sum = sum + boards[i];
        }
        int ans = -1 ;
        int start = 0 ; 
        int end =  sum ;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(isvalidsolution(boards , k , mid)){
                ans = mid ;
                end = mid-1 ;
                
            }
            else {
                start = mid +1 ;
            }
        }
        return ans ;
    }
    public static void main(String args[]){
        int[] boards = {10,20,30,40,50,60};
        int k = 2 ;
        int x = mintime(boards,k);
        System.out.print(x);
    }
}