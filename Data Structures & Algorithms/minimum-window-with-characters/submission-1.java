class Solution {
    public String minWindow(String s, String t) {

        int left = 0; 
        int have = 0;

        int[] map = new int[128];
        int required = 0;
        

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (map[c] == 0) {
                required++; 
            }
            map[c]++;
        }


        int[] window = new int[128];
        // -------------------

        int bestLen = Integer.MAX_VALUE;
        int bestLeft = 0; 


        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right); 
            

            if (map[c] > 0) {
                window[c]++;


                if (window[c] == map[c]) {
                    have++;
                }
            }

            while (have == required) {
                if ((right - left + 1) < bestLen) {
                    bestLen = right - left + 1; 
                    bestLeft = left; 
                }
                
                char leftChar = s.charAt(left);
                

                if (map[leftChar] > 0) {
                    if (window[leftChar] == map[leftChar]) {
                        have--;
                    }
                    window[leftChar]--;
                }
                
                left++;
            }
        }

        return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestLeft, bestLeft + bestLen);
    }
}

