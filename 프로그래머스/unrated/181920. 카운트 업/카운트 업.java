class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        int a = start;
        for(int i = 0; i < answer.length; i++){
            answer[i] = a;
            a++;
        }
        return answer;
    }
}