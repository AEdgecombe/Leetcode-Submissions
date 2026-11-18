class Solution {
    public long maximumSumScore(int[] nums) {
        long totalSum = 0;
        for (int x : nums) {
            totalSum += x;
        }

        long solution = Long.MIN_VALUE;
        long frontTotal = 0;

        for (int i = 0; i < nums.length; i++) {
            frontTotal += nums[i];
            long backTotal = totalSum - frontTotal + nums[i];
            solution = Math.max(solution, Math.max(frontTotal, backTotal));
        }

        return solution;
    }
}