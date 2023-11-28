import java.util.*;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for (String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s + l));
            if (num > k) answer.add(num);
        }
        return answer;
    }
}