class Solution {
    public int solution(String s) {
        int answer = 0;
        char ch = s.charAt(0);
        int a = 1;
        int b = 0;
        int length = s.length();
        if (length == 1) {
            answer++;
        } else {
            for (int i = 1; i < length; i++) {
            if (ch == s.charAt(i)) a++;
            else b++;
            
            if (a == b) {
                answer++;
                if (i + 1 >= length) continue;
                else ch = s.charAt(i + 1);
            }
            
            if (a != b && i == length - 1) answer++;
            }
        }
        return answer;
    }
}