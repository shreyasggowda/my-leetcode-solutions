1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n = nums.length;
4        int ts = 0;
5
6        for (int num : nums) {
7            ts += num;
8        }
9        int ans[] = new int[n];
10        int lS = 0;
11        for (int i = 0; i < n; i++) {
12            int rS = ts - lS - nums[i];
13            ans[i] = Math.abs(lS - rS);
14            lS += nums[i];
15        }
16        return ans;
17    }
18}