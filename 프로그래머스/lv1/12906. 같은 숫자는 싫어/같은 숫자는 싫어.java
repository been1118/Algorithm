import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        HashSet set = new HashSet();
        
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        return set;
    }
}