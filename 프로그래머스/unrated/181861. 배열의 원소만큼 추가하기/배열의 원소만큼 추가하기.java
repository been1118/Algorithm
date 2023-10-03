import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = 0; j < num; j++) {
                intList.add(num);
            }
        }
        return intList;
    }
}