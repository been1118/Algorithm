class Solution {
    public int solution(int[] num_list) {
        String o = "";
        String e = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) o += String.valueOf(num_list[i]);
            else e += String.valueOf(num_list[i]);
        }
        int answer = Integer.parseInt(o) + Integer.parseInt(e);
        return answer;
    }
}