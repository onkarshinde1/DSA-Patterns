package two_pointers;
import java.util.Arrays;

public class leetcode977 {

    public static void main(String[] args) {
        int[] nums = { -5, -1, 0, 7, 10 };
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int i = 0;
        int j = n-1;
        int pos = n-1; 

        while(i <= j){
            int leftSq = nums[i] * nums[i];
            int rightSq = nums[j] * nums[j];

            if(leftSq > rightSq){
               ans[pos] = leftSq ;
                i++;
            }else{
                ans[pos] = rightSq;
                j--;
            }
            pos--;
        }
        return ans;
    }

}
