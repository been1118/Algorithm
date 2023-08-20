class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int length = answer.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (emergency[i] <= emergency[j]) answer[i]++;
            }
        }
        return answer;
    }
}