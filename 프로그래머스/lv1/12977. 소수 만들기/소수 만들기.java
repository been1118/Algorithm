class Solution {
    public int solution(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum <= 1) {
                        continue;
                    }
                    boolean a = true;
                    for (int l = 2; l * l <= sum; l++) {
                        if (sum % l == 0) {
                            a = false;
                            break;
                        }
                    }
                    if (a) count++;
                }
            }
        }
    return count;
    }
}