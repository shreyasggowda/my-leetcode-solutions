class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int ts = 0;

        for (int num : nums) {
            ts += num;
        }
        int ans[] = new int[n];
        int lS = 0;
        for (int i = 0; i < n; i++) {
            int rS = ts - lS - nums[i];
            ans[i] = Math.abs(lS - rS);
            lS += nums[i];
        }
        return ans;
    }
}
