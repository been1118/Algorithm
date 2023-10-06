class Solution {
    public int solution(int[] num_list) {
        int o = 0;
        int e = 0;
        for (int i = 0; i < num_list.length; i++){
            int n = num_list[i];
            if (i % 2 == 0) e += n;
            else o += n;
        }
        return Math.max(o, e);
    }
}