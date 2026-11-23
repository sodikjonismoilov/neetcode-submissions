



class Solution {
    public boolean isValid(String s) {

        java.util.Deque<Character> stack = new java.util.ArrayDeque<>();

        java.util.Map<Character, Character> closingChar = new java.util.HashMap<>();
        closingChar.put(')', '(');
        closingChar.put(']', '[');
        closingChar.put('}', '{');

    for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    if (closingChar.containsKey(c)){
        if(stack.isEmpty()) {
            return false;
        }
        char popedChar = stack.pop();

        if (closingChar.get(c) != popedChar) {
              return false;
         }

    } else {
        stack.push(c);
    }
}
 
 return stack.isEmpty();
        
    }
}
