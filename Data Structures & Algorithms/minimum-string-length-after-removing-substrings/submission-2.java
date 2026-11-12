class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (!stack.isEmpty() && ((stack.peek() == 'A' && array[i] == 'B') || (stack.peek() == 'C' && array[i] == 'D'))) {
                stack.pop();
            } else {
                stack.push(array[i]);
            }
        }

        int solution = stack.size();
        return solution;
    }
}