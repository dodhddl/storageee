class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Character.getNumericValue(sb.charAt(i));
        }

        return answer;
    }
}