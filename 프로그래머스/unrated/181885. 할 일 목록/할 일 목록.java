import java.util.*;

class Solution {
    public List<String> solution(String[] todo_list, boolean[] finished) {
        int length = todo_list.length;
        List<String> answer = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            if (!finished[i]) answer.add(todo_list[i]);
        }
        return answer;
    }
}