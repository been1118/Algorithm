import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {

        List<Integer> list = new ArrayList<>();
        
        int temp = -1;
        
        for(int n : arr) {
            if(temp != n) list.add(n);
            temp = n;
        }

        return list;
    }
}

// public class Solution {
//     public int[] solution(int []arr) {
//         int j = 0; 
//         int[] temp = new int[arr.length];
//         for (int i = 0; i < arr.length -1; i++) {
//             if(arr[i] != arr[i+1]) {
//                 temp[j++] = arr[i];
//             }        
//         }
//         temp[j++] = arr[arr.length-1];

//         int[] answer = new int[j];
//         for (int i = 0; i < j; i++) {
//             answer[i] = temp[i];
//         }

//         return answer; 
//     }
// }