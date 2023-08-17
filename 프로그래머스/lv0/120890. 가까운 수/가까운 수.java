import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (Math.abs(n - answer) >= Math.abs(n - num)) {
                if (Math.abs(n - answer) == Math.abs(n - num))
                    answer = answer < num ? answer : num;
                else
                    answer = num;
            }
        }
        return answer;
    }
}