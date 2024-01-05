import java.util.*;

class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for(int i = l; i<=r; i++) {
            String str = i + "";
            int count = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 48 || str.charAt(j) == 53) {
                    count ++;
                }
            }
            if(count == str.length()) {
                list.add(i);
            }
        }
        return list.size() == 0 ? List.of(-1) : list;
    }
}