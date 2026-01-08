package two_pointers;
import java.util.Arrays;

// problem link => https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/


public class leetcode167 {
    public static void main(String[] args) {
        int[] nums ={2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));

        
    }

    public static int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int sum = 0;

        while (start < end) {
            sum = nums[start] + nums[end];

            if(sum == target){
                return new int[]{start, end};
            }
            else if(sum < target){
                start++;
            }else{
                end--;
            }

        }
        return new int[]{-1, -1};
    }

}
