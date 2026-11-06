public class upperbound { 
    public static int upperbound(int arr[], int target) { 
        int n = arr.length; 
        int start = 0; 
        int end = n - 1; 
        int ans = n; // Default to n if no element is greater than target

        while (start <= end) { 
            int mid = start + (end - start) / 2; 

            // If mid element is less than or equal to target, 
            // the upper bound must be in the right half.
            if (arr[mid] <= target) { 
                start = mid + 1; 
            } 
            // If mid element is strictly greater than target,
            // it is a candidate for upper bound. Search left half for smaller index.
            else { 
                ans = mid; 
                end = mid - 1; 
            } 
        } 
        return ans; 
    } 

    public static void main(String args[]) { 
        int arr[] = {10, 20, 30, 30, 30, 30, 30, 40, 50}; 
        int target = 40; 
        int ans = upperbound(arr, target); 
        System.out.print(ans); // Output will be 8 (index of 50)
    } 
}

