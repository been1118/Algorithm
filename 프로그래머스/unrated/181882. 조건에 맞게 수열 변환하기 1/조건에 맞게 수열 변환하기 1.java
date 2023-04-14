class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int a = arr[i];
            if(a >= 50 && a % 2 == 0) answer[i] = a/2;
            else if(a < 50 && a % 2 != 0) answer[i] = a*2;
            else answer[i] = a;
        }
        return answer;
    }
}