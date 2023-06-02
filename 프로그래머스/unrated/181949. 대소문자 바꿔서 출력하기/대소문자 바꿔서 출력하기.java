import java.util.Scanner;

public class Solution {
     static String test(String str){
         
        String a = "";
         
        for(char c :str.toCharArray()){
            
            if(c>=97 && c<=122){
                a +=(char)(c-32);
        
            }else if(c>=65 && c<=90){
                a +=(char)(c+32);
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(test(a));
    }
}