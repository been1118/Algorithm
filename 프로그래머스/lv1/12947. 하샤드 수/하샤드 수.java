class Solution {
    public boolean solution(int x) {
        boolean answer;
        int sum = 0;
        int x2 = x;
        while(x > 0){
            sum += x%10;
            x /= 10;
        }
        answer = x2 % sum == 0;
        return answer;
    }
}