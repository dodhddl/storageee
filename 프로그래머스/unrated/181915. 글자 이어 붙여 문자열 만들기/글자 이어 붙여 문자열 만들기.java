class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < index_list.length; i++) {
            int index = index_list[i];
            if (index >= 0 && index < my_string.length()) {
                answer.append(my_string.charAt(index));
            }
        }
        return answer.toString();
    }
}