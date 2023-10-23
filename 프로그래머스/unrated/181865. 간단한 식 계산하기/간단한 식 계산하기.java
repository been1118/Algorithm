import java.util.*;

class Solution {
    public int solution(String binomial) {
        StringTokenizer st = new StringTokenizer(binomial);
        int answer = Integer.parseInt(st.nextToken());
        String op = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        switch (op) {
            case "+" : 
                answer += b;
                break;
            case "-" : 
                answer -= b;
                break;
            case "*" : 
                answer *= b;
                break;
        }
        return answer;
    }
}