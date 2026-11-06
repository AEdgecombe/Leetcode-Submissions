class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int solution = 1;

        int increase = 1;
        int decrease = 1;
        int tempIncrease = 1;
        int tempDecrease = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                tempIncrease += 1;
                tempDecrease = 1;
            } else if (nums[i + 1] < nums[i]) {
                tempDecrease += 1;
                tempIncrease = 1;
            } else {
                tempIncrease = 1;
                tempDecrease = 1;
            }
            if (tempIncrease > increase) {
                increase = tempIncrease;
            }
            if (tempDecrease > decrease) {
                decrease = tempDecrease;
            }
        }

        if (increase > decrease) {
            return increase;
        } else {
            return decrease;
        }
    }
}