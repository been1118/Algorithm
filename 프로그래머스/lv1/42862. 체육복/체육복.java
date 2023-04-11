class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        boolean[] visited = new boolean[lost.length];
        
        for(int i=0; i<reserve.length; i++){
            for(int j=0; j<lost.length; j++){
                if(!visited[j] && reserve[i] == lost[j]){
                    visited[j] = true;
                    answer++;
                    break;
                }
            }
        }
        for(int i=0; i<reserve.length; i++){
            for(int j=0; j<lost.length; j++){
                if(!visited[j] && reserve[i]+1 == lost[j]){
                    visited[j] = true;
                    answer++;
                    break;
                }else if(!visited[j] && reserve[i]-1 == lost[j]){
                    visited[j] = true;
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}