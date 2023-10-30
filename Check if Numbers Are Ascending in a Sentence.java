class Solution {
    public boolean areNumbersAscending(String s) {
        int prevNum = 0;
        String[] strs = s.split(" ");
        for(String str : strs) {
            try {
                int num = Integer.parseInt(str);
                if(num > prevNum) {
                    prevNum = num;
                } else {
                    return false;
                }
            } catch(NumberFormatException ex) { }
        }
        return true;
    }
	
}
