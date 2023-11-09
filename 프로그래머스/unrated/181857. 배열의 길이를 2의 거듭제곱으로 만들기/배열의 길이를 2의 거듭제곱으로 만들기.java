class Solution {
    public int[] solution(int[] arr) {
        int num = 1;
        int length = arr.length;
        
        while (num < length) {
            num *= 2;
        }
        
        int[] answer = new int[num];
        for (int i = 0; i < length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}