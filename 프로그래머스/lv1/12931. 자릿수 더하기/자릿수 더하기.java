import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public int solution(int n) {
        int [] answer = Stream.of(String.valueOf(n).split(""))
	       .mapToInt(Integer::parseInt)
               .toArray();
        
        int sum = 0;
        for(int i = 0; i<answer.length; i++){
            sum += answer[i];
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
       

    return sum;
        
    }
}