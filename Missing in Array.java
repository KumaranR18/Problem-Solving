class Solution {
    public int missingNumber(int[] nums) {
        int n, sum1, sum2 = 0;
        n = nums.length;
        sum1 = n*(n+1)/2;
        for (int i=0; i<nums.length; i++){
            sum2 += nums[i];
        }
        return sum1 - sum2;
    }
}