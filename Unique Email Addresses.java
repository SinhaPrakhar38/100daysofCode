class Solution {
    public int numUniqueEmails(String[] emails) {
        Set set = new HashSet<>();
        for(String s: emails)
    {
        String d[]=s.split("@");
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<d[0].length();i++)
        {
            
            if(d[0].charAt(i)=='+')
                break;
            if(d[0].charAt(i)!='.')
            ans=ans.append(d[0].charAt(i));       
        }
            ans.append("@");
            ans.append(d[1]);
        set.add(ans.toString());
    }
    return set.size(); 
    }
}
