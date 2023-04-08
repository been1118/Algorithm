public class Solution {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                String s1 = strings[i];
                String s2 = strings[j];
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);
                if (c1 > c2) {
                    strings[i] = s2;
                    strings[j] = s1;
                    s1 = s2;
                    c1 = c2;
                }
                if (c1 == c2) {
                    int k = 0;
                    while (k < s1.length() && k < s2.length()) {
                        char ck1 = s1.charAt(k);
                        char ck2 = s2.charAt(k);
                        if (ck1 > ck2) {
                            strings[i] = s2;
                            strings[j] = s1;
                            break;
                        } else if (ck1 < ck2) {
                            break;
                        } else {
                            k++;
                        }
                    }
                }
            }
        }
        return strings;
    }
}
