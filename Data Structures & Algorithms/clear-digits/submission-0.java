class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < array.length; i++){
            if(Character.isDigit(array[i])){
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(array[i]);
            }
        }

        for(char c : stack){
            sb.append(c);
        }

        String solution = sb.toString();
        return solution;
    }
}