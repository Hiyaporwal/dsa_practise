import java.util.*;

public class element {

    public static int[] array(int[] arr) {

        int n = arr.length;
        int[] target = new int[n];

        int pos = 0;
        int neg = 1;

        for (int i = 0; i < n; i++) {

            if (arr[i] > 0 && pos < n) {
                target[pos] = arr[i];
                pos += 2;
            }
            else if (arr[i] < 0 && neg < n) {
                target[neg] = arr[i];
                neg += 2;
            }
        }

        
        

        return target;
    }

    public static void main(String args[]) {
        int[] arr = { 3, 7, -2, -5, -6, 4, -3, 2};
        System.out.println(Arrays.toString(array(arr)));
    }
}