// Two Pointer Approach of finding if s is a subsequence of t, remebering that you can always use the AND condition to compare the 2 pointers, s and t
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; 
            }
            j++; 
        }

        return i == s.length();
    }
}