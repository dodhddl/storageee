class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int sum1 = 0;
        int sum2 = 0;
        for( int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' ||s.charAt(i) == 'P'){
                sum1++;
            }else if(s.charAt(i) == 'y' ||s.charAt(i) == 'Y'){
                 sum2++;
            }
        }if(sum1 == 0 && sum2 == 0){
            return true;
        }else if( sum1 != sum2){
            return false;
        }else if(sum1 == sum2){
            return true;
        }
        else
            return false;
    }
}