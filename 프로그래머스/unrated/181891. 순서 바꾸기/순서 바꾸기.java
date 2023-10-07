import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length];
        
        int[] a = Arrays.copyOfRange(num_list, n, length);
        int[] b = Arrays.copyOfRange(num_list, 0, n);
        
        int alength = a.length;
        
        for (int i = 0; i < alength; i++) {
            answer[i] = a[i];
            System.out.println(a[i]);
        }
        for (int i = alength, j = 0; i < length; i++, j++) {
            answer[i] = b[j];
        }
        
        return answer;
    }
}