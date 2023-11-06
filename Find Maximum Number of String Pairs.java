class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashMap<String, Integer> word_dict = new HashMap<>();
        int pairs = 0;
        for (String word : words) {
            String reversed_word = new StringBuilder(word).reverse().toString();
            if (word_dict.containsKey(reversed_word) && word_dict.get(reversed_word) > 0) {
                word_dict.put(reversed_word, word_dict.get(reversed_word) - 1);
                pairs++;
            }
            else {
                word_dict.put(word, word_dict.getOrDefault(word, 0) + 1);
            }
        }
        return pairs;        
    }
}
