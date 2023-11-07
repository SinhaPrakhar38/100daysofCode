class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int maxLength = 0;
        for (int i = 0; i < words.length; i++)
            if (words[i].length() > maxLength)
                maxLength = words[i].length();
        List<String> verticalWords = new ArrayList<>();
        for (int i = 0; i < maxLength; i++) {
            String str = "", spaces = "";
            for (int j = 0; j < words.length; j++) {
                if (i >= words[j].length())
                    spaces += " ";
                else {
                    str += spaces + words[j].charAt(i);
                    spaces = "";
                }
            }
            verticalWords.add(str);
        }
        return verticalWords;
    }
}
