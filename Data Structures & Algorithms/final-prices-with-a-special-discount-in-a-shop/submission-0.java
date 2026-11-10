class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> priceStack = new Stack<>();
        int[] solution = prices.clone();

        for (int i = 0; i < prices.length; i++) {
            while (!priceStack.isEmpty() && prices[i] <= prices[priceStack.peek()]) {
                int previous = priceStack.pop();
                solution[previous] = solution[previous] - prices[i];
            }
            priceStack.push(i);
        }

        return solution;
    }
}