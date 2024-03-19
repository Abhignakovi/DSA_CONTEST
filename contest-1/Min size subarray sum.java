class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int res = 0;
        int j = 0;    
        int n = nums.length;  
        for (int i = 0; i < n; i++) {
            res += nums[i];
            while (res >= target) {
                minLength = Math.min(minLength, i - j + 1);
                res=res-nums[j];
                j++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}