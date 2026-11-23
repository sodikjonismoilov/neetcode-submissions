from typing import List
from collections import Counter

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = Counter(nums)  # Step 1: Count frequencies
        sorted_nums = sorted(freq, key=freq.get, reverse=True)  # Step 2: Sort by frequency
        return sorted_nums[:k]  # Step 3: Return top k
