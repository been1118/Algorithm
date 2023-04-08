class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int min = 0;
        int max = 0;
        int cnt = 0;
        int cnt2 = 0;
        for(int zero : lottos){
            if(zero == 0) cnt++;
        }
        for(int i=0; i<lottos.length; i++){
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j])cnt2++;
            }
        }
        max = (cnt2+cnt)>1 ? 7-(cnt2+cnt) : 6;
        min = cnt2 > 1 ? 7-cnt2 : 6;
        int[] answer ={max, min};
        return answer;
    }
}








//로또 1등 당첨되고 싶다.
//진심이다..