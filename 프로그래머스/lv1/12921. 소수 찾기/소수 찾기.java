class Solution {
    public int solution(int n) {
        int answer = 0;
        loop1 :for(int i=2; i<=n; i++){
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i % j == 0 && !(i == j)){
                    continue loop1;
                }      
            }
            answer++;
        }
        return answer;
    }
}