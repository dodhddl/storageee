class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer += i;
                 return "김서방은 "+ answer +"에 있다" ;
            }
        }return "김서방 못찾음";
    }
      
    }

