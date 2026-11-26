public class mostfrequencharacterinstring {
    public static char array(String s){
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char currchar = s.charAt(i);
            freq[currchar - 'a']++;
        }

        int maxfreq = -1;
        char ans = 'a';

        // Loop through the string in order of appearance
        for (int i = 0; i <s.length(); i++) {
            char currchar = s.charAt(i);
            if (freq[currchar - 'a'] > maxfreq) {
                maxfreq = freq[currchar - 'a'];
                ans = currchar;
            }
        }
        return ans;
    }
    public static void main(String args[]) {
    String s = "testsample";
    System.out.print(array(s)); // Outputs: t
    }
    
}
