import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String num = String.valueOf(n);
        char[] c = num.toCharArray();
        
        Arrays.sort(c);
        
       StringBuilder reversedNumber = new StringBuilder(new String(c));
        reversedNumber.reverse();
        
        return Long.parseLong(reversedNumber.toString());
    }
}