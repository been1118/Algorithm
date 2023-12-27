class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int tmp;
        for(int[] i : queries) {
            tmp = arr[i[1]];
            arr[i[1]] = arr[i[0]];
            arr[i[0]] = tmp;
        }
        return arr;
    }
}