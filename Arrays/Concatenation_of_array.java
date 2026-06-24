package Arrays;

/*CONCATENATION OF ARRAY
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
*/
import java.util.*;

public class Concatenation_of_array {
    public static int[] Concat(int[] nums, int n) {
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
    int res[]=Concatenation_of_array.Concat(nums, n);
    System.out.print("Output: ");
    for(int i:res){
        System.out.print(i+" ");
    }
    sc.close();
    }
}