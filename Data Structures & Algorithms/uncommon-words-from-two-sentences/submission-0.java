class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> result = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        String[] wordsOne = s1.trim().split("\\s+");
        String[] wordsTwo = s2.trim().split("\\s+");

        for(String s : wordsOne){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for(String p : wordsTwo){
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for(String word : map.keySet()){
            if(map.get(word) == 1){
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
      


        // uncommon if occurence == 1 in one sentence, occurence == 0 in other


    }
}
