
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int best = 0;
        
        java.util.HashSet<Character> set = 
                 new java.util.HashSet<>();
        
        while(right < s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            best = Math.max(best, right - left + 1);
            right++; 
        }
        return best;
    }
}
