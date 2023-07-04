import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int count = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
                answer[count-1] = arr[i];


            }
        }

        if (count == 0) {
            return new int[]{-1};
        }

        return  Arrays.copyOfRange(answer,0,count);
        //return answer;
    }
}