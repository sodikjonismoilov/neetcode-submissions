class Solution {
    public int longestConsecutive(int[] nums) {
        //a sequence of nothing is 0 
        if (nums == null || nums.length == 0) {
            return 0;
        }

        //throw all the numbers into the pool 
        //this will give us O(1) instant lookup and removes dups 
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

       // 2. Iterate through the pool to find sequences
        for (int num : set) {
            
            // 3. The Gatekeeper: Is this the true start of a sequence?
            if (!set.contains(num - 1)) {
                // We found a start! Begin counting.
                int currentNum = num;
                int currentStreak = 1;

                // 4. Count upwards as long as the next number exists in the pool
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // 5. Record the longest sequence found so far
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
