class Solution {
    public int countSubstrings(String s, String t) {
        char[] cs = s.toCharArray();
	char[] ct = t.toCharArray();

	int total = 0;
	for (int i = 0 ; i < cs.length; ++i) {
		for (int j = 0 ; j < ct.length ; ++j) {

			if (cs[i] == ct[j]) continue;

			int left = 0;
			int x = i-1, y = j-1;
			while(x >= 0 && y >= 0) {
				if (cs[x--] == ct[y--])
					++left;
				else
					break;
			}

			int right = 0;
			x = i+1;
			y = j+1;
			while(x < cs.length && y < ct.length) {
				if (cs[x++] == ct[y++])
					++right;
				else
					break;
			}

			total += (left + 1) * (right + 1);
		}
	}
	return total;
    }
}
