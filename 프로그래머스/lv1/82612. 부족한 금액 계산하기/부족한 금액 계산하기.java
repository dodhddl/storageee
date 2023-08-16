class Solution {
    public long solution(int price, int money, int count) {
       
        long total = price * (long)count * (count + 1) / 2; // 가우스의 덧셈 공식 사용
        if (money < total) {
            return total - money;
        } else {
            return 0;
        }
    }
}