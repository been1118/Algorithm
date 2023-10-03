class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int num = 0;
        for (int i = 0; i < answer.length; i++) {
            while (num <= n) {
                num++;
                if (num % k == 0) {
                    answer[i] = num;
                    break;
                }
            }
        }
        return answer;
    }
}