import java.util.HashMap;

class RansomNote {
    public static void main(String[] args) {
        RansomNote obj = new RansomNote();
        obj.canConstruct("aab", "baa");
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> charSet = new HashMap<Character, Integer>();
        for (int i = 0; i < magazine.length(); i++) {
            if (charSet.containsKey(magazine.charAt(i))) {
                charSet.put(magazine.charAt(i), charSet.get(magazine.charAt(i)) + 1);
            } else
                charSet.put(magazine.charAt(i), 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (charSet.containsKey(ransomNote.charAt(i))) {
                charSet.put(ransomNote.charAt(i), charSet.get(ransomNote.charAt(i)) - 1);
                if (charSet.get(ransomNote.charAt(i)) == 0)
                    charSet.remove(ransomNote.charAt(i));
                continue;
            } else
                return false;
        }
        return true;
    }
}