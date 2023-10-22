import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        while (n != 1) {
            answer.add(n);
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }
        answer.add(1);
        return answer;
    }
}