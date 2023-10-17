class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int p=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(i%2==0)
            {
                p=p+(c-'0');
            }
            else
            {
                p=p-(c-'0');
            }
        }
        return p;
    }
}
