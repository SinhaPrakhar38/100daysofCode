class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        int a = 97;
        for(char c : key.toCharArray()){
            if(c == ' '){
                continue;
            }
            else{
                if(!map.containsKey(c)){
                    map.put(c, (char)a);
                    a++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c1 : message.toCharArray()){
            if(c1 != ' '){
                sb.append(map.get(c1));
            }
            else{
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
