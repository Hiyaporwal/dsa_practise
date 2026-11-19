public class rotiparathaspoj {
    public static boolean isvalidAns(int totalparatha, int[] cooks, int totalcooks, long timelimit) {
        int parathacount = 0;
        
        for (int i = 0; i < totalcooks; i++) {
            int currentcookrank = cooks[i];
            long timetaken = 0;
            int j = 1;
            
            while (timetaken + (long) j * currentcookrank <= timelimit) {
                timetaken += (long) j * currentcookrank;
                parathacount++;
                j++;
            }
            
            if (parathacount >= totalparatha) {
                return true;
            }
        }
        return false;
    }

    public static int mintimetocook(int p, int[] cook, int n) {
        // p is no of paratha
        // n is no of cooks
        int maxrank = -1;
        for (int i = 0; i < n; i++) {
            if (cook[i] > maxrank) {
                maxrank = cook[i];
            }
        }
        
        long s = 0;
        long e = (long) maxrank * (p * (p + 1L) / 2);
        int ans = -1;
        
        while (s <= e) {
            long mid = s + (e - s) / 2;
            // Fixed variable names to match method parameters: p, cook, n
            if (isvalidAns(p, cook, n, mid)) {
                ans = (int) mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int cook[] =  {1,2,3,4};
        int p = 10 ;
        int n = cook.length ;
        int x=  mintimetocook(p,cook,n);
        System.out.print(x);
    }
}
