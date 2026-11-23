class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
      # Quick length check
        if len(s) != len(t):
            return False

        # 1. Count up characters in s
        count = {}
        for ch in s:
            count[ch] = count.get(ch, 0) + 1

        # 2. “Spend” counts on t
        for ch in t:
            if ch not in count or count[ch] == 0:
                return False
            count[ch] -= 1

        # 3. If we never ran out of any char, it’s an anagram
        return True