class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String str1 = phone_number.substring(0,phone_number.length()-4).replaceAll("[0-9]","*");
        String str2 = phone_number.substring(phone_number.length()-4);
        return str1+str2;
    }
}