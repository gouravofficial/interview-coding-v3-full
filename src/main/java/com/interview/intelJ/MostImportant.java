package com.interview.intelJ;
public class MostImportant {

    public static void main(String[] args) {
        int key = 7;
        int nums[] = {2,3,1,2,4,3};
        //Output: 2
        //Explanation: The subarray [4,3] has the minimal length under the problem constraint.
        System.out.println(minSubArrayLen(7, nums));
    }

    public static int minSubArrayLen(int key, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= key) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
