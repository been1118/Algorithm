import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (answer[0] < num) {
                answer[0] = num;
                answer[1] = i;
            }
        }
        return answer;
    }
}