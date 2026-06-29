
            boolean placed = false;

            for (int i = 0; i < n; i++) {

                if (!used[i] && baskets[i] >= fruit) {

                    used[i] = true;

                    placed = true;

                    break;

                }

            }

            if (!placed) {

                ans++;

            }

        }

        return ans;
        int ans = 0;

        for (int fruit : fruits) {

        boolean[] used = new boolean[n];
        int n = fruits.length;

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {


class Solution {
