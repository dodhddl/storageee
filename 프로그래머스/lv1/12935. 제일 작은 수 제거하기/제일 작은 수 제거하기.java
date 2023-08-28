import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        if (arr.length == 1) {
            answer = new int[]{-1};
        } else {
            int[] sortedArr = Arrays.copyOf(arr, arr.length); 
            Arrays.sort(sortedArr);
            
            int min = 0;
            for (int i = 0; i < sortedArr.length; i++) {
                if (sortedArr[i] < sortedArr[min]) {
                    min = i;
                }
            }
            
            int minValue = sortedArr[min];
            answer = new int[arr.length - 1];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != minValue) {
                    answer[index++] = arr[i];
                }
            }
        }
        return answer;
    }
}
