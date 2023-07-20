import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[][] intList = new int[1001][2];
        for(int i = 0; i < array.length; i++) {
            int num = array[i];
            intList[num][0]++;
            intList[num][1] = num;
        }
        Arrays.sort(intList, (o2, o1) -> {
            if (o1[0] == o2[0])  return o1[1] - o2[1];
            else return o1[0] - o2[0];
        });
        if (intList[0][0] == intList[1][0]) return -1;
        else return intList[0][1];
    }
}