class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cntp = 0;
        int cnty = 0;
        for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'p' || ch== 'P')
				cntp++;
			else if (ch == 'y' || ch == 'Y')
				cnty++;
		}
        if(cntp == cnty)return true;
        else return false;
    }
}