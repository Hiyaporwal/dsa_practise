// print digit of number

// public class maths{
//     static void displaynum(int num){
//         while(num !=0){
//             int digit = num%10 ;
//             System.out.println(digit);
//             num = num/10 ;
//         }

//     }
//     public static void main(String args[]){
//         int num = 12345 ;
//         displaynum(num);

//     }
// }

// count digit in numbers

// public class maths{
//     static int countdigit(int num){
//         int count = 0 ;
//         while(num!=0){
//             int digit = num%10 ;
//             count++ ;
//             num = num/10 ;
//         }
//         return count ;

//     }
//     public  static void main(String args[]){
//         int num = 563467 ;
//         int ans = countdigit(num);
//         System.out.println(ans);

//     }
// // }




// sum of digit
// public class maths {
//     static int  sum(int num){
//         int sum = 0 ; 
//         while(num!=0){
//             int digit = num%10 ;
//             sum = sum+digit ;
//             num = num/10 ;
//         }
//         return sum ;
//     }
//     public static void main(String args[]){
//         int num = 346793 ;
//         int ans = sum(num);
//         System.out.println(ans);
//     }
// }



// reverse number
// public class maths{
//     static void reverse(int num){
//         int reverse = 0 ; 
//         while(num!=0){
//             int digit = num%10 ; 
//             reverse = reverse*10 +digit ;
            
//             num = num/10 ;

//         }
//         System.out.println(reverse);
        
//     }
//     public static void main(String args[]){
//             int num = 234567 ; 
//             reverse(num);
            
//         }
// }





// checking palindrom

// public class maths{
//     static void palindrom(int num){
//         int orignalnum = num ;
//         int reverse = 0 ;
//         while(num!=0){
//             int digit = num%10 ; 
//             reverse = reverse*10+digit ;
//             num = num/10 ;
//         }
//         if(reverse == orignalnum){
//             System.out.println("it is a palindrom");
//         }
//         else {
//             System.out.println("it is not a palindrom");
//         }

//     }
//     public static void main(String args[]){
//         int num = 4444 ;
//         palindrom(num);

//     }
// }


// wheather prime number or not
// public class maths{
//     static boolean prime(int num){
//         for(int i = 2 ; i*i < num ; i++){
//             if(num%i==0){
//                 return false ;
//             }
//         }
//         return true ;
       

//     }
//     public static void main(String args[]){
//         int num = 5 ;
//         boolean ans =prime(num);
//         System.out.println(ans);    

//     }
// }


// GCD of numbers

// public class maths{
//     static int gcd(int a , int b){
//         while(b!=0){
//             int temp = b ; 
//             b = a%b ;
//             a = temp ;
            
            
//         }
//         return a ;
//     }
//     public static void main(String args[]){
        
//         System.out.println(gcd(12,18)) ;
        

//     }
// }

// public class maths{

//     static int gcd (int a , int b){
//         while(b!=0){
//             int temp = b ; 
//             b = a%b ;
//             a = temp ; 

//         }
//         return a ; 
//     }
//     static int lcm(int a , int b){
//         int gcdvalue = gcd( a , b) ;
//         int lcm = (a*b)/gcdvalue ;
//         return lcm ; 
//     }
//     public static void main(String args[]){
//         System.out.println(lcm(18,12)) ;
//     }

//     }


// public class maths
// {
//     static boolean armstrong(int num)
//     {
//         int sum = 0 ;
//         int orignalnum = num ; 
//         while(num!=0){
//             int digit = num%10 ; 
//             sum = sum + digit*digit*digit ; 
//             num =  num/10 ;
//         } 
        
//         if(sum == orignalnum){
//             return true ;
        
//         }
//         else {
//             return false ;
//         }
//     }    
//     public static void main(String args[]){
//         System.out.println(armstrong(153)) ;


//     }
// }


// public class maths{
//     static boolean perfectnum(int num){
//         int sum = 1 ; 
//         for(int i =2 ; i*i <num ; i++){
//             int firstfactor = i ; 
//             int secondfactor = num/i ;
//             sum =sum +firstfactor +secondfactor ;
//         }
//         if(sum == num){
//             return true ; 

//         }
//         else {
//             return false ;
//         }

//     }
//     public static void main (String args[]){
//         System.out.println(perfectnum(9)) ;
//     }
// }


 public class maths{
    static int prime(int num){
        num = 0 ;
        boolean isPrime = isprimeOrnot(num) ;
        if(isprime )



         
        
        
        
    }


 }  





 