class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char ch = Character.forDigit(k, 10);
        for (int l = i; l <= j; l++) {
            String str = String.valueOf(l);
            for (int n = 0; n < str.length(); n++) {
                if (str.charAt(n) == ch) answer++;
            }
        }
        return answer;
    }
}