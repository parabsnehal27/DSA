import java.util.*;

class romanToDecimal {

    static int value(char c){
        
        if(c=='I' || c=='i'){
            return 1;
        }
        if(c=='V' || c=='v'){
            return 5;
        }
        if(c=='X' || c=='x'){
            return 10;
        }
        if(c=='L' || c=='l'){
            return 50;
        }
        return -1;
    }

    static int roman(String s){
        int res=0;
        
        for(int i=0;i<s.length();i++){
            int s1=value(s.charAt(i));
            
            if(i+1<s.length()){
                int s2=value(s.charAt(i+1));
                
                if(s1>=s2){
                    res+=s1;
                }
                else{
                    res+=(s2-s1);
                    i++;
                }
            }
            else{
                res+=s1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "Iv";
        System.out.println(roman(s));
    }
}