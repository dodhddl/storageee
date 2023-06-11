import java.util.*;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if(sides[sides.length-1] <sides[sides.length-2]+sides[sides.length-3]){
            return 1;
        }else{
            return 2;
        }
    }
}