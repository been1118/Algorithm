import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] temp = new int[n * (n-1) / 2];
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                temp[index++] = numbers[i] + numbers[j];
            }
        }
        Arrays.sort(temp);
        int[] answer = new int[temp.length];
        index = 0;
        answer[index++] = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] != temp[i-1]) {
                answer[index++] = temp[i];
            }
        }
        return Arrays.copyOf(answer, index);
    }
}