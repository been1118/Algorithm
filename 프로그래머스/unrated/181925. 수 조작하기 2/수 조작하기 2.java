class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int length = numLog.length;
        for (int i = 0; i < length; i++) {
            if (i + 1 >= length) break;
            int num = numLog[i];
            int nextNum = numLog[i + 1];
            if (num + 1 == nextNum) answer += "w";
            else if (num - 1 == nextNum) answer += "s";
            else if (num + 10 == nextNum) answer += "d";
            else answer += "a";
        }
        return answer;
    }
}