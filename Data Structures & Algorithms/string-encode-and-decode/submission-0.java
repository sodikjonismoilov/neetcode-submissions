class Solution {
    //encodes a list of strings to a single string
    public String encode(List<String> strs) {
    //StringBuilder is used because concatenating strings in a loop
    //with "+" wastes memory
    StringBuilder encodedString = new StringBuilder();

    for (String word : strs) {
        //append length, then the delimiter '_' then the word itself
        encodedString.append(word.length()).append('_').append(word);
    }
    return encodedString.toString();

    }
 //decodes a single string to a list of strings.
    public List<String> decode(String s) {
        java.util.List<String> decodedWords = new java.util.ArrayList<>();
        int i = 0;
        //our main pointer, tracking our overall position in the string
        while(i < s.length()) {
            int j = i; //send out the scout pointer
           //1. Find the boundary
            while (s.charAt(j) != '_') {
                j++;
            }
        // 2. Extract the length
        int length = Integer.parseInt(s.substring(i, j));

        //3. capture the word
        int wordStart = j + 1;
        int wordEnd = wordStart + length;

        decodedWords.add(s.substring(wordStart, wordEnd));

        //4. Leap to the next word
        //move the main pointer to the exact start of the new encoded block
        i = wordEnd;
    }

    return decodedWords;

    }
}
