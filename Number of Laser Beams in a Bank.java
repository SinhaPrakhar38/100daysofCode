class Solution {
    public int numberOfBeams(String[] bank) {
        int pOnes=0; int res=0;
        for(String s: bank){
            int count=0;
            for(char ch: s.toCharArray()){
                if(ch=='1'){
                    count++;
				}
            }
           if(count>0){
                res+=(count*pOnes);
                pOnes=count;
            }
        }
        return res;
    }
}
