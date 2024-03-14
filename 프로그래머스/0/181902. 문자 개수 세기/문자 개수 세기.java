class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            int ch = my_string.charAt(i);
            if (ch <= 90) answer[ch - 65]++; 
            else answer[ch - 71]++;
        }
        return answer;
    }
}