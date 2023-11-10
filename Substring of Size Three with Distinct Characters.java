class Solution {
    public int countGoodSubstrings(String s) {
    int cnt[] = new int[123], repeat = 0, res = 0;
    for(int i = 0; i < s.length(); ++i) {
        repeat += cnt[s.charAt(i)]++ == 1 ? 1 : 0;
        repeat -= i >= 3 && cnt[s.charAt(i - 3)]-- == 2 ? 1 : 0;
        res += i >= 2 && repeat == 0 ? 1 : 0;
    }    
    return res;
    }
}
