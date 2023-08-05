class Solution {
    public int solution(String myString, String pat) {
        String str = "";
        for (int i = 0; i < myString.length(); i++) {
            str += myString.charAt(i) == 'A' ? "B" : "A";
        }
        int answer = str.contains(pat) ? 1 : 0;
        return answer;
    }
}