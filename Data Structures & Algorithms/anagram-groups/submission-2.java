class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 1. Create the Map
        java.util.Map<String, java.util.List<String>> map = new java.util.HashMap<>();

        for (String word : strs) {
            // 2. Transform the word into a sorted key
            char[] chars = word.toCharArray();
            java.util.Arrays.sort(chars);
            String sortedKey = new String(chars);

            // 3. Ensure the box exists
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new java.util.ArrayList<>());
            }

            // 4. Store the original word
            map.get(sortedKey).add(word);
        }

        // 5. Return the grouped lists
        return new java.util.ArrayList<>(map.values());
    }
}