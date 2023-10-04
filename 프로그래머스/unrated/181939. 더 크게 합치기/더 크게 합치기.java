class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        int abi = Integer.parseInt(ab);
        int bai = Integer.parseInt(ba);
        return abi >= bai ? abi : bai;
    }
}