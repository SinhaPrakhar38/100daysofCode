class Solution {

public List<List<Integer>> largeGroupPositions(String s) {
    List<List<Integer>> res = new ArrayList<>();
    int i = 0;
    int len = s.length();
    while(i < len){
        char ch = s.charAt(i);
        
        int j = i;
        while(j < len && ch == s.charAt(j)){
            j++;
        }
        if(j - i >= 3){
            List<Integer> list = new ArrayList<>();
            list.add(i);
            list.add(j - 1);
            res.add(list);
        }
        i = j;
    }
    return res;
}
}
