import java.util.HashMap;

class WordPattern {
    
    public static void main(String[] args) {
        WordPattern obj = new WordPattern();
        obj.wordPattern("abba", "dog cat cat dog");
    }
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        String[] strSet = s.split(" ");
        int wordCount = strSet.length;
        int si = 0;
        int ci = 0;
        if (wordCount != pattern.length())
            return false;
        while (si < wordCount && ci < wordCount) {
            if (map.containsKey(pattern.charAt(ci))) {
                if (map.get(pattern.charAt(ci)).equals(strSet[si])) {
                    ci++;
                    si++;
                    continue;
                } else {
                    return false;
                }

            } else {
                if (map.containsValue(strSet[si])) {
                    return false;
                } else {
                    map.put(pattern.charAt(ci), strSet[si]);
                    si++;
                    ci++;
                }
            }
        }
        if(si==ci)
            return true;
        else
            return false;
    }
}