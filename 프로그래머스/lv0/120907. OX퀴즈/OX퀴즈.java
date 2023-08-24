class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int num;
            if (arr[1].equals("+")) {
                num = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
            } else {
                num = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
            }
            answer[i] = num == Integer.parseInt(arr[4]) ? "O" : "X";
        }
        return answer;
    }
}