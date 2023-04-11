class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        String[] ejin = new String[arr1.length];
        for(int i=0; i<n; i++){
            ejin[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            ejin[i] = ejin[i].replace('0', ' ');
            ejin[i] = ejin[i].replace('1', '#');
            while(ejin[i].length() < n){
                ejin[i] = ' ' + ejin[i];
                
            }
        }
        
        return ejin;
    }
}