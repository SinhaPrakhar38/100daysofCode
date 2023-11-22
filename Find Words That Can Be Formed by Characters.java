class Solution {
    public int[] charFreq = new int[26];
    
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        for(char c : chars.toCharArray()) ++charFreq[c - 'a'];
        for(String word : words) if(isGood(word)) count += word.length();
		
        return count;
    }
    
    public boolean isGood(String word) {
        int[] localCharFreq = new int[26];
        for(char c : word.toCharArray()) ++localCharFreq[c - 'a'];
        for(int i = 0; i < 26; i++) if(localCharFreq[i] > charFreq[i]) return false;
		
        return true;
    }
}
