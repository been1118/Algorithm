import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (set.contains(ch)) {
                continue;
            } else {
                set.add(ch);
                answer += ch;
            }
        }
        
        return answer;
    }
}