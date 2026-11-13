class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] word = word1.toCharArray();
        char[] wordTwo = word2.toCharArray();

        StringBuilder sb = new StringBuilder();

        int minLen = Math.min(word1.length(), word2.length());

        for (int i = 0; i < minLen; i++) {
            sb.append(word[i]);
            sb.append(wordTwo[i]);
        }

        if (word1.length() < word2.length()) {
            for (int j = minLen; j < wordTwo.length; j++) {
                sb.append(wordTwo[j]);
            }
            String result = sb.toString();
            return result;
        } else {
            for (int k = minLen; k < word.length; k++) {
                sb.append(word[k]);
            }
            String result2 = sb.toString();
            return result2;
        }
    }
}