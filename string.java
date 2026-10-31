// public class string {
//     public static void main(String args[]) {
//         String str = "hiya porwal" ;
//         String str2 =  new String("hiya porwal") ;
//         if(str == str2) {
//             System.out.println("both are equal") ;
//         } else {
//             System.out.println("not equal") ;
//         }
//         System.out.println(str.length()) ;
//         System.out.println(str.toUpperCase()) ;
//         System.out.println(str.toLowerCase()) ;
//         System.out.println(str.charAt(0));
//         System.out.println(str.substring(0,2));
//         System.out.println(str.contains("h"));
//         System.out.println(str.equals(str2));
//         System.out.println(str.equalsIgnoreCase(str2));
//         System.out.println(str2.toUpperCase());
//         System.out.println(str.toLowerCase());
//         System.out.println(str.trim());
//         System.out.println(str.split(" "));
//         System.out.println(str.startsWith("h"));
//         System.out.println(str.endsWith("l"));
//         // System.out.println(str.valueOf(123));
//         System.out.println(str.toCharArray());
//         System.out.println(str.isEmpty()) ;
//         System.out.println(str2.isBlank());
//         System.out.println(str.replace('h', 'l'));

//     }
    
// }




// Print each character of the string
// public class string{
//     public static void main(String args[]){
//         String str = "hiya porwal";
//         for(int i = 0 ; i<str.length();i++){
//             System.out.println(str.charAt(i));
//         }
//     }
// }


// Count length without using length()

// public class string {
//     public static void main(String args[]){
//         String str = "hiya porwal";
//         int count = 0 ;
//         for(int i = 0 ; i<str.length();i++){
//             count++ ;
//         }
//         System.out.println(count);

//     }

    
// }


// Count vowels in a Str
// public class string{
//     public static void main(String args[]){
//         String str = "hiya porwal";
//         int count = 0 ;
//         for(int i = 0 ; i<str.length();i++){
//             char ch = str.charAt(i);
//             if(ch=='a'|| ch=='e'|| ch =='i' || ch=='o'|| ch=='u'){
//                 count++ ;

//             }
//         }
//         System.out.println(count);
//     }
// }

// Reverse a String

// public class string{
//     public static void main(String args[]){
//         String str = "hiya porwal";
//         String reverse = "";
//         for(int i = str.length()-1 ; i>=0 ;i--){
//             reverse = reverse +str.charAt(i);
//         }
//         System.out.println(reverse);
//     }
// }



// Checking palindrom
// public class string {
//     public static void main(String args[]){
//         String str = "ABA";
//         String reverse = "";
//         for(int i = str.length()-1 ; i>=0 ; i--){
//             reverse = reverse + str.charAt(i);
            
//         }
//         if(str.equals(reverse) ){
//                 System.out.println("it is palindrom");
//             }
//             else{
//                 System.out.println("it is not palindrom");
//             }




//     }
// }