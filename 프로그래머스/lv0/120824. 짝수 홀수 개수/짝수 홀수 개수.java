class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i = 0; i<num_list.length; i++){
            int a = (num_list[i]%2 == 0) ? 0:1;
            answer[a] += 1;
        }
        return answer;
    }
}
