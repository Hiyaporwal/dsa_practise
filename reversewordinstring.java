public class reversewordinstring{
    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1 ;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            int j = i ;
            while(j>=0 && s.charAt(j)!=' '){
                j-- ;
            }
            ans.append(s.substring(j+1 , i+1));
            while(j>=0 && s.charAt(j)==' '){
                j-- ;
            }
            i=j ;
            if(j>=0){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
    public static void main(String args[]){
        String s = "  hello world  " ;
        String x = reverseWords(s) ;
        System.out.print(x);
    }
}