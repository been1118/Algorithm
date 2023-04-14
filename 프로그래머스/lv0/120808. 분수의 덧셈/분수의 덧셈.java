class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int a = numer1 * denom2 + numer2 * denom1;
        int b = denom1 * denom2;
        int min = 0;
        if(a > b) min += b;
        else min += a;
        for(int i = min; true; i--){
            if(a%i == 0 && b%i == 0){
                a /= i;
                b /= i;
            int[] answer = {a, b};
            return answer;
            }
            
        }
        
        
    }
}






















// class Solution {
//     public int[] solution(int numer1, int denom1, int numer2, int denom2) {
//         int mini = 0;
//         int bunja = numer1 * denom2 + numer2 * denom1;
//         int bunmo = denom1 * denom2;
//         if (bunja < bunmo){
//             mini += bunja;
//         } else {
//             mini += bunmo;
//         }
//         for(int i = mini; true; i--){
//             if (bunmo % i == 0 && bunja % i == 0){
//                 bunmo /= i;
//                 bunja /= i;
//                 int[] answer = {bunja, bunmo};
//                 return answer;
//             }
//         }

//     }
// }