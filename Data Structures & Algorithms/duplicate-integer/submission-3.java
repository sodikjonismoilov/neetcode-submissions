class Solution {
    public boolean hasDuplicate(int[] nums) {
         Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

//class Solution:
//     def hasDuplicate(self, nums: List[int]) -> bool:
//         seen = set()
//         for num in nums:
//             if num in seen:
//                 return True
//             seen.add(num)
//         return False