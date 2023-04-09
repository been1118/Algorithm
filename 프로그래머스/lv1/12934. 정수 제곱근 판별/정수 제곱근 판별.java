class Solution {
    public long solution(long n) {
        long answer = 0;
        if((long)Math.sqrt(n)*Math.sqrt(n) == n) answer += (Math.sqrt(n)+1) * (Math.sqrt(n)+1);
        else return -1;
        return answer;
    }
}