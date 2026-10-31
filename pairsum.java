public class pairsum {
    public static void pair(int [] arr){
        long startTime = System.nanoTime() ;
        int sum = 0 ;
        for(int i = 0 ; i <arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                sum = arr[i] +arr[j] ;
                System.out.println("pair" + arr[i] + "," + arr[j] + "sum" +sum) ;
            }
        }
        long endTime = System.nanoTime() ;
        long executionTime = (endTime - startTime)/1000 ;
        System.out.println("exection Time"+ executionTime + " microseconds") ;
        
    }
    public static void main(String args[]){
        int arr[] = {10 , 4, 5 , -1 ,7} ;
        pair(arr) ;

    }
}
