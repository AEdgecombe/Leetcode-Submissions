class Solution {
    public int[] elementInNums(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] solution = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long minute = queries[i][0];
            int index = queries[i][1];

            int cycleMinute = (int) (minute % (2 * n));

            int len;
            int valueIndex;

            if (cycleMinute <= n) {
                len = n - cycleMinute;

                if (index >= len) {
                    solution[i] = -1;
                } else {
                    valueIndex = cycleMinute + index;
                    solution[i] = nums[valueIndex];
                }
            } else {
                len = cycleMinute - n;

                if (index >= len) {
                    solution[i] = -1;
                } else {
                    valueIndex = index;
                    solution[i] = nums[valueIndex];
                }
            }
        }
        return solution;
    }}
