class Solution {
    public int[] replaceElements(int[] arr) {
        int[] solution = arr.clone();
        for(int i = 0; i < solution.length; i++){
            if(i == solution.length -1){
                solution[i] = -1;
                break;
            }
            int maxVal = arr[i + 1];
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > maxVal){
                    maxVal = arr[j];
                }
            }
            solution[i] = maxVal;
        }
        return solution;
    }
}