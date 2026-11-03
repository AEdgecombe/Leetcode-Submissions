class Solution {
    public List<String> generatePossibleNextMoves(String currentState) {
        ArrayList<String> solution = new ArrayList<>();

        char[] array = currentState.toCharArray();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == '+' && array[i + 1] == '+') {
                array[i] = '-';
                array[i + 1] = '-';
                solution.add(new String(array));
                array[i] = '+';
                array[i + 1] = '+';
            }
        }

        return solution;
    }
}