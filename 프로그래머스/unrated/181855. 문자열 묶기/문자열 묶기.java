import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] ints = new int[30];
        for (String s : strArr) {
            ints[s.length() - 1]++;
        }
        
        Arrays.sort(ints);
        int answer = ints[29];
        return answer;
    }
}