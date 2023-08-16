class Solution {
    public long solution(int price, int money, int count) {
      
        long total = 0; // long으로 변경하여 큰 값에 대응
        for (int i = 1; i <= count; i++) {
            total += price * i; // 각 구매 횟수별 가격을 누적 계산
        }
        
        if (total > money) {
            return total - money;
        } else {
            return 0;
        }
    }
}