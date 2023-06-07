class Solution {
    public double solution(double price) {
   
        if (price >= 500000){
            price = price * (1-0.2);
            
        }else if(price >= 300000 ){
            price = price * (1-0.1);
            
        }else if (price >= 100000){
            price = price * (1-0.05);
        
    }
        return (int)price;
    }
    
}