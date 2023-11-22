import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (s.substring(i + 1, length).contains(String.valueOf(ch)) || 
                s.substring(0, i).contains(String.valueOf(ch))) continue;
            answer += ch;
        }
        
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
        
        return answer;
    }
}