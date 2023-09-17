class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            if (ch == 'a' || ch == 'A') answer += String.valueOf(ch).toUpperCase();
            else answer += String.valueOf(ch).toLowerCase();
        }
        return answer;
    }
}