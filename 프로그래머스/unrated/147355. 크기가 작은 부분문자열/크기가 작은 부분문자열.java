class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum = p.length();
        for (int i = 0; i < t.length() - pNum + 1; i++) {
            String str = t.substring(i, p.length() + i);
            if (str.equals("")) break;
            long num = Long.parseLong(str);
            if (num <= Long.parseLong(p)) answer++;
        }
        return answer;
    }
}