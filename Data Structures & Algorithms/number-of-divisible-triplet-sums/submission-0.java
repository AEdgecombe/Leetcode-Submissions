class Solution {
    public int divisibleTripletCount(int[] nums, int d) {
        int solution = 0;
        int n = nums.length;

        if (n < 3) {
            return solution;
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                int rem = (int) (((long) nums[j] + nums[k]) % d);
                int needed = (d - rem) % d;
                solution += count.getOrDefault(needed, 0);
            }
            int rem = nums[j] % d;
            count.put(rem, count.getOrDefault(rem, 0) + 1);
        }

        return solution;
    }
}