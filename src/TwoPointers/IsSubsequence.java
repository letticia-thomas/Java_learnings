package TwoPointers;
// https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150
// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
class IsSubsequence {
    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println("Result: " + isSubsequence.isSubsequence("a", "c"));
    }

    public boolean isSubsequence(String s, String t) {
        int start = 0;
        int i = 0;
        if (t.length() < s.length())
            return false;
        for (i = 0; i < s.length(); i++) {
            System.out.println("character to check: " + s.charAt(i));
            if (start == t.length()) {
                return false;
            }
            while (start < t.length()) {
                if (t.charAt(start) == s.charAt(i)) {
                    start++;
                    System.out.println("FOUND AT: " + start);
                    break;
                } else {
                    start++;
                    if (start == t.length()) {
                        return false;
                    }
                    
                }
            }
        }
        return true;
    }
}