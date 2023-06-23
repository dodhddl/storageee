class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int [str.length()];
        int count = 0;
        for(int i = answer.length-1; i >=  0; i--){
            
            answer[count] += Integer.parseInt(String.valueOf(str.charAt(i)));
                count++;
           
        }
        return answer;
    }
}