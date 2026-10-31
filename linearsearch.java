public class linearsearch{
    public static int search(int arr[] , int x){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                return i ;
            }
        }
        return -1 ;

    }
    public static void main(String args[]){
        int arr[] = {10 , 20 , 30 ,40 ,50} ;
        int x = 30 ;
        long startTime = System.nanoTime() ;
        int index = search(arr , x) ;
        long endTime = System.nanoTime() ;
        long executionTime = endTime - startTime ;
        if(index != -1){   
            System.out.println("element found at index" + index) ;

        }
        else {
            System.out.println("element not found") ;
        }
        System.out.println("execution time"+ executionTime/1000000 + " milliseconds") ;
    }
}


    

