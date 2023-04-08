class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = 0;
        if(n>m) {
            min = m;
        } else {
            min = n;
        }
        for(int i=min; true; i--){
            if(m%i == 0 && n%i == 0){
                answer[0] = i;
                answer[1] = n*m / i;
                break;
            }
        }
        
        return answer;
    }
}