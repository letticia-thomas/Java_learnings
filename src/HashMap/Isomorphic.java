package HashMap;
// https://leetcode.com/problems/isomorphic-strings/description/?envType=study-plan-v2&envId=top-interview-150
// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

import java.util.HashMap;

class Isomorphic {

    public static void main(String[] args) {
        Isomorphic obj = new Isomorphic();
        obj.isIsomorphic("badc", "baba");
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        int si = 0;
        int ti = 0;
        while (si < s.length() && ti < s.length()) {
            if (map.containsKey(s.charAt(si))) {
                if (map.get(s.charAt(si)) == t.charAt(ti)) {
                    si++;
                    ti++;
                    continue;
                } else {
                    return false;
                }
            } else {
                if (!map.containsValue(t.charAt(ti))) {
                    map.put(s.charAt(si), t.charAt(ti));
                    si++;
                    ti++;
                } else
                    return false;
            }
        }
        if (si == ti) {
            return true;
        }
        return false;
    }
}