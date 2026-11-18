public class EKOSPOJ {
    
    static boolean isValidAns(int[] trees, long requiredWood, int maxheight) {
        long totalwoodcollected = 0; 
        
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] > maxheight) { 
                // iska mtlb sawblade overall tree height se chota so wood katega
                int currentTreewoodcollected = trees[i] - maxheight;
                totalwoodcollected += currentTreewoodcollected;
            }
        }
        
        return totalwoodcollected >= requiredWood;
    }

    public static int maxSawbladeHeight(int[] trees, long requiredWood) {
        int n = trees.length;
        int start = 0;
        int maxi = -1;
        int ans = -1;
        
        for (int i = 0; i < n; i++) {
            if (trees[i] > maxi) {
                maxi = trees[i];
            }
        }
        
        int end = maxi;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Pass all 3 required arguments
            if (isValidAns(trees, requiredWood, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int trees[] = {20,15,10,17};
        long  requiredWood = 7 ;
        int x = maxSawbladeHeight(trees, requiredWood);
        System.out.print(x) ;
        
    }
}
