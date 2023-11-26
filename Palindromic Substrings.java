class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {

            count += palindromeCount(s, i, i); 
            count += palindromeCount(s, i, i + 1);
        }
        
        return count;     
    }
    
    public int palindromeCount(String str, int leftPointer, int rightPointer) {
        int count = 0;
        while(leftPointer >= 0 && rightPointer < str.length() && 
                  str.charAt(leftPointer) == str.charAt(rightPointer)) {
                count++;
                leftPointer--;
                rightPointer++;
        }
        
        return count;
    }
}
